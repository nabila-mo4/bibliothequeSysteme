
package org.oc.librarypro_webservice.webinterface.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oc.librarypro_webservice.webinterface.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmpruntsByUtilisateur_QNAME = new QName("http://webservices.webinterface.librarypro_webservice.oc.org/", "empruntsByUtilisateur");
    private final static QName _EmpruntsByUtilisateurResponse_QNAME = new QName("http://webservices.webinterface.librarypro_webservice.oc.org/", "empruntsByUtilisateurResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oc.librarypro_webservice.webinterface.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmpruntsByUtilisateurResponse }
     * 
     */
    public EmpruntsByUtilisateurResponse createEmpruntsByUtilisateurResponse() {
        return new EmpruntsByUtilisateurResponse();
    }

    /**
     * Create an instance of {@link EmpruntsByUtilisateur }
     * 
     */
    public EmpruntsByUtilisateur createEmpruntsByUtilisateur() {
        return new EmpruntsByUtilisateur();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpruntsByUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.webinterface.librarypro_webservice.oc.org/", name = "empruntsByUtilisateur")
    public JAXBElement<EmpruntsByUtilisateur> createEmpruntsByUtilisateur(EmpruntsByUtilisateur value) {
        return new JAXBElement<EmpruntsByUtilisateur>(_EmpruntsByUtilisateur_QNAME, EmpruntsByUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpruntsByUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.webinterface.librarypro_webservice.oc.org/", name = "empruntsByUtilisateurResponse")
    public JAXBElement<EmpruntsByUtilisateurResponse> createEmpruntsByUtilisateurResponse(EmpruntsByUtilisateurResponse value) {
        return new JAXBElement<EmpruntsByUtilisateurResponse>(_EmpruntsByUtilisateurResponse_QNAME, EmpruntsByUtilisateurResponse.class, null, value);
    }

}
