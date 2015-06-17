/**
 * CustomerServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservices.service;

public interface CustomerServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getCustomerServiceImplAddress();

    public com.webservices.service.CustomerServiceImpl getCustomerServiceImpl() throws javax.xml.rpc.ServiceException;

    public com.webservices.service.CustomerServiceImpl getCustomerServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
