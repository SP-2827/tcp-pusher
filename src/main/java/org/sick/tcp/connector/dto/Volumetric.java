
package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)

public class Volumetric
{
    private Otve otve;
    
    private Oa oa;
	
    private Obv obv;
	
    private Orv orv;
	
    private Size size;

    private Polygon polygon;
	@XmlAttribute(name = "omsl")
    private String oms1;
	@XmlAttribute(name = "oms2")
    private String oms2;
	@XmlAttribute(name = "oms3")
    private String oms3;

    public Otve getOtve ()
    {
        return otve;
    }

    public void setOtve (Otve otve)
    {
        this.otve = otve;
    }

    public Oa getOa ()
    {
        return oa;
    }

    public void setOa (Oa oa)
    {
        this.oa = oa;
    }

    public Obv getObv ()
    {
        return obv;
    }

    public void setObv (Obv obv)
    {
        this.obv = obv;
    }

    public Orv getOrv ()
    {
        return orv;
    }

    public void setOrv (Orv orv)
    {
        this.orv = orv;
    }

    public Size getSize ()
    {
        return size;
    }

    public void setSize (Size size)
    {
        this.size = size;
    }

    public Polygon getPolygon ()
    {
        return polygon;
    }

    public void setPolygon (Polygon polygon)
    {
        this.polygon = polygon;
    }

    public String getOms1 ()
    {
        return oms1;
    }

    public void setOms1 (String oms1)
    {
        this.oms1 = oms1;
    }

    public String getOms2 ()
    {
        return oms2;
    }

    public void setOms2 (String oms2)
    {
        this.oms2 = oms2;
    }

    public String getOms3 ()
    {
        return oms3;
    }

    public void setOms3 (String oms3)
    {
        this.oms3 = oms3;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [otve = "+otve+", oa = "+oa+", obv = "+obv+", orv = "+orv+", size = "+size+", polygon = "+polygon+", oms1 = "+oms1+", oms2 = "+oms2+", oms3 = "+oms3+"]";
    }
}

