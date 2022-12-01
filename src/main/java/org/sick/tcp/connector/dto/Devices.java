package org.sick.tcp.connector.dto;

public class Devices
{
    private Device[] device;

    public Device[] getDevice ()
    {
        return device;
    }

    public void setDevice (Device[] device)
    {
        this.device = device;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [device = "+device+"]";
    }
}

