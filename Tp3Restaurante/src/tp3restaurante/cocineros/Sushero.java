/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3restaurante.cocineros;

/**
 *
 * @author seba_
 */
public class Sushero extends Cocinero {

    public Sushero(String nombre, String platoPrincipal, String presentacion){//constructor de Sushero(SubClase)
        super(nombre, platoPrincipal, presentacion);//constructor de Cocinero (SuperClase)
    }
    
    /**
     * muestra como prepara el platoPrincipal el Sushero
     */
    @Override
    public void cocinarPlatoPrincipal() {
        System.out.println("Lavando las manos, cortando ingredientes y preparando el pescado para " + platoPrincipal);
    }
}
