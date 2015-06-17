package com.webservices.service;

public class CustomerServiceImplProxy implements com.webservices.service.CustomerServiceImpl {
  private String _endpoint = null;
  private com.webservices.service.CustomerServiceImpl customerServiceImpl = null;
  
  public CustomerServiceImplProxy() {
    _initCustomerServiceImplProxy();
  }
  
  public CustomerServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerServiceImplProxy();
  }
  
  private void _initCustomerServiceImplProxy() {
    try {
      customerServiceImpl = (new com.webservices.service.CustomerServiceImplServiceLocator()).getCustomerServiceImpl();
      if (customerServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customerServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customerServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customerServiceImpl != null)
      ((javax.xml.rpc.Stub)customerServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.webservices.service.CustomerServiceImpl getCustomerServiceImpl() {
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl;
  }
  
  public java.lang.String getCustomerName(int cid) throws java.rmi.RemoteException{
    if (customerServiceImpl == null)
      _initCustomerServiceImplProxy();
    return customerServiceImpl.getCustomerName(cid);
  }
  
  
}