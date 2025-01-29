package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CalculatorService {
//	int num1 = 0;
//	int num2 = 0;
//	String arithmetic = "";
//	

	public int calculator(int num1, int num2, String arithmetic,Model model) {
		int result = 0;
		try {
			if ("+".equals(arithmetic)) {
				result = num1 + num2;
	
			} else if ("-".equals(arithmetic)) {
				result = num1 - num2;
	
			} else if ("×".equals(arithmetic)) {
				result = num1 * num2;
	
			} else if ("÷".equals(arithmetic)) {
				if(num2 == 0) {
					throw new ArithmeticException( "ゼロ除算はできません");
				}
				result = num1 / num2;
			}
			
		}catch(ArithmeticException e) {
			
			String errorMsg = e.getMessage();
			model.addAttribute("errorMsg",errorMsg);
			
		}
		return result;
		
	}

}
