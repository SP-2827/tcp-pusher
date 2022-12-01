package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
@XmlAccessorType(XmlAccessType.FIELD)

public class Udf
{

	@XmlAttribute(name = "udf1")
    private String udf1;

    public String getUdf1 ()
    {
        return udf1;
    }

    public void setUdf1 (String udf1)
    {
        this.udf1 = udf1;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [udf1 = "+udf1+"]";
    }
}
