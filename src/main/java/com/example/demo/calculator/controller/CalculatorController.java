package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

/*
 * リクエストの受け取り
 * calculator.htmlに計算結果を渡してあげる
 * calculator.htmlの表示
 */
@Controller
public class CalculatorController {
	/*
	 * 依存性の注入
	 * Serviceクラスのインスタンスをspringbootから受け取る
	 * コンストラクタ
	 */
	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService, CalculatorService calculatorService2) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("Calculator")
	public String Calculator() {
		return "calculator.html";
	}

	//数値と四則演算を入力して=を押すとServiceに飛ばして結果をcalculator.htmlに返す
	@PostMapping("Calculator")
	//コンストラクタ(@RequestParamでServiceでつかったint numをリクエスト)
	public String Calculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2,
			@RequestParam("arithmetic") String arithmetic,Model model) {

		//CalculatorServiceのreturnをcalculatorResultに代入
		int calculatorResult = calculatorService.calculator(num1, num2, arithmetic,model);
			
		
		//model.addAttribute()メソッドはモデルに属性を追加
		//result属性にcalculatorResultのリザルトを追加
		
		model.addAttribute("result", calculatorResult);
		
		//結果をcalculator.htmlに返す
		return "calculator.html";
	}
}
