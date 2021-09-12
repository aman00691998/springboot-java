package com.example.techM.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employees")

public class Employee {

	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private long id;


@Column(name="Developer_ID")
	private String developer;
@Column(name="Release_id")
	private String release;
@Column(name="Track_Name")
	private String track;
@Column(name="DS")
	private String dsdef;
@Column(name="US")
	private String usdef;
@Column(name="Unit")
	private String unittest;
@Column(name="PrCom")
	private String prcomments;
	
	
	public Employee()
	{
		
	}
	
	
	
	
	

	public Employee(String developer, String release, String track, String dsdef, String usdef, String unittest,
			String prcomments) {
		super();
		this.developer = developer;
		this.release = release;
		this.track = track;
		this.dsdef = dsdef;
		this.usdef = usdef;
		this.unittest = unittest;
		this.prcomments = prcomments;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getDsdef() {
		return dsdef;
	}

	public void setDsdef(String dsdef) {
		this.dsdef = dsdef;
	}

	public String getUsdef() {
		return usdef;
	}

	public void setUsdef(String usdef) {
		this.usdef = usdef;
	}

	public String getUnittest() {
		return unittest;
	}

	public void setUnittest(String unittest) {
		this.unittest = unittest;
	}

	public String getPrcomments() {
		return prcomments;
	}

	public void setPrcomments(String prcomments) {
		this.prcomments = prcomments;
	}

	
	
	
}
