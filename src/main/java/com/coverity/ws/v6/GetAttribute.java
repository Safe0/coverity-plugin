
package com.coverity.ws.v6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeDefinitionId" type="{http://ws.coverity.com/v6}attributeDefinitionIdDataObj" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAttribute", propOrder = {
    "attributeDefinitionId"
})
public class GetAttribute {

    protected AttributeDefinitionIdDataObj attributeDefinitionId;

    /**
     * Gets the value of the attributeDefinitionId property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDefinitionIdDataObj }
     *     
     */
    public AttributeDefinitionIdDataObj getAttributeDefinitionId() {
        return attributeDefinitionId;
    }

    /**
     * Sets the value of the attributeDefinitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDefinitionIdDataObj }
     *     
     */
    public void setAttributeDefinitionId(AttributeDefinitionIdDataObj value) {
        this.attributeDefinitionId = value;
    }

}
