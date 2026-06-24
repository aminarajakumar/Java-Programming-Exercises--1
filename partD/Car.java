package partD;

public class Car {
	String brand;
	String model;
	long price;
	
	Car(String brand,String model,long price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public void display() {
		System.out.println("Brand: "+brand+"\nModel: "+model+"\nPrice: "+price);
	}
	
	public static void main(String args[]) {
		Car c1=new Car("Hyundai","Creta",1500000);
		Car c2=new Car("Maruti Suzuki","Swift",800000);
		Car c3=new Car("Toyota","Fortuner",3500000);
		System.out.println("Car Details");
		c1.display();
		c2.display();
		c3.display();
		
	}
}
