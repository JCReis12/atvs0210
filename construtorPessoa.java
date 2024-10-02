package construtorAula;

public class construtorPessoa {

	public static void main(String[] args) {
		
		//Criando os "objetos", conectando com a classe "Pessoa"
		Pessoa jogador2 = new Pessoa("Messi", 36);
		Pessoa jogador3 = new Pessoa("CR7");
		
		//Mostrando oque foi criado
		System.out.println(jogador2.getnome());
		System.out.println(jogador2.idade());
		
		System.out.println(jogador3.getnome());
		System.out.println(jogador3.idade());
		
		
	}

}
