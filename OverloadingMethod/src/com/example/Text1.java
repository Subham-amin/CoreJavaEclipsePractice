package com.example;

import java.util.Scanner;

public class Text1 {
	static void displayStudent(Student[] s) {
		for (Student obj : s) {
			System.out.println(
					"Name = " + obj.getName() + ",  Course - " + obj.getCourese() + ",  Score = " + obj.getScore());
		}

	}

	static void displayStudent(Student[] s, double marks) {
		for (Student obj : s)
			if (obj.getScore() >= marks) {
				System.out.println(
						"Name = " + obj.getName() + ",  Course - " + obj.getCourese() + ",  Score = " + obj.getScore());
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[5];
		s[0] = new Student(100, "Subham Amin", 25, 90.2, "MTech");
		s[1] = new Student(101, "Somnath Hazra", 24, 85.7, "BTech");
		s[2] = new Student(102, "Sweta Das", 23, 92, "BCA");
		s[3] = new Student(103, "Sweety Banerjee", 23, 90.9, "MCA");
		s[4] = new Student(104, "Sudip Das", 23, 86, "MTech");
		int ch;
		System.out.println("Enter 1 To See All Students");
		System.out.println("Enter 2 To See All 90 Above Scored Students");
		System.out.println("------*****------");
		System.out.println("Enter Your Choice");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			displayStudent(s);
			break;
		case 2:
			displayStudent(s, 90);
			break;
		default:
			System.out.println("Wrong Input");
		}
	}
}