package arya.Remittance.model;

import arya.Remittance.model.abstracts.Entity;

public class DriverInformation extends Entity {
	private String nameDriver;
	private String smartDriver;
	private String phonenamber;
	private String typrCar;
	private String carTrail;
	private String plague;
	private String seriesPlague;
	private String smartCar;

	public String getNameDriver() {
		return nameDriver;
	}

	public void setNameDriver(String nameDriver) {
		this.nameDriver = nameDriver;
	}

	public String getSmartDriver() {
		return smartDriver;
	}

	public void setSmartDriver(String smartDriver) {
		this.smartDriver = smartDriver;
	}

	public String getPhonenamber() {
		return phonenamber;
	}

	public void setPhonenamber(String phonenamber) {
		this.phonenamber = phonenamber;
	}

	public String getTyprCar() {
		return typrCar;
	}

	public void setTyprCar(String typrCar) {
		this.typrCar = typrCar;
	}

	public String getCarTrail() {
		return carTrail;
	}

	public void setCarTrail(String carTrail) {
		this.carTrail = carTrail;
	}

	public String getPlague() {
		return plague;
	}

	public void setPlague(String plague) {
		this.plague = plague;
	}

	public String getSeriesPlague() {
		return seriesPlague;
	}

	public void setSeriesPlague(String seriesPlague) {
		this.seriesPlague = seriesPlague;
	}

	public String getSmartCar() {
		return smartCar;
	}

	public void setSmartCar(String smartCar) {
		this.smartCar = smartCar;
	}

}
