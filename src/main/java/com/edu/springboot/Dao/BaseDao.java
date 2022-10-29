package com.edu.springboot.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseDao<T,ID> extends JpaRepository<T,ID> {

}
