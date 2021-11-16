/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3restaurante;

import java.util.Scanner;

/**
 *
 * @author seba_
 */
class Cliente {
    private static final boolean NO_CONFIRMADO = false;
    
    private boolean ordenEsConfirmada = NO_CONFIRMADO;
    
    /**
     * Consultar si el clinte cofirma o no la oreden
     * @return la respuesta del cleinte
     */
    boolean confirmaOrden() {
        System.out.println("Confirma el pedido? true o false");
        Scanner opcionEscaner = new Scanner(System.in);
        ordenEsConfirmada = opcionEscaner.nextBoolean();
        return ordenEsConfirmada;
    }
    
}
