package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/*
 * 計算処理を行うクラス
 */
@Service
public class FizzBuzzService {
//FizzBuzzの計算を行う
	public List<String> fizzBuzzList() {
		List<String> fizzBuzzList = new ArrayList<String>();
		String str;
		for (int i = 0; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 ==0) {
				str = "FizzBuzz";
			}else if(i % 3 == 0) {
				str = "Fizz";
			}else if(i % 5 == 0) {
				str = "Buzz";
			}else {
				str = String.valueOf(i);
			}
			fizzBuzzList.add(str);
			
		}
		return fizzBuzzList;
	}
}
