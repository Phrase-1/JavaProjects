import java.time.*;
import java.util.Date;

public class Car extends Vehicle {
	private String manufacturer;
	private LocalDate timeOfPurchase;
	private LocalDate manufacturedate;
	public Car(String color, int weight, int speed,String manufacturer)
	{
		super(color, weight, speed);
		this.manufacturer = manufacturer;
		this.timeOfPurchase = LocalDate.now();
		manufacturedate = LocalDate.now();
	}
	public void Info()
	{
		super.InfoS();
		System.out.println("manufacturer: " +  manufacturer+"\ntimeOfPurchase: " +  timeOfPurchase +"\n");
	}
	public LocalDate manufactureDate()
	{
		return manufacturedate;
	}
	public boolean equals(Object otherCar)
	{
		if(this == otherCar) return true;
		if(otherCar == null) return false;
		if(getClass() != otherCar.getClass()) return false;
		Car other = (Car)otherCar;
		return manufacturer.equals(other.manufacturer) 
				&& timeOfPurchase.equals(other.timeOfPurchase)
				&&(this.getcolor().equals(other.getcolor()))
				&&(this.getweight()==other.getweight())
				&&(this.getspeed()==other.getspeed());
	}
}
