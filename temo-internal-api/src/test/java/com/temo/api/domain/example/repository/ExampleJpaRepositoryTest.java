package com.temo.api.domain.example.repository;

import com.temo.api.domain.example.entity.Example;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Rollback(value = false)
class ExampleJpaRepositoryTest {

    @Autowired
    private ExampleJpaRepository exampleJpaRepository;

    @Test
    public void createExamle() {
        Example example = new Example();
        example.setName("생성 테스트");
        example.setModule("API");

        exampleJpaRepository.save(example);
    }
}