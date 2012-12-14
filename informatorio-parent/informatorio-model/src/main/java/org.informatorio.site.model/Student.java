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

    public Student(String surname, String name, Integer age, String address, String email, Integer phone) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge(Integer age) {
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


}
