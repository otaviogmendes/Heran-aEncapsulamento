package model;

public class Veiculo {
public String tipo;
public String cor ;
public String aro;
public boolean voa;


public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getAro() {
	return aro;
}
public void setAro(String aro) {
	this.aro = aro;
}
public boolean getVoa() {
	return voa;
}
public void setVoa(boolean voa) {
	this.voa = voa;
}

//metodos

public void descricao()
{
System.out.println("Tipo de Vaiculo: "+this.tipo);	
System.out.println("Cor: "+this.cor);	
System.out.println("Tamanho do ara: "+this.aro);	
System.out.println("Este veiculo voa?"+this.voa);	
}
}
