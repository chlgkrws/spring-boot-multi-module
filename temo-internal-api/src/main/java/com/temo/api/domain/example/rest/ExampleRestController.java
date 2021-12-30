package com.temo.api.domain.example.rest;

import com.temo.api.domain.example.dto.ExampleDto;
import com.temo.api.domain.example.entity.Example;
import com.temo.api.domain.example.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/examples")
@RequiredArgsConstructor
public class ExampleRestController {

    private final ExampleService exampleService;

    @GetMapping("/{id}")
    public ResponseEntity getExample(@PathVariable Integer id) {

        Example example = exampleService.getExample(id);

        ExampleDto result = example.of(example);

        return ResponseEntity.ok().body(result);
    }
}
