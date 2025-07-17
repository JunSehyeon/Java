package test3;

class Vehical {
	private String name;
	private int price;
	
	public Vehical(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("---------");
		System.out.println("차량명"+name);
		System.out.println("가격"+price);
	}
}

class CarFactory{
	private static CarFactory instance = new CarFactory();
	CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Vehical createCar(String name, int price) {
		return new Vehical(name,price);
	}
}

public class Test05 {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		
		Vehical avante = factory. createCar("아반뗴",2500);
		Vehical sonata = factory. createCar("소나타",2500);
		avante.info();
		sonata.info();
	}
}
