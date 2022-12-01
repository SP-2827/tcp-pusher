package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
@XmlAccessorType(XmlAccessType.FIELD)

public class Barcode
{
	@XmlAttribute(name = "cc")
    private String cc;

    private Codevalid[] codevalid;
    @XmlAttribute(name = "vcc")
    private String vcc;

    public String getCc ()
    {
        return cc;
    }

    public void setCc (String cc)
    {
        this.cc = cc;
    }

    public Codevalid[] getCodevalid ()
    {
        return codevalid;
    }

    public void setCodevalid (Codevalid[] codevalid)
    {
        this.codevalid = codevalid;
    }

    public String getVcc ()
    {
        return vcc;
    }

    public void setVcc (String vcc)
    {
        this.vcc = vcc;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cc = "+cc+", codevalid = "+codevalid+", vcc = "+vcc+"]";
    }
}

