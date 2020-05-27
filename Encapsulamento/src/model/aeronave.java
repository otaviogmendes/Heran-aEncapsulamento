package model;

public class aeronave {
private String nome;
private String cor;
private String porte;
private String tipo;

// getters e setters

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getPorte() {
	return porte;
}
public void setPorte(String porte) {
	this.porte = porte;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}

// Metodos
public void decolar()
{
	System.out.println("A aeronave: " + this.nome +
			", do Tipo: "+this.tipo+", da Cor :  "+this.cor+ " e com o Porte: "+this.porte+", está decolando. Aperte os cintos!. ");
}



public void voar()
{
	System.out.println("A aeronave: " + this.nome + " está em pleno voo. ");
}

public void pousar()
{
	System.out.println("A aeronave: " + this.nome + " está pousando, permaneça em seus lugares. ");
}




}
