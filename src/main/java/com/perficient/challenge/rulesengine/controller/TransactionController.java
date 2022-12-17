package com.perficient.challenge.rulesengine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perficient.challenge.rulesengine.model.Transaction;
import com.perficient.challenge.rulesengine.service.TransactionService;



@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/")
	public List<Transaction> getRule(){
		return transactionService.findAll();
	}
	
	@PostMapping("/getrule")
	public List<Transaction> getRule2(@RequestBody String pBody){
		System.out.println(pBody);
		return transactionService.findAll();
	}
}
