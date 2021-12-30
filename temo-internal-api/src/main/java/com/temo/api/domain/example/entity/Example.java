package com.temo.api.domain.example.entity;

import com.temo.api.domain.example.dto.ExampleDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Example {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String module;


    public ExampleDto of(Example example) {
        ExampleDto of = new ExampleDto();

        of.setId(example.getId());
        of.setName(example.getName());
        of.setModule(example.getModule());

        return of;
    }
}
