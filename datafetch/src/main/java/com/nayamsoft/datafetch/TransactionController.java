package com.nayamsoft.datafetch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService service;
	
	@GetMapping("/transaction")
	public List<Transaction> list(){
		return service.listAll();
	}
	
}
