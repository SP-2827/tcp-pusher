
package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Sorterstate
{
	@XmlAttribute(name = "state")
    private String state;
	
    private Speed speed;

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public Speed getSpeed ()
    {
        return speed;
    }

    public void setSpeed (Speed speed)
    {
        this.speed = speed;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [state = "+state+", speed = "+speed+"]";
    }
}
			
	
