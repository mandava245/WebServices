/**
 * CustomerServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservices.service;

public class CustomerServiceImplServiceLocator extends org.apache.axis.client.Service implements com.webservices.service.CustomerServiceImplService {

    public CustomerServiceImplServiceLocator() {
    }


    public CustomerServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomerServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomerServiceImpl
    private java.lang.String CustomerServiceImpl_address = "http://localhost:8282/FirstWebServiceApplicationJAX-RPC/services/CustomerServiceImpl";

    public java.lang.String getCustomerServiceImplAddress() {
        return CustomerServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomerServiceImplWSDDServiceName = "CustomerServiceImpl";

    public java.lang.String getCustomerServiceImplWSDDServiceName() {
        return CustomerServiceImplWSDDServiceName;
    }

    public void setCustomerServiceImplWSDDServiceName(java.lang.String name) {
        CustomerServiceImplWSDDServiceName = name;
    }

    public com.webservices.service.CustomerServiceImpl getCustomerServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomerServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomerServiceImpl(endpoint);
    }

    public com.webservices.service.CustomerServiceImpl getCustomerServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.webservices.service.CustomerServiceImplSoapBindingStub _stub = new com.webservices.service.CustomerServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getCustomerServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomerServiceImplEndpointAddress(java.lang.String address) {
        CustomerServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.webservices.service.CustomerServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.webservices.service.CustomerServiceImplSoapBindingStub _stub = new com.webservices.service.CustomerServiceImplSoapBindingStub(new java.net.URL(CustomerServiceImpl_address), this);
                _stub.setPortName(getCustomerServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CustomerServiceImpl".equals(inputPortName)) {
            return getCustomerServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.webservices.com", "CustomerServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.webservices.com", "CustomerServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomerServiceImpl".equals(portName)) {
            setCustomerServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
