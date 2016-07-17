
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="no1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="no2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sum", propOrder = {
    "no1",
    "no2"
})
public class Sum {

    protected int no1;
    protected int no2;

    /**
     * Gets the value of the no1 property.
     * 
     */
    public int getNo1() {
        return no1;
    }

    /**
     * Sets the value of the no1 property.
     * 
     */
    public void setNo1(int value) {
        this.no1 = value;
    }

    /**
     * Gets the value of the no2 property.
     * 
     */
    public int getNo2() {
        return no2;
    }

    /**
     * Sets the value of the no2 property.
     * 
     */
    public void setNo2(int value) {
        this.no2 = value;
    }

}
