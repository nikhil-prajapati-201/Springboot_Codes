package com.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Netflix")
public class MyController {

	@GetMapping("/home")
	public String homePage() {
		return "Welcome To Netflix\nEnjoyee Your Plan"
				+ "\nComedy\nThriller\nAction\nLove";
	}
	
	@PostMapping("/comedy")
	public String comedy() {
		return "-----Comedy-----\n \nKhatta Miththa\nBhool Bhulaya";
	}
	
	@PutMapping("/action")
	public String action() {
		return "-----Action-----\n \nTransformers\nMission Imposibles\nXman";
	}
	
	@DeleteMapping("/thriller")
	public String thriller() {
		return "-----Thriller-----\n \nStrangerThings\nMoney Hiest\nAlice in Borderland\nSquide Game";
	}
	
	
}
