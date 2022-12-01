package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
@XmlAccessorType(XmlAccessType.FIELD)
public class Sortstate
{
	@XmlAttribute(name = "sortname")
    private String sortname;
	@XmlAttribute(name = "session")
    private String session;

    public String getSortname ()
    {
        return sortname;
    }

    public void setSortname (String sortname)
    {
        this.sortname = sortname;
    }

    public String getSession ()
    {
        return session;
    }

    public void setSession (String session)
    {
        this.session = session;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [sortname = "+sortname+", session = "+session+"]";
    }
}
