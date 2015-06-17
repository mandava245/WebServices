package com.webservices.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.webservices.service.CustomerServiceImpl;
import com.webservices.service.CustomerServiceImplServiceLocator;

public class ClientApp1 {

	public static void main(String[] args) {
		CustomerServiceImplServiceLocator locator = new CustomerServiceImplServiceLocator();
		try {
			CustomerServiceImpl csi = locator.getCustomerServiceImpl();
			int cid = 88;
			String name = csi.getCustomerName(cid);
			System.out.println(name);
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
		}
	}

}
