package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
@XmlAccessorType(XmlAccessType.FIELD)

public class Polygon
{
	@XmlAttribute(name = "oc1x")
    private String oc1x;
	@XmlAttribute(name = "oc2y")
    private String oc2y;
	@XmlAttribute(name = "oc3z")
    private String oc3z;
	@XmlAttribute(name = "oc2x")
    private String oc2x;
	@XmlAttribute(name = "oc3y")
    private String oc3y;
	@XmlAttribute(name = "oc4z")
    private String oc4z;
	@XmlAttribute(name = "oc3x")
    private String oc3x;
	@XmlAttribute(name = "oc4y")
    private String oc4y;
	@XmlAttribute(name = "oc4x")
    private String oc4x;
	@XmlAttribute(name = "oc1z")
    private String oc1z;
	@XmlAttribute(name = "oc1y")
    private String oc1y;
	@XmlAttribute(name = "oc2z")
    private String oc2z;
	@XmlAttribute(name = "unit"
			+ "")
    private String unit;

    public String getOc1x ()
    {
        return oc1x;
    }

    public void setOc1x (String oc1x)
    {
        this.oc1x = oc1x;
    }

    public String getOc2y ()
    {
        return oc2y;
    }

    public void setOc2y (String oc2y)
    {
        this.oc2y = oc2y;
    }

    public String getOc3z ()
    {
        return oc3z;
    }

    public void setOc3z (String oc3z)
    {
        this.oc3z = oc3z;
    }

    public String getOc2x ()
    {
        return oc2x;
    }

    public void setOc2x (String oc2x)
    {
        this.oc2x = oc2x;
    }

    public String getOc3y ()
    {
        return oc3y;
    }

    public void setOc3y (String oc3y)
    {
        this.oc3y = oc3y;
    }

    public String getOc4z ()
    {
        return oc4z;
    }

    public void setOc4z (String oc4z)
    {
        this.oc4z = oc4z;
    }

    public String getOc3x ()
    {
        return oc3x;
    }

    public void setOc3x (String oc3x)
    {
        this.oc3x = oc3x;
    }

    public String getOc4y ()
    {
        return oc4y;
    }

    public void setOc4y (String oc4y)
    {
        this.oc4y = oc4y;
    }

    public String getOc4x ()
    {
        return oc4x;
    }

    public void setOc4x (String oc4x)
    {
        this.oc4x = oc4x;
    }

    public String getOc1z ()
    {
        return oc1z;
    }

    public void setOc1z (String oc1z)
    {
        this.oc1z = oc1z;
    }

    public String getOc1y ()
    {
        return oc1y;
    }

    public void setOc1y (String oc1y)
    {
        this.oc1y = oc1y;
    }

    public String getOc2z ()
    {
        return oc2z;
    }

    public void setOc2z (String oc2z)
    {
        this.oc2z = oc2z;
    }

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [oc1x = "+oc1x+", oc2y = "+oc2y+", oc3z = "+oc3z+", oc2x = "+oc2x+", oc3y = "+oc3y+", oc4z = "+oc4z+", oc3x = "+oc3x+", oc4y = "+oc4y+", oc4x = "+oc4x+", oc1z = "+oc1z+", oc1y = "+oc1y+", oc2z = "+oc2z+", unit = "+unit+"]";
    }
}

