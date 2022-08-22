package com.example.crud1.selfAppraisal;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.utilities.controllers.UdfConverter;
import com.fasterxml.jackson.databind.JsonNode;

@Entity
@Table(name="self_appraisal")
public class SelfAppraisalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @Column(name = "user_id")
    public int userId;

    @Column(name = "accomplishment", columnDefinition = "json")
    @Convert(converter = UdfConverter.class)
    private JsonNode accomplishment;

    @Column(name = "goal", columnDefinition = "json")
    @Convert(converter = UdfConverter.class)
    private JsonNode goal;

    @Column(name = "workshop", columnDefinition = "json")
    @Convert(converter = UdfConverter.class)
    private JsonNode workshop;

    @Column(name = "project", columnDefinition = "json")
    @Convert(converter = UdfConverter.class)
    private JsonNode project;

    @Column(name = "issue", columnDefinition = "json")
    @Convert(converter = UdfConverter.class)
    private JsonNode issue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public JsonNode getAccomplishment() {
        return accomplishment;
    }

    public void setAccomplishment(JsonNode accomplishment) {
        this.accomplishment = accomplishment;
    }

    public JsonNode getGoal() {
        return goal;
    }

    public void setGoal(JsonNode goal) {
        this.goal = goal;
    }

    public JsonNode getWorkshop() {
        return workshop;
    }

    public void setWorkshop(JsonNode workshop) {
        this.workshop = workshop;
    }

    public JsonNode getProject() {
        return project;
    }

    public void setProject(JsonNode project) {
        this.project = project;
    }

    public JsonNode getIssue() {
        return issue;
    }

    public void setIssue(JsonNode issue) {
        this.issue = issue;
    }



    // Table: self_appraisal
    // Columns:
    // id int AI PK 
    // accomplishment json 
    // project json 
    // workshop json 
    // issue json 
    // goal json 
    // user_id int

}
