
package fr.opensagres.xdocreport.remoting.resources.services.ws.client.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.4.0
 * Wed Mar 07 07:57:58 CET 2012
 * Generated source version: 2.4.0
 */

@XmlRootElement(name = "ResourcesException", namespace = "http://services.resources.remoting.xdocreport.opensagres.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcesException", namespace = "http://services.resources.remoting.xdocreport.opensagres.fr/")

public class ResourcesExceptionBean {

    private java.lang.String message;

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String newMessage)  {
        this.message = newMessage;
    }

}
