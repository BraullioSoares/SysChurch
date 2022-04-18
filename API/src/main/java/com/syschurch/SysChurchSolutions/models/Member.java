package com.syschurch.SysChurchSolutions.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "document")
    private String document;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birth_day")
    private Date birthday;

    @Column(name = "membership_date")
    private Date membershipDate;

    @Column(name = "role")
    private String role;

    @Column(name = "address")
    private String address;

    @Column(name = "marital_state")
    private String maritalState;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "is_baptizied")
    private Boolean isBaptizedOnHolySpirit;

    public Member() {

    }

    public Member(String name, String lastName, String document, String gender, Date birthday, Date membershipDate, String role, String address, String maritalState, String phone, String email, Boolean isBaptizedOnHolySpirit) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.gender = gender;
        this.birthday = birthday;
        this.membershipDate = membershipDate;
        this.role = role;
        this.address = address;
        this.maritalState = maritalState;
        this.phone = phone;
        this.email = email;
        this.isBaptizedOnHolySpirit = isBaptizedOnHolySpirit;
    }
}
