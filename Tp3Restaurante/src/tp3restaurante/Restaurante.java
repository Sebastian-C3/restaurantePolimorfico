/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3restaurante;

import tp3restaurante.cocineros.Cocinero;
import tp3restaurante.cocineros.Pizzero;

/**
 *
 * @author seba_
 */
class Restaurante {

    private Cocinero cocineroDelDia;

    /**
     * Define la inicializacion del objeto Restaurante con un Cocinero
     * @param cocineroDelDia es el cocinero a asignar en el restaurante
     */
    Restaurante(Cocinero cocineroDelDia) {
        this.cocineroDelDia = cocineroDelDia;
    }
    
    
    
    /**
     * El Restaurante ateinde al cliente recibido
     * @param cliente a ser atendido / que entro al restaurante
     */
    void atenderA(Cliente cliente) {
        mostrarMenu();
        if(cliente.confirmaOrden()){
            cocineroDelDia.cocinarPlatoPrincipal();
        }
    }

    private void mostrarMenu() {
        System.out.println("\t***Menu del día");
        System.out.println(cocineroDelDia.presentate() + cocineroDelDia.getPlatoPrincipal());
    }

    /**
     * cambia de cocinero del dia en el Restaurante
     * @param nuevoCocineroDelDia a ingresar en el Restaurante
     */
    void cambiaDeCocineroCon(Cocinero nuevoCocineroDelDia) {
        cocineroDelDia = nuevoCocineroDelDia;
    }
    
}
