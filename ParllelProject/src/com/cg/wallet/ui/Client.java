package com.cg.wallet.ui;

import java.math.BigInteger;
import java.util.Scanner;

import com.cg.wallet.bean.CustomerBean;
import com.cg.wallet.service.IServiceWallet;
import com.cg.wallet.service.ServiceWalletImpl;

public class Client {

	
	
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		
		CustomerBean bean=new CustomerBean();
		IServiceWallet service=new ServiceWalletImpl();
		
		System.out.println("**********WELCOME TO WALLET PAYMENT**********");
		System.out.println("1.Create Account");
		System.out.println("2.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.ShowBalance");
		System.out.println("5.FundTransfer");
		System.out.println("6.PrintTranscations");
		System.out.println("---------------------------");
		System.out.println("Enter Your Choice: ");
		int choice=scanner.nextInt();
		switch(choice){
			case 1:
				createAccount();
				
				break;
			
				
			case 2:
				deposit();
				
				break;
				
				
				
			case 3:
				withdraw();
				break;
				
				
				
			case 4:
				showBalance();
				break;
				
				
				
			case 5:
				fundTransfer();
				break;
				
				
				
			case 6:
				
				 printTranscation();

				break;
			
				
				
		}
		
		
		


	}

	private static void printTranscation() {
		// TODO Auto-generated method stub
		
	}

	private static void fundTransfer() {
		// TODO Auto-generated method stub
		
	}

	private static void showBalance() {
		// TODO Auto-generated method stub
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

	private static void deposit() {
		
		
	}

	private static void createAccount() {
		
	   Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name:");
		String name = scanner.next();
		System.out.println("Enter EmailId:");
		String emailId = scanner.next();
		System.out.println("Enter phoneNumber:");
		BigInteger phno = scanner.nextBigInteger();
		
		
		System.out.println("Account created successfully..");
		
	}

}
