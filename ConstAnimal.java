package atvdd03OBJETOS;

public class ConstAnimal {

	public static void main(String[] args) {
		
		objAnimal animal1 = new objAnimal("Preto", 70);
		objAnimal animal2 = new objAnimal("Marrom");
		
		System.out.println("Animal 1");
		System.out.println(animal1.getcor());
		System.out.println(animal1.gettamanho()+" cm");
		System.out.println(" ");
		System.out.println("Animal 2");
		System.out.println(animal2.getcor());
		System.out.println(animal2.gettamanho());
		

	}

}
