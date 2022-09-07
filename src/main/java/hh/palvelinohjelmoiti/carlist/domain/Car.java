package hh.palvelinohjelmoiti.carlist.domain;

public class Car { //kaikki luokat peritytyvät object-luokasta
	// attribuutit
	private String model; //malli
	private int year; //valmistusvuosi
	
	//konstruktorit parametriton
	public Car() {
		super(); //kutsutaan yliluokan parametritonta konstruktoria (tässä ei ole extends)
		this.model = null;
		this.year = 0;
	}
	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}
	//setterit
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	// getterit
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	// toString
	@Override //dokumentoiva annotaatio (ei vaikuta järjestelmään mitenkään vrt springin annotaatiot joilla väliä)
	public String toString() {
		return "Car [model=" + model + ", year=" + year + "]";
	}
	
	

}
