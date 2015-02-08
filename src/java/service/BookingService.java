package service;

import javax.ejb.Stateless;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;

/**
 *
 * @author AMore
 */
@Stateless
@ServiceMode(value = javax.xml.ws.Service.Mode.PAYLOAD)
@WebServiceProvider(serviceName = "BookingServiceService", 
        portName = "BookingServicePort", 
        targetNamespace = "http://j2ee.netbeans.org/wsdl/BookingService/java/BookingService", 
        wsdlLocation = "WEB-INF/wsdl/BookingService/BookingService.wsdl")
public class BookingService implements javax.xml.ws.Provider<javax.xml.transform.Source> {

    public javax.xml.transform.Source invoke(javax.xml.transform.Source source) {
        //TODO implement this method

        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
    
    
    
    
    
    
    
}
