
package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Udi
{
	@XmlAttribute(name = "udi1")
    private String udi1;
	@XmlAttribute(name = "udi8")
    private String udi8;
	@XmlAttribute(name = "udi9")
    private String udi9;
	@XmlAttribute(name = "udi6")
    private String udi6;
	@XmlAttribute(name = "udi7")
    private String udi7;
	@XmlAttribute(name = "udi4")
    private String udi4;
	@XmlAttribute(name = "udi5")
    private String udi5;
	@XmlAttribute(name = "udi2")
    private String udi2;
	@XmlAttribute(name = "udi3")
    private String udi3;

    public String getUdi1 ()
    {
        return udi1;
    }

    public void setUdi1 (String udi1)
    {
        this.udi1 = udi1;
    }

    public String getUdi8 ()
    {
        return udi8;
    }

    public void setUdi8 (String udi8)
    {
        this.udi8 = udi8;
    }

    public String getUdi9 ()
    {
        return udi9;
    }

    public void setUdi9 (String udi9)
    {
        this.udi9 = udi9;
    }

    public String getUdi6 ()
    {
        return udi6;
    }

    public void setUdi6 (String udi6)
    {
        this.udi6 = udi6;
    }

    public String getUdi7 ()
    {
        return udi7;
    }

    public void setUdi7 (String udi7)
    {
        this.udi7 = udi7;
    }

    public String getUdi4 ()
    {
        return udi4;
    }

    public void setUdi4 (String udi4)
    {
        this.udi4 = udi4;
    }

    public String getUdi5 ()
    {
        return udi5;
    }

    public void setUdi5 (String udi5)
    {
        this.udi5 = udi5;
    }

    public String getUdi2 ()
    {
        return udi2;
    }

    public void setUdi2 (String udi2)
    {
        this.udi2 = udi2;
    }

    public String getUdi3 ()
    {
        return udi3;
    }

    public void setUdi3 (String udi3)
    {
        this.udi3 = udi3;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [udi1 = "+udi1+", udi8 = "+udi8+", udi9 = "+udi9+", udi6 = "+udi6+", udi7 = "+udi7+", udi4 = "+udi4+", udi5 = "+udi5+", udi2 = "+udi2+", udi3 = "+udi3+"]";
    }
}

