package com.foodviolators.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LetterComboController {
	
	@Autowired
	LetterComboServiceImpl letterComboService;

	
	 @RequestMapping(value="/letterCombo/{alphaNum}", method=RequestMethod.GET)  
	    public List<String> getletterCombo(@PathVariable String alphaNum){  
	        return letterComboService.letterCombinations(alphaNum);  
	    }  
	 
  
}
