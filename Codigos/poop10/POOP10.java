/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop10;

/**
 *
 * @author santi
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyboardInput in = new KeyboardInput();
        System.out.println("Act 1 ---------------------------");
        System.out.println("Ingrese la cantidad de nombres que desee agregar");
        int n = in.readInteger();
        String [] mensajes = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese su nombre "+(i+1));
            String l = in.readString();
            mensajes[i] = l;
        }
        try{
            //String mensajes [] = {"Antonio","javier", "Gabriela"};
        for (int i = 0; i <= mensajes.length ; i++) {
            System.out.println(mensajes[i]);
        }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: apuntador fuera de rango");
        }
        
        
        
        System.out.println("Act 2----------------------------");
        try{
            //float equis = 5/0;
            System.out.println("Ingresa un numero");
            int x = in.readInteger();
            System.out.println("Ingresa otro numero");
            int y = in.readInteger();
            if (x == 0){
                System.out.println("equis= "+x);
            }
            int division = y/x;
        }catch(ArithmeticException as){
            System.out.println("Error: error aritmetico");
        }finally{
                System.out.println("A pesar de todo se ejecuta el bloque finally");
         }
        System.out.println("Fuera del try-catch"); 
        //ArithmeticException = as lo que lanza la excepcion
        
        
        System.out.println("Act 3--------------------");
        try{
            //float equis = 5/0;
            System.out.println("Ingresa un numero");
            int x = in.readInteger();
            System.out.println("Ingresa otro numero");
            int y = in.readInteger();
            System.out.println("equis= "+x);
            int division = y/x;
        }catch(ArrayIndexOutOfBoundsException aie){
        System.out.println("Error: apuntador fuera de rango");        
        }catch(ArithmeticException as){
            System.out.println("Error: error aritmetico. Division entre 0");
        }catch (Exception e){
            System.out.println("Excepcion general");
        }
        finally{
                System.out.println("A pesar de todo se ejecuta el bloque finally");
         }
        System.out.println("Fuera del try-catch");
        
        
        System.out.println("Act 4--------------------");   
        //propagacion de excepciones
        try{
            System.out.println("Ingresa un numero");
            int x = in.readInteger();
            System.out.println("Ingresa otro numero");
            int y = in.readInteger();
            int division = division (y,x);
            System.out.println("Division: "+division);
        }catch(ArithmeticException ds){
            System.out.println("Excepcion aritmetica");
            //ds.printStackTrace();
        } 
        /*int division = division (8,0);
        System.out.println("Division: "+division); */
        System.out.println("Act 5--------------------");
        try{
            System.out.println("Ingresa un numero");
            int x = in.readInteger();
            System.out.println("Ingresa otro numero");
            int y = in.readInteger();
            int division = division2 (y,x);
            System.out.println("Division: "+division);
        }catch(ArithmeticException ds){
            System.out.println("Excepcion aritmetica");
            //e.printStackTrace();
        } 
    }
    public static int division(int a, int b) throws ArithmeticException{ // con throws se le dice al programador que puede lanzar un error aritmetico
        /*int c;
        try{
            c = a/b;
        }catch(ArithmeticException ds){
            System.out.println("Excepcion aritmetica");
            c = 0;
        }
        return c; */
        return a/b;
    }
     public static int division2(int a, int b) throws ArithmeticException{
         if (b == 0 ){
             throw new ArithmeticException(); //constructor
         }
         int c=a/b;
         return c;
     }
}
    

