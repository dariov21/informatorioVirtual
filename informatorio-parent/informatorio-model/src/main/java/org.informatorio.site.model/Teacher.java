package org.informatorio.site.model;


public class Teacher {
	private String name;
	private String surName;
	private String email;
	private Integer phone;
    private Integer age;
    private String address;
    private Long id;

    public Teacher() {
    }

    public Teacher(Long id){

        this.setId(id);
    }

    public Teacher(String surname, String name, Integer age, String address, String email, Integer phone) {
        this.surName = surname;
        this.name = name;
        this.setAge(age);
        this.setAddress(address);
        this.setPhone(phone);
        this.setEmail(email);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
