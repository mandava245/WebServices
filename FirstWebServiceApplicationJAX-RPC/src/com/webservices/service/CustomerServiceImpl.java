package com.webservices.service;

import java.rmi.RemoteException;

public class CustomerServiceImpl implements ICustomerService {

	@Override
	public String getCustomerName(int cid) throws RemoteException {

		if (cid == 88) {
			return "Pavan Mandava";
		} else if (cid == 84) {
			return "Krishna Chaitanya";
		} else {
			return "Customer Not Found..!!!";
		}

	}

}
