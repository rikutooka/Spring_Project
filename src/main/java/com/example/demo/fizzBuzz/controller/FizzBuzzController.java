package com.example.demo.fizzBuzz.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	@GetMapping("FizzBuzz")
	public String FizzBuzz (Model model) {
		List<String> fizzBuzzList = fizzBuzzService.fizzBuzzList();
		//リクエストスコープに格納
		model.addAttribute("result", fizzBuzzList);
		return "fizzBuzz.html";
		
	}
}
