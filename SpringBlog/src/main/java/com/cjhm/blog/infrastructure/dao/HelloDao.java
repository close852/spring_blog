package com.cjhm.blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjhm.blog.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer> {

}
