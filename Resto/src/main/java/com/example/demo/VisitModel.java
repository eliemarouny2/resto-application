package com.example.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="visit")
public class VisitModel {
	
	public VisitModel() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long VisitID;
	
	@Column(name="visit_date")
	private Date visitdate;
	
    @ManyToOne
    @JoinColumn(name="resto_id")
	private RestoModel restomodel;
	
		public VisitModel(long visitID, Date visitdate,RestoModel restomodel) {
			super();
			this.VisitID = visitID;
			this.visitdate = visitdate;
			this.restomodel=restomodel;
			
		}

	
	public long getVisitID() {
		return VisitID;
	}
	public long setVisitID(long visitID) {
		return VisitID = visitID;
	}

	

	
	public Date getVisitdate() {
		return visitdate;
	}
	public void setVisitDate(Date visitdate) {
		this.visitdate = visitdate;
	}
	
    public void setRestaurant(RestoModel restomodel) {
        this.restomodel = restomodel;
    }


	public RestoModel getRestomodel() {
		return restomodel;
	}


	public void setRestomodel(RestoModel restomodel) {
		this.restomodel = restomodel;
	}


	public void setVisitdate(Date visitdate) {
		this.visitdate = visitdate;
	}
	



}
