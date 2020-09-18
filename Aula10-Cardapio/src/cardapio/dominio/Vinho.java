package cardapio.dominio;


public class Vinho{
	
	public double getValorVinho() {
		return valorVinho;
	}
	public void setValorVinho(double valorVinho) {
		this.valorVinho = valorVinho;
	}
	public String getNomeVinho() {
		return nomeVinho;
	}
	public void setNomeVinho(String nomeVinho) {
		this.nomeVinho = nomeVinho;
	}
	public int getCodigoVinho() {
		return codigoVinho;
	}
	public void setCodigoVinho(int codigoVinho) {
		this.codigoVinho = codigoVinho;
	}


	private double valorVinho;
	private String nomeVinho;
	private int codigoVinho;
	
}