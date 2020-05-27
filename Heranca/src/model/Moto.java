package model;

public class Moto extends Veiculo {
public boolean capacete;
public String marca;
public boolean retrovisor;

public boolean isCapacete() {
	return capacete;
}
public void setCapacete(boolean capacete) {
	this.capacete = capacete;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public boolean isRetrovisor() {
	return retrovisor;
}
public void setRetrovisor(boolean retrovisor) {
	this.retrovisor = retrovisor;
}

// metodo
public void descricaoMoto()
{
	System.out.println("Este(a) "+ getTipo() + ", da cor: " +getCor()+" possui o tamanho do aro: " + getAro() );
	System.out.println("Este(a) " +getTipo()+ " voa? " + getVoa());
	System.out.println("Possui capacete?"+ this.capacete);
	System.out.println("Possui retrovisor?"+ this.retrovisor);
	System.out.println("Marca: "+ this.marca);
	
}
}
