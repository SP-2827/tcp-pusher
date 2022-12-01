package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
@XmlAccessorType(XmlAccessType.FIELD)
public class Scaledata
{
	@XmlAttribute(name = "ows")
    private String ows;

    private Owe owe;

    public String getOws ()
    {
        return ows;
    }

    public void setOws (String ows)
    {
        this.ows = ows;
    }

    public Owe getOwe ()
    {
        return owe;
    }

    public void setOwe (Owe owe)
    {
        this.owe = owe;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ows = "+ows+", owe = "+owe+"]";
    }
}
			

