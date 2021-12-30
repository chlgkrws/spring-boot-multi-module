package com.temo.api.domain.example.service;

import com.temo.api.domain.example.entity.Example;
import com.temo.api.domain.example.repository.ExampleJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleJpaRepository exampleJpaRepository;

    public Example getExample(Integer id) {
        Example example = exampleJpaRepository.findById(id).orElseThrow();

        return example;
    }

}
