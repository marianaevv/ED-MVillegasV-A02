package ed.mvillegasv.a02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mariana Villegas
 */
public class NotacionBinaria {
    
    
    public static void convertir(int n){//Metodo para ir convirtiendo un numero decimal a un binario.
         if (n<2) {//Caso base, nuestra condicion dice que ya sea que el numero que le demos sea 1 o 0, o si n llega a ser uno de estos, automticamente los imprimiremos.
             System.out.print(n);//Imprimimos el 1 o 0 que se dió o al que el metodo llegó.
             
        } else {
             convertir(n/2); //si se le dio un numero mayor a 1 lo que haremos sera dividirlo entre dos y volver a realizar el metodo preguntando si el numero dado entre 2 ahora es menor a 2,
             //si no, el programa almacenara el numero dado y lo volvera a dividir hasta ser 1
            System.out.print(n%2);//en el paso anterior se van almacenando los resultados de la division entre 2, al haber llegado a 1,
            //el programa imprimira ese numero y empezara a imprimir el residuo de las divisiones almacenadas.
          
        }
     
         
    }
}
