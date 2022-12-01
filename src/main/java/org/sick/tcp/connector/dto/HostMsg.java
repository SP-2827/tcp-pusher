package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class HostMsg
{
	@XmlElement(name = "ScanData")
    private String ScanData2;
	@XmlElement(name = "ExternalReader")
    private String ExternalReader;

    public String getScanData2 ()
    {
        return ScanData2;
    }

    public void setScanData2 (String ScanData2)
    {
        this.ScanData2 = ScanData2;
    }

    public String getExternalReader ()
    {
        return ExternalReader;
    }

    public void setExternalReader (String ExternalReader)
    {
        this.ExternalReader = ExternalReader;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ScanData2 = "+ScanData2+", ExternalReader = "+ExternalReader+"]";
    }
}

