/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3restaurante.cocineros;

/**
 *
 * @author seba_
 */
public class Cocinero {
    private String nombre = "nombre def";//podria ser una imagen o un pdf con algo para reconocer al cocinero
    protected String platoPrincipal = "def plato principal";//podria ser un catalogo de platos diponibles del cocinero
    private String presentacion = "def Presentacion y mi nombre es: " + nombre;//podria ser un vide presentaciond del cocinero 
    
    public Cocinero(String nombre, String platoPrincipal, String presentacion){
        System.out.println("Creando cocinero");// no deberia estar
        this.nombre = nombre;
        this.platoPrincipal = platoPrincipal;
        this.presentacion = presentacion;
    }
    
    
    /**
     * Presenta el plato principal
     */
    public void presentarPlatoPrincipal(){
        System.out.println(presentacion + " " + platoPrincipal);
    }

    /**
     * El cocinero se presenta
     * @return la presentacion
     */
    public String presentate() {
        return presentacion;
    }
    
    /**
     * devuelve el atributo "platoPrincipal"
     * @return el valor de "platoPrincipal"
     */
   public String getPlatoPrincipal() {
        return platoPrincipal;
    }

    /**
     * Muestra como deberia cocinarse el plpatoPrincipal del Cocinero
     */
    public void cocinarPlatoPrincipal() {
        System.out.println("Cocinando " + platoPrincipal + " por defecto");
    }
    
    
}
