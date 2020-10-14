package com.wxf.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Department {
    private Integer id;
    private String name;
    private String location;
    private List<Employee> employee;
}
