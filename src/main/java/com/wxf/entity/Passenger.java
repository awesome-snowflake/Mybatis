package com.wxf.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Passenger {
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
    private Passport passport;
}
