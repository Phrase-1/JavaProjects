import java.time.*;
import java.util.Date;
public abstract class Vehicle {
	private String color;
	private int weight;
	private int speed;
	public Vehicle(String color,int weight,int speed)
	{
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	public String getcolor()
	{
		return color;
	}
	public int getweight()
	{
		return weight;
	}
	public int getspeed()
	{
		return speed;
	}
	public void InfoS()
	{
		System.out.println("color: "+ color + "\nweight: "+ weight + "\nspeed: "+speed);
	}
	public abstract LocalDate manufactureDate();
}