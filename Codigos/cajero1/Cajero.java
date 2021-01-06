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
public class Cajero {
    public static void main(String[] args) { //psvm
        Cuenta cuenta = new Cuenta();
        /*cuenta.depositar(500);
        try {
            cuenta.retirar(300);
            cuenta.retirar(200);
            cuenta.retirar(100);
        } catch (SaldoInsuficiente ex) {
            System.out.println("Saldo insuficiente");
        } 
        utilizar el codigo atraves del teclado tanto para poop10 y aqui */
        System.out.println("Act tarea---------------");
        
        KeyboardInput in = new KeyboardInput();
        int cont = 1;
        while(cont != 0){
            System.out.println("Seleccione la opcion que desee");
            System.out.println("1.-Depositar efectivo.\n2.-Retirar efectivo.\n3.-Salir");
            int op = in.readInteger();
            switch(op){
                case 1:
                    System.out.println("Ingrese el monto que desee agregar");
                    int n = in.readInteger();
                    cuenta.depositar(n);
                    break;
                case 2:
                    try{
                        System.out.println("Ingrese el monto que desee retirar");
                        int m = in.readInteger();
                        cuenta.retirar(m);
                    }catch(SaldoInsuficiente ex){
                        System.out.println("Saldo insuficiente");
                       
                    }
                    break;
                case 3:
                    System.out.println("Salir");
                    cont = 0;
                    break;
                default:
                    cont = 0;
                    
            }
        }
        
    } 
    
}
