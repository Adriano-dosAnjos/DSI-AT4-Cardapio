package cardapio.dominio;


public class Prato{
	
	public String getNomePrato() {
		return nomePrato;
	}
	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}
	public double getValorPrato() {
		return valorPrato;
	}
	public void setValorPrato(double valorPrato) {
		this.valorPrato = valorPrato;
	}
	public int getCodigoPrato() {
		return codigoPrato;
	}
	public void setCodigoPrato(int codigoPrato) {
		this.codigoPrato = codigoPrato;
	}


	private String nomePrato;
	private double valorPrato;
	private int codigoPrato;
	
}