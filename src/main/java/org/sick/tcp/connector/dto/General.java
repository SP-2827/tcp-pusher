package org.sick.tcp.connector.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class General {
	private Tt tt;
	@XmlAttribute(name = "errornb")
	private String errornb;

	private Uds uds;

	private Otl otl;

	private Oga oga;
	@XmlAttribute(name = "ox")
	private String ox;

	@XmlAttribute(name = "iostate")
	private String iostate;
	@XmlAttribute(name = "is")
	private String is;
	@XmlAttribute(name = "lfts")
	private String lfts;

	private String devicelist;
	@XmlAttribute(name = "oc")
	private String oc;

	private Udf udf;
	@XmlAttribute(name = "oi")
	private String oi;

	private Udi udi;
	@XmlAttribute(name = "ie")
	private String ie;
	@XmlAttribute(name = "lftf")
	private String lftf;
	@XmlAttribute(name = "on")
	private String on;

	private String timestamp;

	public Tt getTt() {
		return tt;
	}

	public void setTt(Tt tt) {
		this.tt = tt;
	}

	public String getErrornb() {
		return errornb;
	}

	public void setErrornb(String errornb) {
		this.errornb = errornb;
	}

	public Uds getUds() {
		return uds;
	}

	public void setUds(Uds uds) {
		this.uds = uds;
	}

	public Otl getOtl() {
		return otl;
	}

	public void setOtl(Otl otl) {
		this.otl = otl;
	}

	public Oga getOga() {
		return oga;
	}

	public void setOga(Oga oga) {
		this.oga = oga;
	}

	public String getOx() {
		return ox;
	}

	public void setOx(String ox) {
		this.ox = ox;
	}

	public String getIostate() {
		return iostate;
	}

	public void setIostate(String iostate) {
		this.iostate = iostate;
	}

	public String getIs() {
		return is;
	}

	public void setIs(String is) {
		this.is = is;
	}

	public String getLfts() {
		return lfts;
	}

	public void setLfts(String lfts) {
		this.lfts = lfts;
	}

	public String getDevicelist() {
		return devicelist;
	}

	public void setDevicelist(String devicelist) {
		this.devicelist = devicelist;
	}

	public String getOc() {
		return oc;
	}

	public void setOc(String oc) {
		this.oc = oc;
	}

	public Udf getUdf() {
		return udf;
	}

	public void setUdf(Udf udf) {
		this.udf = udf;
	}

	public String getOi() {
		return oi;
	}

	public void setOi(String oi) {
		this.oi = oi;
	}

	public Udi getUdi() {
		return udi;
	}

	public void setUdi(Udi udi) {
		this.udi = udi;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getLftf() {
		return lftf;
	}

	public void setLftf(String lftf) {
		this.lftf = lftf;
	}

	public String getOn() {
		return on;
	}

	public void setOn(String on) {
		this.on = on;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "ClassPojo [tt = " + tt + ", errornb = " + errornb + ", uds = " + uds + ", otl = " + otl + ", oga = "
				+ oga + ", ox = " + ox + ", iostate = " + iostate + ", is = " + is + ", lfts = " + lfts
				+ ", devicelist = " + devicelist + ", oc = " + oc + ", udf = " + udf + ", oi = " + oi + ", udi = " + udi
				+ ", ie = " + ie + ", lftf = " + lftf + ", on = " + on + ", timestamp = " + timestamp + "]";
	}
}
