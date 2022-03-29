package com.lti.appl.busreservationbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Registration")

public class Registration {
	@Id
	@Column(name = "RID")
	private int rid;
	@Column(name = "RFIRSTNAME")
	private String rfirstname;
	@Column(name = "RLASTNAME")
	private String rlastname;
	@Column(name = "REMAIL")
	private String remail;
	@Column(name = "RCONTACT")
	private double rcontact;
	@Column(name = "RADDRESS")
	private String raddress;
	@Column(name = "RPASS")
	private String rpass;
	@Column(name = "TID")
	private int travid;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRfirstname() {
		return rfirstname;
	}
	public void setRfirstname(String rfirstname) {
		this.rfirstname = rfirstname;
	}
	public String getRlastname() {
		return rlastname;
	}
	public void setRlastname(String rlastname) {
		this.rlastname = rlastname;
	}
	public String getRemail() {
		return remail;
	}
	public void setRemail(String remail) {
		this.remail = remail;
	}
	public double getRcontact() {
		return rcontact;
	}
	public void setRcontact(double rcontact) {
		this.rcontact = rcontact;
	}
	public String getRaddress() {
		return raddress;
	}
	public void setRaddress(String raddress) {
		this.raddress = raddress;
	}
	public String getRpass() {
		return rpass;
	}
	public void setRpass(String rpass) {
		this.rpass = rpass;
	}
	public int getTravid() {
		return travid;
	}
	public void setTravid(int travid) {
		this.travid = travid;
	}
	public Registration(int rid, String rfirstname, String rlastname, String remail, double rcontact, String raddress,
			String rpass, int travid) {
		super();
		this.rid = rid;
		this.rfirstname = rfirstname;
		this.rlastname = rlastname;
		this.remail = remail;
		this.rcontact = rcontact;
		this.raddress = raddress;
		this.rpass = rpass;
		this.travid = travid;
	}
	public Registration() {
		super();
	}
	@Override
	public String toString() {
		return "Registration [rid=" + rid + ", rfirstname=" + rfirstname + ", rlastname=" + rlastname + ", remail="
				+ remail + ", rcontact=" + rcontact + ", raddress=" + raddress + ", rpass=" + rpass + ", travid="
				+ travid + "]";
	}
	
	

	

}