package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
@XmlAccessorType(XmlAccessType.FIELD)
public class Device
{
    private String dcs;
    @XmlAttribute(name = "dn")
    private String dn;
    private Position position;

    private Norca norca;

    public String getDcs ()
    {
        return dcs;
    }

    public void setDcs (String dcs)
    {
        this.dcs = dcs;
    }

    public String getDn ()
    {
        return dn;
    }

    public void setDn (String dn)
    {
        this.dn = dn;
    }

    public Position getPosition ()
    {
        return position;
    }

    public void setPosition (Position position)
    {
        this.position = position;
    }

    public Norca getNorca ()
    {
        return norca;
    }

    public void setNorca (Norca norca)
    {
        this.norca = norca;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dcs = "+dcs+", dn = "+dn+", position = "+position+", norca = "+norca+"]";
    }
}