package com.edu.springboot.Dao;

import com.edu.springboot.Entity.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyDao extends JpaRepository<Hobby,Long> {
}
