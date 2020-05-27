
package model;

public class Carro extends Veiculo {

	private boolean parabrisas;
	private boolean porta;
	private boolean conversivel;
	private String marca;
	
	public boolean isParabrisas() {
		return parabrisas;
	}
	public void setParabrisas(boolean parabrisas) {
		this.parabrisas = parabrisas;
	}
	public boolean isPorta() {
		return porta;
	}
	public void setPorta(boolean porta) {
		this.porta = porta;
	}
	public boolean isConversivel() {
		return conversivel;
	}
	public void setConversivel(boolean conversivel) {
		this.conversivel = conversivel;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//metodos
	
	public void descricaoCarro()
	{
		System.out.println("Este(a) "+ getTipo() + ", da cor: " +getCor()+" possui o tamanho do aro: " + getAro() );
		System.out.println("Este(a) " +getTipo()+ " voa? " + getVoa());
		System.out.println("Possui parabrisas?" + this.parabrisas);
		System.out.println("Tem portas?" + this.porta);
		System.out.println("É conversivel?" + this.conversivel);
		System.out.println("Marca: " + this.marca);
	
	}
	
}
