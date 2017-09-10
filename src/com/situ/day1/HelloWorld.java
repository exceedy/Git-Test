package com.situ.day1;

import java.util.Scanner;

import org.junit.Test;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// 80 90
		int num1 = 80;
		num1 = 90;
		int num2 = 100;
		int result = num1 + num2;
		System.out.println(result);

		// zhangsan
	}

	@Test
	public void test() {
		System.out.println("test");
	}

	/**
	 * 交换两个变量的值
	 */
	@Test
	public void change() {
		int num = 5;
		int num2 = 3;
		System.out.println("before: " + num);
		System.out.println("before: " + num2);
		// 交换两个变量的值
		int temp = num;
		num = num2;
		num2 = temp;

		System.out.println("after: " + num);
	}

	@Test
	public void test1() {
		// + - * / %
		int num1 = 6;
		int num2 = 4;
		int resultAdd = num1 + num2;
		int result = 6 / 4;
		int result1 = 6 % 4;
		System.out.println(result);
		System.out.println(result1);
	}

	@Test
	public void test2() {
		// if (true/false) {}
		if (6 % 3 == 0) {
			System.out.println("能够整除");
		}

		// ||(只要有一个满足) &&（同时满足）
		// 判断一个年是不是闰年
		// 1.可以被4整除，但是不能被100整除 &&
		// 2.可以被400整除
		int year = 2017;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
	}

	@Test
	public void printScore() {
		/**
		 * 学生成绩的等级： >=90 <=100 优秀 >=80 <90 良好 >=70 <80 一般 >=60 <70 及格 <60 不及格
		 * 
		 * >100 <0
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的成绩：");
		int score = scanner.nextInt();
		System.out.println("score: " + score);

		// 将非法的输入单独写在一起，然后return
		if (score > 100 || score < 0) {
			System.out.println("非法的输入");
			return;
		}

		if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 80) {
			System.out.println("良好");
		} else if (score >= 70) {
			System.out.println("一般");
		} else if (score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
	
}
