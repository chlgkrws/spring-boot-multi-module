package com.temo.api.domain.example.repository;

import com.temo.api.domain.example.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleJpaRepository extends JpaRepository<Example, Integer> {

}

