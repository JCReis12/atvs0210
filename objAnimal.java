package atvdd03OBJETOS;

public class objAnimal {
	
	private String cor;
	private float tamanho;
	
	public objAnimal(String cor) {
		this.cor = cor;
	}
	
	public objAnimal(String cor, float tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	public String getcor() {
		return cor;
	}
	public void setcor(String cor) {
		this.cor = cor;
	}
	
	public float gettamanho() {
		return tamanho;
	}
	public void settamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	

}
