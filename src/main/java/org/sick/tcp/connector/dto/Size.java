
package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
@XmlAccessorType(XmlAccessType.FIELD)
public class Size
{
	@XmlAttribute(name = "owi")
    private String owi;
	@XmlAttribute(name = "unit")
    private String unit;
	@XmlAttribute(name = "ole")
    private String ole;
	@XmlAttribute(name = "ohe")
    private String ohe;

    public String getOwi ()
    {
        return owi;
    }

    public void setOwi (String owi)
    {
        this.owi = owi;
    }

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
    }

    public String getOle ()
    {
        return ole;
    }

    public void setOle (String ole)
    {
        this.ole = ole;
    }

    public String getOhe ()
    {
        return ohe;
    }

    public void setOhe (String ohe)
    {
        this.ohe = ohe;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [owi = "+owi+", unit = "+unit+", ole = "+ole+", ohe = "+ohe+"]";
    }
}
