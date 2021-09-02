package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "delivery_boy")
public class DeliveryBoy {
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int deliveryBoyId;
	 
	 @Column
	 private String adharNo;
	 
	 @Column
	 private String drivingLicese;
	 
	 
		/*
		 * private String extra1; private String extra2;
		 */
	
	 
	 public DeliveryBoy() {
			super();
			
		}

	
	 
	 
	public DeliveryBoy(int deliveryBoyId, String adharNo, String drivingLicese) {
		super();
		this.deliveryBoyId = deliveryBoyId;
		this.adharNo = adharNo;
		this.drivingLicese = drivingLicese;
		
	}



	

	public DeliveryBoy(String adharNo, String drivingLicese) {
		super();
		this.adharNo = adharNo;
		this.drivingLicese = drivingLicese;
		
	}




	public int getDeliveryBoyId() {
		return deliveryBoyId;
	}




	public void setDeliveryBoyId(int deliveryBoyId) {
		this.deliveryBoyId = deliveryBoyId;
	}




	public String getAdharNo() {
		return adharNo;
	}




	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}




	public String getDrivingLicese() {
		return drivingLicese;
	}




	public void setDrivingLicese(String drivingLicese) {
		this.drivingLicese = drivingLicese;
	}



	
	
	

	@Override
	public String toString() {
		return "DeliveryBoy [deliveryBoyId=" + deliveryBoyId + ", adharNo=" + adharNo + ", drivingLicese="
				+ drivingLicese +"]";
	}







	@OneToOne(cascade=CascadeType.ALL )
	@JoinColumn(name="id")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
