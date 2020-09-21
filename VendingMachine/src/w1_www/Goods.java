package w1_www;

public class Goods {
	private String name;
	private double price;
	private int reserve;
	public Goods(String name, double price, int reserve) {
		this.name = name;
		this.price = price;
		this.reserve = reserve;
	}
	public void Purchase(int number) {
		this.reserve = this.reserve - number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getReserve() {
		return reserve;
	}
	public void setReserve(int reserve) {
		this.reserve = reserve;
	}
	
}
