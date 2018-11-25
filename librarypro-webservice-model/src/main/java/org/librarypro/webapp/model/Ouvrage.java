
package org.librarypro.webapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ouvrage complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ouvrage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auteur" type="{model.webapp.librarypro.org}auteur" minOccurs="0"/>
 *         &lt;element name="datepublication" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="domaine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="idouvrage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="langue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbpages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbrestant" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbtotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ouvrage", propOrder = {
    "auteur",
    "datepublication",
    "domaine",
    "editeur",
    "etat",
    "idouvrage",
    "isbn",
    "langue",
    "nbpages",
    "nbrestant",
    "nbtotal",
    "nom",
    "titre"
})
public class Ouvrage {

    protected Auteur auteur;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datepublication;
    protected String domaine;
    protected String editeur;
    protected boolean etat;
    protected int idouvrage;
    protected String isbn;
    protected String langue;
    protected int nbpages;
    protected int nbrestant;
    protected int nbtotal;
    protected String nom;
    protected String titre;

    /**
     * Obtient la valeur de la propriété auteur.
     * 
     * @return
     *     possible object is
     *     {@link Auteur }
     *     
     */
    public Auteur getAuteur() {
        return auteur;
    }

    /**
     * Définit la valeur de la propriété auteur.
     * 
     * @param value
     *     allowed object is
     *     {@link Auteur }
     *     
     */
    public void setAuteur(Auteur value) {
        this.auteur = value;
    }

    /**
     * Obtient la valeur de la propriété datepublication.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatepublication() {
        return datepublication;
    }

    /**
     * Définit la valeur de la propriété datepublication.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatepublication(XMLGregorianCalendar value) {
        this.datepublication = value;
    }

    /**
     * Obtient la valeur de la propriété domaine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomaine() {
        return domaine;
    }

    /**
     * Définit la valeur de la propriété domaine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomaine(String value) {
        this.domaine = value;
    }

    /**
     * Obtient la valeur de la propriété editeur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditeur() {
        return editeur;
    }

    /**
     * Définit la valeur de la propriété editeur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditeur(String value) {
        this.editeur = value;
    }

    /**
     * Obtient la valeur de la propriété etat.
     * 
     */
    public boolean isEtat() {
        return etat;
    }

    /**
     * Définit la valeur de la propriété etat.
     * 
     */
    public void setEtat(boolean value) {
        this.etat = value;
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
     * Obtient la valeur de la propriété isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Définit la valeur de la propriété isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Obtient la valeur de la propriété langue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangue() {
        return langue;
    }

    /**
     * Définit la valeur de la propriété langue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangue(String value) {
        this.langue = value;
    }

    /**
     * Obtient la valeur de la propriété nbpages.
     * 
     */
    public int getNbpages() {
        return nbpages;
    }

    /**
     * Définit la valeur de la propriété nbpages.
     * 
     */
    public void setNbpages(int value) {
        this.nbpages = value;
    }

    /**
     * Obtient la valeur de la propriété nbrestant.
     * 
     */
    public int getNbrestant() {
        return nbrestant;
    }

    /**
     * Définit la valeur de la propriété nbrestant.
     * 
     */
    public void setNbrestant(int value) {
        this.nbrestant = value;
    }

    /**
     * Obtient la valeur de la propriété nbtotal.
     * 
     */
    public int getNbtotal() {
        return nbtotal;
    }

    /**
     * Définit la valeur de la propriété nbtotal.
     * 
     */
    public void setNbtotal(int value) {
        this.nbtotal = value;
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
     * Obtient la valeur de la propriété titre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Définit la valeur de la propriété titre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitre(String value) {
        this.titre = value;
    }

}
