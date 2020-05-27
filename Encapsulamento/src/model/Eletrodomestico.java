package model;

public class Eletrodomestico {
	
public String tipo;
public String nome;
public String cor;
public String  modelo;
public boolean bivolt;



public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
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
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public boolean isBivolt() {
	return bivolt;
}
public void setBivolt(boolean bivolt) {
	this.bivolt = bivolt;
}

// metodos

public void descricao ()
{
	System.out.println("Tipo de produto: " + this.tipo);
	System.out.println("Nome do produto: "+ this.nome);
	System.out.println("Cor do produto: "+ this.cor);
	System.out.println("Modelo do produto: "+ this.modelo);
	System.out.println("Voltagem do produto (é bivolt?): "+ this.bivolt);
}

}
