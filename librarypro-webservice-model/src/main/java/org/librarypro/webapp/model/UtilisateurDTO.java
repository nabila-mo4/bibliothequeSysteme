
package org.librarypro.webapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour utilisateurDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="utilisateurDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emprunts" type="{model.webapp.librarypro.org}empruntDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idutilisateur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mdp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "utilisateurDTO", propOrder = {
    "addresse",
    "email",
    "emprunts",
    "idutilisateur",
    "mdp",
    "nom",
    "prenom"
})
public class UtilisateurDTO {

    protected String addresse;
    protected String email;
    @XmlElement(nillable = true)
    protected List<EmpruntDTO> emprunts;
    protected int idutilisateur;
    protected String mdp;
    protected String nom;
    protected String prenom;

    /**
     * Obtient la valeur de la propriété addresse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresse() {
        return addresse;
    }

    /**
     * Définit la valeur de la propriété addresse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresse(String value) {
        this.addresse = value;
    }

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emprunts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emprunts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmprunts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmpruntDTO }
     * 
     * 
     */
    public List<EmpruntDTO> getEmprunts() {
        if (emprunts == null) {
            emprunts = new ArrayList<EmpruntDTO>();
        }
        return this.emprunts;
    }

    /**
     * Obtient la valeur de la propriété idutilisateur.
     * 
     */
    public int getIdutilisateur() {
        return idutilisateur;
    }

    /**
     * Définit la valeur de la propriété idutilisateur.
     * 
     */
    public void setIdutilisateur(int value) {
        this.idutilisateur = value;
    }

    /**
     * Obtient la valeur de la propriété mdp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * Définit la valeur de la propriété mdp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdp(String value) {
        this.mdp = value;
    }

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété prenom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit la valeur de la propriété prenom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

}
