package org.informatorio.site.model;


public class Student {
	private String name;
	private String surname;
    private Integer age;
	private String address;
	private Integer phone;
	private String email;
    private Long id;

    public Student() {
    }

    public Student(Long id){

        this.setId(id);
    }

    public Student(String surname, String name, Integer age, String address, String email, Integer phone) {
        this.surname = surname;
        this.name = name;
        this.setAge(age);
        this.setAddress(address);
        this.setPhone(phone);
        this.setEmail(email);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
