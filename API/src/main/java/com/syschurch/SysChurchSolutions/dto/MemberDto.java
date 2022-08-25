package com.syschurch.SysChurchSolutions.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;


@Data
@Builder
public class MemberDto {

    private String name;
    private String lastName;
    private String document;
    private String gender;
    private Date birthday;
    private Date membershipDate;
    private String role;
    private String address;
    private String maritalState;
    private String phone;
    private String email;
    private Boolean isBaptizedOnHolySpirit;
}
