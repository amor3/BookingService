/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import org.netbeans.j2ee.wsdl.bookingservice.java.bookingservice.Fault1;

/**
 *
 * @author AMore
 */
@WebService(serviceName = "BookingServiceService", portName = "BookingServicePort", endpointInterface = "org.netbeans.j2ee.wsdl.bookingservice.java.bookingservice.BookingServicePortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/BookingService/java/BookingService", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/BookingService.wsdl")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
@Stateless
public class NewWebServiceFromWSDL {

    public java.lang.String bookingServiceOperation(java.lang.String username, java.lang.String password, java.lang.String ticketID, java.lang.String creditCardNumber) throws Fault1 {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
