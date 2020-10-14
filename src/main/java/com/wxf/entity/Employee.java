package com.wxf.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private Integer dept_id;
    private Department department;
}
