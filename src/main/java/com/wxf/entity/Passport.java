package com.wxf.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Passport {
    private Integer id;
    private String nationality;
    private Date expire;
    private Integer passenger_id;
    private Passenger passenger;

}
