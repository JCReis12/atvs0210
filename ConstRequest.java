package atvdd03OBJETOS;

public class ConstRequest {

	public static void main(String[] args) {
		
		
		objRequest Consultal1 = new objRequest("João", "21 de janeiro de 2025", "Lucas");
		objRequest Consultal2 = new objRequest("Gustavo", "12 de agosto de 2025");
		objRequest Consultal3 = new objRequest("Yago");
		
		System.out.println("Caso 1");
		System.out.println(Consultal1.getnomePa());
		System.out.println(Consultal1.getnomeDent());
		System.out.println(Consultal1.getdata());
		System.out.println(" ");
		System.out.println("Caso 2");
		System.out.println(Consultal2.getnomePa());
		System.out.println(Consultal2.getnomeDent());
		System.out.println(" ");
		System.out.println("Caso 3");
		System.out.println(Consultal3.getdata());

	}

}
