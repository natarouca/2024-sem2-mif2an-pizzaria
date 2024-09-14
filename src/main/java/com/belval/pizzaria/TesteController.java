package com.belval.pizzaria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
	
	@GetMapping("/")
	public String noAr() {
		return "no ar!!!";
	}

}
