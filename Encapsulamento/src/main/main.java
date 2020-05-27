package main;

import model.Eletrodomestico;
import model.aeronave;

public class main {

	public static void main(String[] args) {
	
		aeronave aviao = new aeronave();
		Eletrodomestico eletro = new Eletrodomestico();
				
	  aviao.setNome("Airbus");
	  aviao.setCor("Branco");
	  aviao.setPorte("Grande");
	  aviao.setTipo("Viagem");
	 
	
	  // chamando metodos
	  
	  aviao.decolar();
	  aviao.voar();
	  aviao.pousar();
	  
	  System.out.println("<================================================>");
	  
	  //Ficha do Eletro
	  eletro.setTipo("Liquidificador");
	  eletro.setNome("Tritura - 2000");
	  eletro.setModelo("Philco Tri2");
	  eletro.setCor("Preto");
	  eletro.setBivolt(true);
	  
     // chamando do metodo do eletro
	  eletro.descricao();
	}

}
