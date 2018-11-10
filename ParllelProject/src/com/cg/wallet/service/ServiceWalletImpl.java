package com.cg.wallet.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.wallet.bean.CustomerBean;
import com.cg.wallet.dao.IWalletDAO;
import com.cg.wallet.dao.WalletDAOImpl;
import com.cg.wallet.exception.CustomerException;
import com.cg.wallet.exception.CustomerNotFoundException;

public class ServiceWalletImpl implements IServiceWallet {

	IWalletDAO dao=new WalletDAOImpl();
	List<CustomerBean> cusList = new ArrayList<CustomerBean>(); 
	
	@Override
	public boolean createCustomer(CustomerBean bean) {
		
		return cusList.add(bean);
	}

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double showBalance(int pin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean fundTransfer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean printTranscation() {
	
		return false;
	}

	public boolean validateDetails(CustomerBean bean) throws CustomerException{
		boolean isValid = false;
		if(!(bean.getName()==null && bean.getName().matches("[A-Za-z]{4,16}"))){
			throw new CustomerException(CustomerNotFoundException.ERROR1);
		}
		
		if(!(bean.getEmailId()==null && bean.getEmailId().matches("[a-zA-Z0-9._]+@[a-z]+.[a-z]{2,4}"))){
			throw new CustomerException(CustomerNotFoundException.ERROR2);
		}
		
		if(!(bean.getPhno()==null && bean.getPhno().toString().matches("^[7-9][0-9]{9}"))){
			throw new CustomerException(CustomerNotFoundException.ERROR3);
		}
		
		if(!(bean.getBalance()>0)){
			throw new CustomerException(CustomerNotFoundException.ERROR4);
		}
		
		
		
		 isValid=true;
		 return isValid;
	}
	
}
