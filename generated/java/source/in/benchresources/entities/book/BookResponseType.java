
package in.benchresources.entities.book;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookISBN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookISBN",
    "bookName",
    "author",
    "category"
})
@XmlRootElement(name = "BookResponseType")
public class BookResponseType {

    @XmlElement(required = true)
    protected String bookISBN;
    @XmlElement(required = true)
    protected String bookName;
    @XmlElement(required = true)
    protected String author;
    @XmlElement(required = true)
    protected String category;

    /**
     * Obtiene el valor de la propiedad bookISBN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookISBN() {
        return bookISBN;
    }

    /**
     * Define el valor de la propiedad bookISBN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookISBN(String value) {
        this.bookISBN = value;
    }

    /**
     * Obtiene el valor de la propiedad bookName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Define el valor de la propiedad bookName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookName(String value) {
        this.bookName = value;
    }

    /**
     * Obtiene el valor de la propiedad author.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Define el valor de la propiedad author.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
