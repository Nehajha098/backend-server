package com.hobby.predictor.model;

import jakarta.persistence.*;

@Entity
@Table(name="user_responses")
public class UserResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Long studentId;
    private Integer collegeYear;
    private String hobbytop1;
    private String clubtop1;
    private String readsbooks;

    private Double predictHours;

    public UserResponse(Long id, String name, String email, Long studentId, int collegeYear, String hobbytop1, String clubtop1, String readsbooks, double predictHours) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.studentId = studentId;
        this.collegeYear = collegeYear;
        this.hobbytop1 = hobbytop1;
        this.clubtop1 = clubtop1;
        this.readsbooks = readsbooks;
        this.predictHours = predictHours;
    }

    public UserResponse() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public int getCollegeYear() {
        return collegeYear;
    }

    public void setCollegeYear(int collegeYear) {
        this.collegeYear = collegeYear;
    }

    public String getHobbytop1() {
        return hobbytop1;
    }

    public void setHobbytop1(String hobbytop1) {
        this.hobbytop1 = hobbytop1;
    }

    public String getClubtop1() {
        return clubtop1;
    }

    public void setClubtop1(String clubtop1) {
        this.clubtop1 = clubtop1;
    }

    public String getReadsbooks() {
        return readsbooks;
    }

    public void setReadsbooks(String readsbooks) {
        this.readsbooks = readsbooks;
    }

    public double getPredictHours() {
        return predictHours;
    }

    public void setPredictHours(double predictHours) {
        this.predictHours = predictHours;
    }
}
