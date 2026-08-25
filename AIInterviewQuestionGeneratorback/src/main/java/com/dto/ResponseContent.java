package com.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseContent {
    List<ResponseParts> parts = new ArrayList<>();

    public ResponseContent() {
    }

    public ResponseContent(List<ResponseParts> parts) {
        this.parts = parts;
    }

    public List<ResponseParts> getParts() {
        return parts;
    }

    public void setParts(List<ResponseParts> parts) {
        this.parts = parts;
    }
}
