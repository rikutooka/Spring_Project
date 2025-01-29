package com.example.demo.minus.service;

import org.springframework.stereotype.Service;

@Service
public class MinusService {
	//引き算の処理
	int num1 = 0;
	int num2 = 0;

	public int MinusService(int num1, int num2) {
		int result = num1 - num2;

		return result;

	}
}
/*
 * public int plus(int num1, int num2) {

	int result = num1 + num2;

	return result;

}
model.addAttribute("result", result);
th:text="${result}"
 * */
