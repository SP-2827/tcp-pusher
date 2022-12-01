
package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Objectdata

{

	private Images images;

	private String tokenid;

	private String incr;

	private HostMsg HostMsg;

	private Scaledata scaledata;

	private String deviceid;

	@XmlElement(name = "hostmessage")
	private String hostmessage;

	private Sortstate sortstate;

	private General general;

	private String condition;

	private Volumetric volumetric;

	private String seqnb;

	private Sorterstate sorterstate;

	private String devicename;

	private Barcode barcode;

	private String timestamp;

	public Images getImages() {
		return images;
	}

	public void setImages(Images images) {
		this.images = images;
	}

	public String getTokenid() {
		return tokenid;
	}

	public void setTokenid(String tokenid) {
		this.tokenid = tokenid;
	}

	public String getIncr() {
		return incr;
	}

	public void setIncr(String incr) {
		this.incr = incr;
	}

	public HostMsg getHostMsg() {
		return HostMsg;
	}

	public void setHostMsg(HostMsg HostMsg) {
		this.HostMsg = HostMsg;
	}

	public Scaledata getScaledata() {
		return scaledata;
	}

	public void setScaledata(Scaledata scaledata) {
		this.scaledata = scaledata;
	}

//    public String getVersion ()
//    {
//        return version;
//    }
//
//    public void setVersion (String version)
//    {
//        this.version = version;
//    }

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getHostmessage() {
		return hostmessage;
	}

	public void setHostmessage(String hostmessage) {
		this.hostmessage = hostmessage;
	}

	public Sortstate getSortstate() {
		return sortstate;
	}

	public void setSortstate(Sortstate sortstate) {
		this.sortstate = sortstate;
	}

	public General getGeneral() {
		return general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Volumetric getVolumetric() {
		return volumetric;
	}

	public void setVolumetric(Volumetric volumetric) {
		this.volumetric = volumetric;
	}

	public String getSeqnb() {
		return seqnb;
	}

	public void setSeqnb(String seqnb) {
		this.seqnb = seqnb;
	}

	public Sorterstate getSorterstate() {
		return sorterstate;
	}

	public void setSorterstate(Sorterstate sorterstate) {
		this.sorterstate = sorterstate;
	}

	public String getDevicename() {
		return devicename;
	}

	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}

	public Barcode getBarcode() {
		return barcode;
	}

	public void setBarcode(Barcode barcode) {
		this.barcode = barcode;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

//    @Override
//    public String toString()
//    {
//        return "ClassPojo [images = "+images+", tokenid = "+tokenid+", incr = "+incr+", HostMsg = "+HostMsg+", scaledata = "+scaledata+", version = "+version+", deviceid = "+deviceid+", hostmessage = "+hostmessage+", sortstate = "+sortstate+", general = "+general+", condition = "+condition+", volumetric = "+volumetric+", seqnb = "+seqnb+", sorterstate = "+sorterstate+", devicename = "+devicename+", barcode = "+barcode+", timestamp = "+timestamp+"]";
//    }
}
