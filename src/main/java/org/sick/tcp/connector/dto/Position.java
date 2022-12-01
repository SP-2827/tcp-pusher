package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
	public class Position
	{
	    @XmlAttribute(name = "unit")
	    private String unit;
	    @XmlAttribute(name = "xmin")
	    private String xmin;
	    @XmlAttribute(name = "xmax")
	    private String xmax;
	    @XmlAttribute(name = "x")
	    private String x;
	    @XmlAttribute(name = "y")
	    private String y;
	    @XmlAttribute(name = "z")
	    private String z;
	    public String getUnit ()
	    {
	        return unit;
	    }

	    public void setUnit (String unit)
	    {
	        this.unit = unit;
	    }

	    public String getXmin ()
	    {
	        return xmin;
	    }

	    public void setXmin (String xmin)
	    {
	        this.xmin = xmin;
	    }

	    public String getXmax ()
	    {
	        return xmax;
	    }

	    public void setXmax (String xmax)
	    {
	        this.xmax = xmax;
	    }

	    public String getX ()
	    {
	        return x;
	    }

	    public void setX (String x)
	    {
	        this.x = x;
	    }

	    public String getY ()
	    {
	        return y;
	    }

	    public void setY (String y)
	    {
	        this.y = y;
	    }

	    public String getZ ()
	    {
	        return z;
	    }

	    public void setZ (String z)
	    {
	        this.z = z;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [unit = "+unit+", xmin = "+xmin+", xmax = "+xmax+", x = "+x+", y = "+y+", z = "+z+"]";
	    }
	}

