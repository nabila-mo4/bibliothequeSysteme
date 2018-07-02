
package org.librarypro.webapp.model;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UtilisateurClient", targetNamespace = "model.webapp.librarypro.org")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UtilisateurClient {


    /**
     * 
     * @return
     *     returns java.util.List<org.librarypro.webapp.model.UtilisateurDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "users", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.Users")
    @ResponseWrapper(localName = "usersResponse", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.UsersResponse")
    @Action(input = "model.webapp.librarypro.org/UtilisateurClient/usersRequest", output = "model.webapp.librarypro.org/UtilisateurClient/usersResponse")
    public List<UtilisateurDTO> users();

    /**
     * 
     * @param arg0
     * @return
     *     returns org.librarypro.webapp.model.UtilisateurDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUtilisateurByEmail", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.GetUtilisateurByEmail")
    @ResponseWrapper(localName = "getUtilisateurByEmailResponse", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.GetUtilisateurByEmailResponse")
    @Action(input = "model.webapp.librarypro.org/UtilisateurClient/getUtilisateurByEmailRequest", output = "model.webapp.librarypro.org/UtilisateurClient/getUtilisateurByEmailResponse")
    public UtilisateurDTO getUtilisateurByEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "valider", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.Valider")
    @ResponseWrapper(localName = "validerResponse", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.ValiderResponse")
    @Action(input = "model.webapp.librarypro.org/UtilisateurClient/validerRequest", output = "model.webapp.librarypro.org/UtilisateurClient/validerResponse")
    public boolean valider(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
