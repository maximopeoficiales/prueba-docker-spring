package com.example.sumar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SumarController {
 @GetMapping("/sumar")
 @ResponseBody
 public Sumar getSumar(@RequestParam(name ="num1",required = true) int num1,@RequestParam(name ="num2",required = true) int num2) {
	return new Sumar(num1, num2) ;
 }
}
