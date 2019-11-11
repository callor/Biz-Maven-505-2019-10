package com.biz.build.service;

public class MyService {
	public void addNum() {
		int sum = 0;
		for(int i = 1; i <= 10 ; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void addNum(int num1, int num2) {
		int sum = 0;
		for(int i = num1; i <= num2 ; i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d 까지 덧셈 :  %d",num1,num2,sum);
	}
}
