package com.example.demo.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.multi.service.MultiService;

/*
 * リクエストの受け取り
 * multi.htmlに掛け算結果を渡してあげる
 * multi.htmlの表示
 */
@Controller
public class MultiController {
/*
 * 依存性の注入
 * Serviceクラスのインスタンスをspringbootから受け取る
 * コンストラクタ
 */
	
	private final MultiService multiService;
	
	public MultiController(MultiService multiService) {
		this.multiService = multiService;
	}
@GetMapping("multi")
public String multi(Model model) {
	int result = multiService.multiNum(5, 6);
	//リクエストスコープに格納
	model.addAttribute("result", result);
	return "multi.html";
	
}
}
