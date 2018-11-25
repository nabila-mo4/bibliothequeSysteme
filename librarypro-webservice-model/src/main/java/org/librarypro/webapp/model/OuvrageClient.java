
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
@WebService(name = "OuvrageClient", targetNamespace = "model.webapp.librarypro.org")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OuvrageClient {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "update", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.UpdateResponse")
    @Action(input = "model.webapp.librarypro.org/OuvrageClient/updateRequest", output = "model.webapp.librarypro.org/OuvrageClient/updateResponse")
    public void update(
        @WebParam(name = "arg0", targetNamespace = "")
        OuvrageDTO arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.DeleteResponse")
    @Action(input = "model.webapp.librarypro.org/OuvrageClient/deleteRequest", output = "model.webapp.librarypro.org/OuvrageClient/deleteResponse")
    public void delete(
        @WebParam(name = "arg0", targetNamespace = "")
        OuvrageDTO arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "create", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.CreateResponse")
    @Action(input = "model.webapp.librarypro.org/OuvrageClient/createRequest", output = "model.webapp.librarypro.org/OuvrageClient/createResponse")
    public void create(
        @WebParam(name = "arg0", targetNamespace = "")
        OuvrageDTO arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.librarypro.webapp.model.OuvrageDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.GetAllResponse")
    @Action(input = "model.webapp.librarypro.org/OuvrageClient/getAllRequest", output = "model.webapp.librarypro.org/OuvrageClient/getAllResponse")
    public List<OuvrageDTO> getAll();

    /**
     * 
     * @param arg0
     * @return
     *     returns org.librarypro.webapp.model.OuvrageDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBook", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.GetBook")
    @ResponseWrapper(localName = "getBookResponse", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.GetBookResponse")
    @Action(input = "model.webapp.librarypro.org/OuvrageClient/getBookRequest", output = "model.webapp.librarypro.org/OuvrageClient/getBookResponse")
    public OuvrageDTO getBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.librarypro.webapp.model.OuvrageDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOuvrageByAuteur", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.GetOuvrageByAuteur")
    @ResponseWrapper(localName = "getOuvrageByAuteurResponse", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.GetOuvrageByAuteurResponse")
    @Action(input = "model.webapp.librarypro.org/OuvrageClient/getOuvrageByAuteurRequest", output = "model.webapp.librarypro.org/OuvrageClient/getOuvrageByAuteurResponse")
    public List<OuvrageDTO> getOuvrageByAuteur(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.librarypro.webapp.model.OuvrageDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOuvrageByTitre", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.GetOuvrageByTitre")
    @ResponseWrapper(localName = "getOuvrageByTitreResponse", targetNamespace = "model.webapp.librarypro.org", className = "org.librarypro.webapp.model.GetOuvrageByTitreResponse")
    @Action(input = "model.webapp.librarypro.org/OuvrageClient/getOuvrageByTitreRequest", output = "model.webapp.librarypro.org/OuvrageClient/getOuvrageByTitreResponse")
    public List<OuvrageDTO> getOuvrageByTitre(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
