package atvdd03OBJETOS;

public class objRequest {

	public String nomePa;
	public String nomeDent;
	public String data;
	
	public objRequest(String nomePa) {
		this.nomePa = nomePa;
	}
	
	public objRequest(String nomePa, String data) {
		this.nomePa = nomePa;
		this.data = data;
	}
	
	public objRequest(String nomePa, String data, String nomeDent) {
		this.nomePa = nomePa;
		this.data = data;
		this.nomeDent = nomeDent;
	}
	
	
	public String getnomePa() {
		return nomePa;
	}
	public void setnomePa(String nomePa) {
		this.nomePa = nomePa;
	}
	
	public String getnomeDent() {
		return nomeDent;
	}
	public void setnomeDent(String nomeDent) {
		this.nomeDent = nomeDent;
	}
	
	public String getdata() {
		return data;
	}
	public void setdata(String data) {
		this.data = data;
	}
	

	
}
