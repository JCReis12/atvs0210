package atvdd03OBJETOS;

public class objCar {

	private String placa;
	private int numChassi;
	
	public objCar(String placa) {
		this.placa = placa;
	}
	
	public objCar(String placa, int numChassi) {
		this.placa = placa;
		this.numChassi = numChassi;
	}
	
	public String getplaca() {
		return placa;
	}
	public void setplaca(String placa) {
		this.placa = placa;
	}
	
	public int getnumChassi() {
		return numChassi;
	}
	public void setnumChassi(int numChassi) {
		this.numChassi = numChassi;
	}
	
	
	
	
}
