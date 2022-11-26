package com.syschurch.SysChurchSolutions.models;

import java.sql.Date;


public class Member {

    private long id;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getMembershipDate() {
        return membershipDate;
    }

    public void setMembershipDate(Date membershipDate) {
        this.membershipDate = membershipDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaritalState() {
        return maritalState;
    }

    public void setMaritalState(String maritalState) {
        this.maritalState = maritalState;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getBaptizedOnHolySpirit() {
        return isBaptizedOnHolySpirit;
    }

    public void setBaptizedOnHolySpirit(Boolean baptizedOnHolySpirit) {
        isBaptizedOnHolySpirit = baptizedOnHolySpirit;
    }
}
