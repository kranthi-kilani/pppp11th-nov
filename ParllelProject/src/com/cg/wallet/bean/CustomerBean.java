package com.cg.wallet.bean;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class CustomerBean {
	private String name;
	private BigInteger phno;
	private int pin = 1234;
	private String emailId;
	private LocalDateTime ldt;
	private double balance;
	private double amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigInteger getPhno() {
		return phno;
	}
	public void setPhno(BigInteger phno) {
		this.phno = phno;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public LocalDateTime getLdt() {
		return ldt;
	}
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "CustomerBean [name=" + name + ", phno=" + phno + ", pin=" + pin
				+ ", emailId=" + emailId + ", ldt=" + ldt + ", balance="
				+ balance + ", amount=" + amount + "]";
	}
	
	

}
