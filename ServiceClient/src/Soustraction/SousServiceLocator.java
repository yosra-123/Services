/**
 * SousServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Soustraction;

public class SousServiceLocator extends org.apache.axis.client.Service implements Soustraction.SousService {

    public SousServiceLocator() {
    }


    public SousServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SousServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Sous
    private java.lang.String Sous_address = "http://localhost:8080/CalculeService/services/Sous";

    public java.lang.String getSousAddress() {
        return Sous_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SousWSDDServiceName = "Sous";

    public java.lang.String getSousWSDDServiceName() {
        return SousWSDDServiceName;
    }

    public void setSousWSDDServiceName(java.lang.String name) {
        SousWSDDServiceName = name;
    }

    public Soustraction.Sous getSous() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Sous_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSous(endpoint);
    }

    public Soustraction.Sous getSous(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Soustraction.SousSoapBindingStub _stub = new Soustraction.SousSoapBindingStub(portAddress, this);
            _stub.setPortName(getSousWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSousEndpointAddress(java.lang.String address) {
        Sous_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Soustraction.Sous.class.isAssignableFrom(serviceEndpointInterface)) {
                Soustraction.SousSoapBindingStub _stub = new Soustraction.SousSoapBindingStub(new java.net.URL(Sous_address), this);
                _stub.setPortName(getSousWSDDServiceName());
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
        if ("Sous".equals(inputPortName)) {
            return getSous();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Soustraction", "SousService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Soustraction", "Sous"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Sous".equals(portName)) {
            setSousEndpointAddress(address);
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
