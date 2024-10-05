
package main;

import objetos.Automovil;

public class Ejecutable {
    public static void main(String[] args) {
         Automovil carro1 = new Automovil("yamaha", 2004, 3,
                 Automovil.tipoCombustible.DIESEL,
                 Automovil.tipoAutomovil.EJECUTIVO ,4, 4, 250, 
                 Automovil.tipoColor.NEGRO, 100);
          carro1.imprimir();
          carro1.acelerar(20);
          carro1.desacelerar(50);
          carro1.frenar();
          
          System.out.println("");
          
         Automovil carro2 = new Automovil("Ford", 2018, 3, 
                 Automovil.tipoCombustible.DIESEL,
                 Automovil.tipoAutomovil.EJECUTIVO, 5, 6, 250, 
                 Automovil.tipoColor.NEGRO, 100);
            
          carro2.imprimir();
          carro2.acelerar(20);
          carro2.desacelerar(50);
          carro2.frenar();
        
         
          
    }
    
}
