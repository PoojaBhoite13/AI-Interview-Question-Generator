package com.entity;

import jakarta.persistence.*;

@Entity
public class InterviewQuestionHistory {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String technology;
    String experiencelevel;
    int questioncount;
    @Column(columnDefinition = "TEXT")
    String questions;

    public InterviewQuestionHistory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }
}
