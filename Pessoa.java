package construtorAula;

public class Pessoa {
	//Criando as variáveis
	private String nome;
	private int idade;
	
	//Criando construtores
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Gets e Sets
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public int idade() {
		return idade;
	}
	public void setidade(int idade) {
		this.idade = idade;
	}
	
	
	

}
