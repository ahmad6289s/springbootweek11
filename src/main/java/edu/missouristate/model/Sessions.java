package edu.missouristate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sessions")
public class Sessions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String studentName;
    private String course;
    private String topic;
    private String visitDate;
    private String status;

    public Sessions() {
    }

    public Long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public String getTopic() {
        return topic;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}