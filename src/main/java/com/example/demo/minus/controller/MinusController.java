package com.example.demo.minus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;

/*
 * リクエストの受け取り
 * minus.htmlに引き算結果を渡してあげる
 * minus.htmlの表示
 */
@Controller
public class MinusController {
	/*
	 * 依存性の注入
	 * Serviceクラスのインスタンスをspringbootから受け取る
	 * コンストラクタ
	 */
	private final MinusService minusService;

	public MinusController(MinusService minusService) {
		this.minusService = minusService;
	}

	//最初にurlを入力すると出てくる画面
	@GetMapping("Minus")
	public String Minus() {
		return "minus.html";

	}

	//数値を入力して=を押すとServiceに飛ばして結果をminus.htmlに返す
	@PostMapping("Minus")
	//コンストラクタ(@RequestParamでServiceでつかったint numをリクエスト)
	public String Minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {

		//MinusServiceのreturnをminusResultに代入
		int minusResult = minusService.MinusService(num1, num2);

		//model.addAttribute()メソッドはモデルに属性を追加
		//result属性にminusResultのリザルトを追加
		model.addAttribute("result", minusResult);

		//結果をminus.htmlに返す
		return "minus.html";
	}
}
