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
    
    
    public static void convertir(int n){//Metodo para reducir imprimir el numero de escalones que se van bajando.
         if (n<2) {//Caso base
             System.out.print(n);
             
        } else {
             convertir(n/2);
            System.out.print(n%2);//Dominio, mientras el caso base no se cumpla vamos a imprimir n.
          
        }
     
         
    }
}
