package com.nayamsoft.datafetch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	private Integer id;
	private String accountname;
	private String accountnumber;
	private Integer bankid;
	private String bankname;
	private Integer transactionid;
	private double amount;
	private String receiveraccountnumber;
	private String receiveraccountname;
	private String status;
	private String date;

	public Transaction() {
	}

	public Transaction(Integer id, String accountname, String accountnumber, Integer bankid, String bankname,
			Integer transactionid, double amount, String receiveraccountnumber, String receiveraccountname,
			String status, String date) {
		this.id = id;
		this.accountname = accountname;
		this.accountnumber = accountnumber;
		this.bankid = bankid;
		this.bankname = bankname;
		this.transactionid = transactionid;
		this.amount = amount;
		this.receiveraccountnumber = receiveraccountnumber;
		this.receiveraccountname = receiveraccountname;
		this.status = status;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public Integer getBankid() {
		return bankid;
	}

	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public Integer getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(Integer transactionid) {
		this.transactionid = transactionid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getReceiveraccountnumber() {
		return receiveraccountnumber;
	}

	public void setReceiveraccountnumber(String receiveraccountnumber) {
		this.receiveraccountnumber = receiveraccountnumber;
	}

	public String getReceiveraccountname() {
		return receiveraccountname;
	}

	public void setReceiveraccountname(String receiveraccountname) {
		this.receiveraccountname = receiveraccountname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
