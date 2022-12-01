
package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Uds
{
	@XmlAttribute(name = "uds8")
    private String uds8;
	@XmlAttribute(name = "uds9")
    private String uds9;
	@XmlAttribute(name = "uds6")
    private String uds6;
	@XmlAttribute(name = "uds7")
    private String uds7;
	@XmlAttribute(name = "uds2")
    private String uds2;
	@XmlAttribute(name = "uds3")
    private String uds3;
	@XmlAttribute(name = "uds1")
    private String uds1;
	@XmlAttribute(name = "uds10")
    private String uds10;
	
    public String getUds8 ()
    {
        return uds8;
    }

    public void setUds8 (String uds8)
    {
        this.uds8 = uds8;
    }

    public String getUds9 ()
    {
        return uds9;
    }

    public void setUds9 (String uds9)
    {
        this.uds9 = uds9;
    }

    public String getUds6 ()
    {
        return uds6;
    }

    public void setUds6 (String uds6)
    {
        this.uds6 = uds6;
    }

    public String getUds7 ()
    {
        return uds7;
    }

    public void setUds7 (String uds7)
    {
        this.uds7 = uds7;
    }

    public String getUds2 ()
    {
        return uds2;
    }

    public void setUds2 (String uds2)
    {
        this.uds2 = uds2;
    }

    public String getUds3 ()
    {
        return uds3;
    }

    public void setUds3 (String uds3)
    {
        this.uds3 = uds3;
    }

    public String getUds1 ()
    {
        return uds1;
    }

    public void setUds1 (String uds1)
    {
        this.uds1 = uds1;
    }

    public String getUds10 ()
    {
        return uds10;
    }

    public void setUds10 (String uds10)
    {
        this.uds10 = uds10;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [uds8 = "+uds8+", uds9 = "+uds9+", uds6 = "+uds6+", uds7 = "+uds7+", uds2 = "+uds2+", uds3 = "+uds3+", uds1 = "+uds1+", uds10 = "+uds10+"]";
    }
}
