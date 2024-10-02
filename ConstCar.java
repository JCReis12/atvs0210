package atvdd03OBJETOS;

public class ConstCar {

	public static void main(String[] args) {
		
		objCar car1 = new objCar("ABC1D23", 1234567890);
		objCar car2 = new objCar("ZYX9W87");
		
		System.out.println("Carro 1");
		System.out.println(car1.getplaca());
		System.out.println(car1.getnumChassi());
		System.out.println(" ");
		System.out.println("Carro 2");
		System.out.println(car2.getplaca());
		System.out.println(car2.getnumChassi());
		

	}

}
