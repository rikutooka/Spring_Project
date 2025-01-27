package com.example.demo.fizzBuzz.controller;

import org.springframework.stereotype.Controller;

import com.example.demo.fizzBuzz.service.FizzBuzzService;

/*
 * リクエストの受け取り
 * FizzBuzz.htmlに掛け算結果を渡してあげる
 * FizzBuzz.htmlの表示
 */
@Controller
public class FizzBuzzController {
	/*
	 * 依存性の注入
	 * Serviceクラスのインスタンスをspringbootから受け取る
	 * コンストラクタ
	 */
	
	private final FizzBuzzService fizzBuzzService;
	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}
	
//	@GetMapping("FizzBuzz")
//	public String FizzBuzz
}
