package com.syschurch.SysChurchSolutions.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@NoArgsConstructor
public class MemberDto {

    private String name;
    private String lastName;
    private String documentId;
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
