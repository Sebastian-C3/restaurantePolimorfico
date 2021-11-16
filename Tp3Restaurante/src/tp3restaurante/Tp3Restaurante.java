/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3restaurante;

import tp3restaurante.cocineros.Sushero;
import tp3restaurante.cocineros.Asador;
import tp3restaurante.cocineros.Pizzero;

/**
 *
 * @author seba_
 */
public class Tp3Restaurante {

    /*
        TP 3 - Restaurante Polimorfico
    
            - crear un programa que permita:
                + Tener varios cocineros para el restaurante
                    + Asador
                    + Pizzero
                    + Sushero
                    + cada cocinero tiene
                        + nombre
                        + plato principal
                        + presentacion
                        puede:
                            - presentarse mencionand su plato principal
    
                - que el restaurante 
                    - solo puede tener un cocinero(cocinero del dia)
                    - atienda a un cliente
                        - pueda optar si ORDENAR o NO ORDENAR
                - pueda cambiar de cocinero(usando polimorfismo)
                
    
    */
   
    public static void main(String[] args) {
        Asador roberto = new Asador(
                "Roberto", 
                "tira de asado", 
                "Hola mi nombre es Roberto, mi plato pricipal es: ");
        Pizzero samanta = new Pizzero(
                "Samanta", 
                "Grande de muzzarella", 
                "hello my name is Samanta, this is my main dish: ");
        Sushero tsukamoto = new Sushero(
                "Tsukamoto", 
                "Sushi uramaki", 
                "Kon'nichiwa watashinonamaeha sukamotodesu, kore ga watashi no meindisshudesu: ");
        
        Restaurante restaurantePolimorfico = new Restaurante(tsukamoto);
        
        Cliente erick = new Cliente();
                
        restaurantePolimorfico.atenderA(erick);
        restaurantePolimorfico.cambiaDeCocineroCon(samanta);
        restaurantePolimorfico.atenderA(erick);
        restaurantePolimorfico.cambiaDeCocineroCon(roberto);
        restaurantePolimorfico.atenderA(erick);
        
        
    }
    
}
