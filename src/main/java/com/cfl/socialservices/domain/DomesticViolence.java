package com.cfl.socialservices.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DomesticViolence {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer studentId;

    private Integer question_1;

    private Integer question_2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getQuestion_1() {
        return question_1;
    }

    public void setQuestion_1(Integer question_1) {
        this.question_1 = question_1;
    }

    public Integer getQuestion_2() {
        return question_2;
    }

    public void setQuestion_2(Integer question_2) {
        this.question_2 = question_2;
    }


}
