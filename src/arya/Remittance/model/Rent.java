package arya.Remittance.model;

import arya.Remittance.model.abstracts.Entity;

public class Rent extends Entity {
	private String loanRent;
	private String cashRent;
	private String remainingCommission;
	private String cashCommission;
	private String cardCommission;
	private String descriptionCardCommission;
	private String intermediation;
	private String description;

	public String getLoanRent() {
		return loanRent;
	}

	public void setLoanRent(String loanRent) {
		this.loanRent = loanRent;
	}

	public String getCashRent() {
		return cashRent;
	}

	public void setCashRent(String cashRent) {
		this.cashRent = cashRent;
	}

	public String getRemainingCommission() {
		return remainingCommission;
	}

	public void setRemainingCommission(String remainingCommission) {
		this.remainingCommission = remainingCommission;
	}

	public String getCashCommission() {
		return cashCommission;
	}

	public void setCashCommission(String cashCommission) {
		this.cashCommission = cashCommission;
	}

	public String getCardCommission() {
		return cardCommission;
	}

	public void setCardCommission(String cardCommission) {
		this.cardCommission = cardCommission;
	}

	public String getDescriptionCardCommission() {
		return descriptionCardCommission;
	}

	public void setDescriptionCardCommission(String descriptionCardCommission) {
		this.descriptionCardCommission = descriptionCardCommission;
	}

	public String getIntermediation() {
		return intermediation;
	}

	public void setIntermediation(String intermediation) {
		this.intermediation = intermediation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
