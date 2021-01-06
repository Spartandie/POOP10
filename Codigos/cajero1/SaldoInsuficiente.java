/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero1;

/**
 *
 * @author santi
 */
public class SaldoInsuficiente extends Exception {
    /**
     * Funcion de saldo insuf
     */
    SaldoInsuficiente(){
        super("Saldo insuficiente");
    }
}
