
package org.librarypro.webapp.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.librarypro.webapp.model package. 
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

    private final static QName _Users_QNAME = new QName("model.webapp.librarypro.org", "users");
    private final static QName _GetUtilisateurByEmail_QNAME = new QName("model.webapp.librarypro.org", "getUtilisateurByEmail");
    private final static QName _GetUtilisateurByEmailResponse_QNAME = new QName("model.webapp.librarypro.org", "getUtilisateurByEmailResponse");
    private final static QName _UsersResponse_QNAME = new QName("model.webapp.librarypro.org", "usersResponse");
    private final static QName _ValiderResponse_QNAME = new QName("model.webapp.librarypro.org", "validerResponse");
    private final static QName _Valider_QNAME = new QName("model.webapp.librarypro.org", "valider");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.librarypro.webapp.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValiderResponse }
     * 
     */
    public ValiderResponse createValiderResponse() {
        return new ValiderResponse();
    }

    /**
     * Create an instance of {@link Valider }
     * 
     */
    public Valider createValider() {
        return new Valider();
    }

    /**
     * Create an instance of {@link UsersResponse }
     * 
     */
    public UsersResponse createUsersResponse() {
        return new UsersResponse();
    }

    /**
     * Create an instance of {@link GetUtilisateurByEmailResponse }
     * 
     */
    public GetUtilisateurByEmailResponse createGetUtilisateurByEmailResponse() {
        return new GetUtilisateurByEmailResponse();
    }

    /**
     * Create an instance of {@link GetUtilisateurByEmail }
     * 
     */
    public GetUtilisateurByEmail createGetUtilisateurByEmail() {
        return new GetUtilisateurByEmail();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link OuvrageDTO }
     * 
     */
    public OuvrageDTO createOuvrageDTO() {
        return new OuvrageDTO();
    }

    /**
     * Create an instance of {@link AuteurDTO }
     * 
     */
    public AuteurDTO createAuteurDTO() {
        return new AuteurDTO();
    }

    /**
     * Create an instance of {@link UtilisateurDTO }
     * 
     */
    public UtilisateurDTO createUtilisateurDTO() {
        return new UtilisateurDTO();
    }

    /**
     * Create an instance of {@link EmpruntDTO }
     * 
     */
    public EmpruntDTO createEmpruntDTO() {
        return new EmpruntDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Users }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "users")
    public JAXBElement<Users> createUsers(Users value) {
        return new JAXBElement<Users>(_Users_QNAME, Users.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUtilisateurByEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "getUtilisateurByEmail")
    public JAXBElement<GetUtilisateurByEmail> createGetUtilisateurByEmail(GetUtilisateurByEmail value) {
        return new JAXBElement<GetUtilisateurByEmail>(_GetUtilisateurByEmail_QNAME, GetUtilisateurByEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUtilisateurByEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "getUtilisateurByEmailResponse")
    public JAXBElement<GetUtilisateurByEmailResponse> createGetUtilisateurByEmailResponse(GetUtilisateurByEmailResponse value) {
        return new JAXBElement<GetUtilisateurByEmailResponse>(_GetUtilisateurByEmailResponse_QNAME, GetUtilisateurByEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "usersResponse")
    public JAXBElement<UsersResponse> createUsersResponse(UsersResponse value) {
        return new JAXBElement<UsersResponse>(_UsersResponse_QNAME, UsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValiderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "validerResponse")
    public JAXBElement<ValiderResponse> createValiderResponse(ValiderResponse value) {
        return new JAXBElement<ValiderResponse>(_ValiderResponse_QNAME, ValiderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Valider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "valider")
    public JAXBElement<Valider> createValider(Valider value) {
        return new JAXBElement<Valider>(_Valider_QNAME, Valider.class, null, value);
    }

}
