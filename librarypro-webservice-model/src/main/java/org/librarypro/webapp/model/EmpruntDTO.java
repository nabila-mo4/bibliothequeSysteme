
package org.librarypro.webapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour empruntDTO complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="empruntDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datedebut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateretour" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="encours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idemprunt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idouvrage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idutilisateur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ouvrageDTO" type="{model.webapp.librarypro.org}ouvrageDTO" minOccurs="0"/>
 *         &lt;element name="prolonge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="utilisateurDTO" type="{model.webapp.librarypro.org}utilisateurDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "empruntDTO", propOrder = {
    "datedebut",
    "dateretour",
    "encours",
    "idemprunt",
    "idouvrage",
    "idutilisateur",
    "ouvrageDTO",
    "prolonge",
    "utilisateurDTO"
})
public class EmpruntDTO {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datedebut;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateretour;
    protected Boolean encours;
    protected int idemprunt;
    protected int idouvrage;
    protected int idutilisateur;
    protected OuvrageDTO ouvrageDTO;
    protected Boolean prolonge;
    protected UtilisateurDTO utilisateurDTO;

    /**
     * Obtient la valeur de la propriété datedebut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatedebut() {
        return datedebut;
    }

    /**
     * Définit la valeur de la propriété datedebut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatedebut(XMLGregorianCalendar value) {
        this.datedebut = value;
    }

    /**
     * Obtient la valeur de la propriété dateretour.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateretour() {
        return dateretour;
    }

    /**
     * Définit la valeur de la propriété dateretour.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateretour(XMLGregorianCalendar value) {
        this.dateretour = value;
    }

    /**
     * Obtient la valeur de la propriété encours.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncours() {
        return encours;
    }

    /**
     * Définit la valeur de la propriété encours.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncours(Boolean value) {
        this.encours = value;
    }

    /**
     * Obtient la valeur de la propriété idemprunt.
     * 
     */
    public int getIdemprunt() {
        return idemprunt;
    }

    /**
     * Définit la valeur de la propriété idemprunt.
     * 
     */
    public void setIdemprunt(int value) {
        this.idemprunt = value;
    }

    /**
     * Obtient la valeur de la propriété idouvrage.
     * 
     */
    public int getIdouvrage() {
        return idouvrage;
    }

    /**
     * Définit la valeur de la propriété idouvrage.
     * 
     */
    public void setIdouvrage(int value) {
        this.idouvrage = value;
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
     * Obtient la valeur de la propriété ouvrageDTO.
     * 
     * @return
     *     possible object is
     *     {@link OuvrageDTO }
     *     
     */
    public OuvrageDTO getOuvrageDTO() {
        return ouvrageDTO;
    }

    /**
     * Définit la valeur de la propriété ouvrageDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link OuvrageDTO }
     *     
     */
    public void setOuvrageDTO(OuvrageDTO value) {
        this.ouvrageDTO = value;
    }

    /**
     * Obtient la valeur de la propriété prolonge.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProlonge() {
        return prolonge;
    }

    /**
     * Définit la valeur de la propriété prolonge.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProlonge(Boolean value) {
        this.prolonge = value;
    }

    /**
     * Obtient la valeur de la propriété utilisateurDTO.
     * 
     * @return
     *     possible object is
     *     {@link UtilisateurDTO }
     *     
     */
    public UtilisateurDTO getUtilisateurDTO() {
        return utilisateurDTO;
    }

    /**
     * Définit la valeur de la propriété utilisateurDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilisateurDTO }
     *     
     */
    public void setUtilisateurDTO(UtilisateurDTO value) {
        this.utilisateurDTO = value;
    }

}
