/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3restaurante.cocineros;

/**
 *
 * @author seba_
 */
public class Pizzero extends Cocinero {

    public Pizzero(String nombre, String platoPrincipal, String presentacion) {
        super(nombre, platoPrincipal, presentacion);
    }

    /**
     * muestra como prepara el platoPrincipal el Pizzero
     */
    @Override
    public void cocinarPlatoPrincipal() {
        System.out.println("Juntando ingredientes y prendiendo horno para preparar " + platoPrincipal);
    }
    
}
