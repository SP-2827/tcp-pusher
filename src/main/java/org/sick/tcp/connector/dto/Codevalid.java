package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Codevalid {
	private String cs;

	private String st;

	private String bc;

	private String readlist;

	private String condition;

	private Devices devices;

	private String wud;

	private String cl;
	@XmlAttribute(name = "id")
	private String id;

	private Position position;

	private String bdn;

	private Norca norca;

	public String getCs() {
		return cs;
	}

	public void setCs(String cs) {
		this.cs = cs;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public String getBc() {
		return bc;
	}

	public void setBc(String bc) {
		this.bc = bc;
	}

	public String getReadlist() {
		return readlist;
	}

	public void setReadlist(String readlist) {
		this.readlist = readlist;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Devices getDevices() {
		return devices;
	}

	public void setDevices(Devices devices) {
		this.devices = devices;
	}

	public String getWud() {
		return wud;
	}

	public void setWud(String wud) {
		this.wud = wud;
	}

	public String getCl() {
		return cl;
	}

	public void setCl(String cl) {
		this.cl = cl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getBdn() {
		return bdn;
	}

	public void setBdn(String bdn) {
		this.bdn = bdn;
	}

	public Norca getNorca() {
		return norca;
	}

	public void setNorca(Norca norca) {
		this.norca = norca;
	}

	@Override
	public String toString() {
		return "ClassPojo [cs = " + cs + ", st = " + st + ", bc = " + bc + ", readlist = " + readlist + ", condition = "
				+ condition + ", devices = " + devices + ", wud = " + wud + ", cl = " + cl + ", id = " + id
				+ ", position = " + position + ", bdn = " + bdn + ", norca = " + norca + "]";
	}
}
