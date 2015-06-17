package com.webservices.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICustomerService extends Remote {

	public String getCustomerName(int cid) throws RemoteException;

}
