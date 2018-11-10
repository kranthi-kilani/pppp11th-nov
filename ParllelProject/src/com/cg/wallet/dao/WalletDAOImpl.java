package com.cg.wallet.dao;

import com.cg.wallet.bean.CustomerBean;
import com.cg.wallet.util.DataBase;

public class WalletDAOImpl implements IWalletDAO {
     DataBase db=new DataBase();
	@Override
	public boolean createCustomer(CustomerBean bean) {
	
		return false;
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
		// TODO Auto-generated method stub
		return false;
	}

}
