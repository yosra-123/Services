package Soustraction;

public class SousProxy implements Soustraction.Sous {
  private String _endpoint = null;
  private Soustraction.Sous sous = null;
  
  public SousProxy() {
    _initSousProxy();
  }
  
  public SousProxy(String endpoint) {
    _endpoint = endpoint;
    _initSousProxy();
  }
  
  private void _initSousProxy() {
    try {
      sous = (new Soustraction.SousServiceLocator()).getSous();
      if (sous != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sous)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sous)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sous != null)
      ((javax.xml.rpc.Stub)sous)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Soustraction.Sous getSous() {
    if (sous == null)
      _initSousProxy();
    return sous;
  }
  
  public java.lang.String SOUSTRACTION(int a, int b) throws java.rmi.RemoteException{
    if (sous == null)
      _initSousProxy();
    return sous.SOUSTRACTION(a, b);
  }
  
  
}