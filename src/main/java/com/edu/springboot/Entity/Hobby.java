package com.edu.springboot.Entity;

import javax.persistence.*;


@Entity
public class Hobby {
    @Id // 设置HobbyId为主键
    @GeneratedValue(strategy = GenerationType.AUTO)  // 设置主键自增规则
    private Long Hobbyid;
    private String Name;
    /*// 爱好与学生是多对一的关系
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // 设置外键
    @JoinColumn(name = "student_id")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }*/

    public Long getHobbyId() {
        return Hobbyid;
    }

    public void setHobbyId(Long hobbyId) {
        Hobbyid = hobbyId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
