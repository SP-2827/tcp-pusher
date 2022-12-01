package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Norca
{
	@XmlAttribute(name = "fv")
    private String fv;
	@XmlAttribute(name = "fee")
    private String fee;
	@XmlAttribute(name = "vee")
    private String vee;
	@XmlAttribute(name = "rq")
    private String rq;

    public String getFv ()
    {
        return fv;
    }

    public void setFv (String fv)
    {
        this.fv = fv;
    }

    public String getFee ()
    {
        return fee;
    }

    public void setFee (String fee)
    {
        this.fee = fee;
    }

    public String getVee ()
    {
        return vee;
    }

    public void setVee (String vee)
    {
        this.vee = vee;
    }

    public String getRq ()
    {
        return rq;
    }

    public void setRq (String rq)
    {
        this.rq = rq;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [fv = "+fv+", fee = "+fee+", vee = "+vee+", rq = "+rq+"]";
    }
}
	
