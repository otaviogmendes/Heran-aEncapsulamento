package main;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class main {

	public static void main(String[] args) {
		
		
		Carro car = new Carro ();
		Moto moto = new Moto ();
		
		// carro
		
	 car.setTipo("Carro");
	 car.setCor("Azul");
	 car.setAro("15");
     car.setVoa(false);
     car.setParabrisas(false);
     car.setPorta(true);
     car.setConversivel(false);
     car.setMarca("Celta");    
    
   
     car.descricaoCarro(); 
  
     
     System.out.println("=========================");
     
     //Moto
     
     moto.setTipo(" Moto");
     moto.setCor(" Preta");
	 moto.setAro(" 18");
	 moto.setVoa(false);       
     moto.setCapacete(true);
     moto.setMarca(" Honda");
     moto.setRetrovisor( true);     
  
   moto.descricaoMoto();
   
	}

}
