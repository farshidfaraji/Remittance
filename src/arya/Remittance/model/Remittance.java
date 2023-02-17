package arya.Remittance.model;

import arya.Remittance.model.abstracts.Entity;

public class Remittance extends Entity{

	private LoadInformation loadInformation;
	private DriverInformation driverInformatio;
	private Rent rent;

	public LoadInformation getLoadInformation() {
		return loadInformation;
	}

	public void setLoadInformation(LoadInformation loadInformation) {
		this.loadInformation = loadInformation;
	}

	public DriverInformation getDriverInformatio() {
		return driverInformatio;
	}

	public void setDriverInformatio(DriverInformation driverInformatio) {
		this.driverInformatio = driverInformatio;
	}

	public Rent getRent() {
		return rent;
	}

	public void setRent(Rent rent) {
		this.rent = rent;
	}

}
