package com.example.demo;

public class Persons {

	private String name;
	private Integer age;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Persons [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
}
