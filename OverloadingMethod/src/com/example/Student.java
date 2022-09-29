package com.example;

public class Student {

	private int id;
	private String name;
	private int age;
	private String courese;
	private double score;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, double score) {
		super();

	}

	public Student(int id, String name, int age, double score, String courese) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
		this.courese = "BTech";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getCourese() {
		return courese;
	}

	public void setCourese(String courese) {
		this.courese = courese;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", courese=" + courese + ", score=" + score
				+ "]";
	}

}
