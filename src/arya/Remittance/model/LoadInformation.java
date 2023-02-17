package arya.Remittance.model;

import java.util.Calendar;

import arya.Remittance.model.abstracts.Entity;

public class LoadInformation extends Entity {
	private int IdRemittance;
	private Calendar date;
	private String username;
	private String sender;
	private String origin;
	private String addressOrigin;
	private String receivar;
	private String dstination;
	private String addressDstination;
	private String produntType;
	private int quantity;
	private String insuranceValue;

	public int getIdRemittance() {
		return IdRemittance;
	}

	public void setIdRemittance(int idRemittance) {
		IdRemittance = idRemittance;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getAddressOrigin() {
		return addressOrigin;
	}

	public void setAddressOrigin(String addressOrigin) {
		this.addressOrigin = addressOrigin;
	}

	public String getReceivar() {
		return receivar;
	}

	public void setReceivar(String receivar) {
		this.receivar = receivar;
	}

	public String getDstination() {
		return dstination;
	}

	public void setDstination(String dstination) {
		this.dstination = dstination;
	}

	public String getAddressDstination() {
		return addressDstination;
	}

	public void setAddressDstination(String addressDstination) {
		this.addressDstination = addressDstination;
	}

	public String getProduntType() {
		return produntType;
	}

	public void setProduntType(String produntType) {
		this.produntType = produntType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getInsuranceValue() {
		return insuranceValue;
	}

	public void setInsuranceValue(String insuranceValue) {
		this.insuranceValue = insuranceValue;
	}

}
