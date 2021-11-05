//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.05 a las 12:49:23 AM CST 
//


package com.pokemon.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pokemon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pokemon"
})
@XmlRootElement(name = "location_area_encountersRequest")
public class LocationAreaEncountersRequest {

    @XmlElement(required = true)
    protected String pokemon;

    /**
     * Obtiene el valor de la propiedad pokemon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPokemon() {
        return pokemon;
    }

    /**
     * Define el valor de la propiedad pokemon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPokemon(String value) {
        this.pokemon = value;
    }

}
