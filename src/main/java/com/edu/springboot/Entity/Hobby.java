package com.edu.springboot.Entity;

import javax.persistence.*;


@Entity
public class Hobby {
    @Id // 设置HobbyId为主键
    @GeneratedValue(strategy = GenerationType.AUTO)  // 设置主键自增规则
    private Long Hobbyid;
    private String Name;

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
