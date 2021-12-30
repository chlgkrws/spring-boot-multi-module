package com.temo.api.domain.example.entity;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@SpringBootTest
@Transactional
class ExampleTest {

    @PersistenceContext
    private EntityManager em;

    private JPAQueryFactory queryFactory;

    @BeforeEach
    public void setQueryFactory() {
        queryFactory = new JPAQueryFactory(em);
    }

    @Test
    public void queryDslTest() {
        QExample qExample = QExample.example;

        List<Example> fetch = queryFactory
                .selectFrom(qExample)
                .fetch();

        System.out.println("fetch = " + fetch);
    }
}