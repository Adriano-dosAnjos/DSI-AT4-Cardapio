package cardapio.dominio;


public class Bebida{
	
	public double getValorBebida() {
		return valorBebida;
	}
	public void setValorBebida(double valorBebida) {
		this.valorBebida = valorBebida;
	}
	public String getNomeBebida() {
		return nomeBebida;
	}
	public void setNomeBebida(String nomeBebida) {
		this.nomeBebida = nomeBebida;
	}
	public int getCodigoBebida() {
		return codigoBebida;
	}
	public void setCodigoBebida(int codigoBebida) {
		this.codigoBebida = codigoBebida;
	}


	private double valorBebida;
	private String nomeBebida;
	private int codigoBebida;
	
	
	
}