package com.nayamsoft.datafetch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TransactionController {
	
	@Autowired
	private TransactionService service;
	
	@RequestMapping("/details")
	public String viewHomePage(Model model) {
	    List<Transaction> listTransactions = service.listAll();
	    model.addAttribute("listTransactions", listTransactions);
	    return "index";
	}
	

}
