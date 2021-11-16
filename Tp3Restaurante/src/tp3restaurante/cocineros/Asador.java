/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3restaurante.cocineros;

/**
 *
 * @author seba_
 */
public class Asador extends Cocinero{
    
    public Asador(String nombre, String platoPrincipal, String presentacion) {
        super(nombre, platoPrincipal, presentacion);
    }
    
    /**
     * muestra como prepara el platoPrincipal el Asador
     */
    @Override
    public void cocinarPlatoPrincipal() {
        System.out.println("Preparando brasa y condimentando carne para preparar " + platoPrincipal);
    }
}
