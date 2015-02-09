package service;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceRef;
import org.netbeans.j2ee.wsdl.bookingservice.java.bookingservice.Fault1;

/**
 *
 * @author AMore
 */
@WebService(serviceName = "BookingServiceService", 
        portName = "BookingServicePort", 
        endpointInterface = "org.netbeans.j2ee.wsdl.bookingservice.java.bookingservice.BookingServicePortType", 
        targetNamespace = "http://j2ee.netbeans.org/wsdl/BookingService/java/BookingService", 
        wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/BookingService.wsdl")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
@Stateless
public class NewWebServiceFromWSDL {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/TicketServiceService/TicketServiceFromWSDL.wsdl")
    private TicketServiceService service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AuthorizationServiceService/AuthorizationService.wsdl")
    private AuthorizationServiceService service;

    public java.lang.String bookingServiceOperation(java.lang.String username, java.lang.String password, java.lang.String ticketID, java.lang.String creditCardNumber) throws Fault1 {
        if(authorizationServiceOperation(username, password)){
            return getBookingID("TICKET_1");
        } else {
            throw new Fault1("User: " + username + " Could not login...", "AuthorizationError");
        }
        
    }

    private String getBookingID(String ticketID){
        return "Your ticket is now booked with ID: " + ticketServiceOperation(ticketID);
    }
    
    
    private boolean authorizationServiceOperation(java.lang.String username, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.AuthorizationServicePortType port = service.getAuthorizationServicePort();
        return port.authorizationServiceOperation(username, password);
    }

    private String ticketServiceOperation(java.lang.String ticketID) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.TicketServicePortType port = service_1.getTicketServicePort();
        return port.ticketServiceOperation(ticketID);
    }
    
    
    
    
    
}
