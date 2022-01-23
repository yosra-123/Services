/**
 * AddService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Addition;

public interface AddService extends javax.xml.rpc.Service {
    public java.lang.String getAddAddress();

    public Addition.Add getAdd() throws javax.xml.rpc.ServiceException;

    public Addition.Add getAdd(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
