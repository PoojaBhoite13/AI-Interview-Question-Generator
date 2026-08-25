package com.dto;

public class InterviewQuestionDTO {
    String technology;
    String experiencelevel;
    int questioncount;

    public InterviewQuestionDTO() {
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getExperiencelevel() {
        return experiencelevel;
    }

    public void setExperiencelevel(String experiencelevel) {
        this.experiencelevel = experiencelevel;
    }

    public int getQuestioncount() {
        return questioncount;
    }

    public void setQuestioncount(int questioncount) {
        this.questioncount = questioncount;
    }
}
