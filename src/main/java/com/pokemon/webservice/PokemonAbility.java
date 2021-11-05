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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pokemonAbility complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pokemonAbility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="is_hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="slot" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ability" type="{http://pokemon.com/webservice}ability"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pokemonAbility", propOrder = {
    "isHidden",
    "slot",
    "ability"
})
public class PokemonAbility {

    @XmlElement(name = "is_hidden")
    protected boolean isHidden;
    protected int slot;
    @XmlElement(required = true)
    protected Ability ability;

    /**
     * Obtiene el valor de la propiedad isHidden.
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Define el valor de la propiedad isHidden.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
    }

    /**
     * Obtiene el valor de la propiedad slot.
     * 
     */
    public int getSlot() {
        return slot;
    }

    /**
     * Define el valor de la propiedad slot.
     * 
     */
    public void setSlot(int value) {
        this.slot = value;
    }

    /**
     * Obtiene el valor de la propiedad ability.
     * 
     * @return
     *     possible object is
     *     {@link Ability }
     *     
     */
    public Ability getAbility() {
        return ability;
    }

    /**
     * Define el valor de la propiedad ability.
     * 
     * @param value
     *     allowed object is
     *     {@link Ability }
     *     
     */
    public void setAbility(Ability value) {
        this.ability = value;
    }

}
