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


public class Cuenta {
    private double saldo;
    
    /**
     * Funcion cuenta
     */
    public Cuenta() {
        this.saldo = 0;
    }
    /**
     * 
     * @return saldo es el saldo actualizado
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * 
     * @param monto es el monto a depositar
     */
    public void depositar(double monto){
        System.out.println("\t\t\tDepositando "+monto+" pesos");
        saldo+=monto;
    }
    /**
     * 
     * @param monto es el monto a depositar
     * @throws SaldoInsuficiente indica saldo insuficiente
     */
    public void retirar(double monto) throws SaldoInsuficiente {
        System.out.println("Retirando Monto");
        if (saldo < monto){
            throw new SaldoInsuficiente();
        }else{
            saldo -=monto;
        }
        System.out.println("\t\t\tNuevo saldo "+saldo);
    }
}
