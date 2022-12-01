	package org.sick.tcp.connector.dto;

	import javax.xml.bind.annotation.XmlRootElement;

	@XmlRootElement
	public class XMLData
	{
	    private Objectdata objectdata;

	    public Objectdata getObjectdata ()
	    {
	        return objectdata;
	    }

	    public void setObjectdata (Objectdata objectdata)
	    {
	        this.objectdata = objectdata;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [objectdata = "+objectdata+"]";
	    }
	}


