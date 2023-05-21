/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apache;

/**
 *
 * @author fabio
 */



public class Matrizes {
    
    // Uma matriz é um objeto de contêiner que contém um número fixo de valores de um único tipo.
    // O comprimento de uma matriz é estabelecido quando a matriz é criada. Após a criação, seu comprimento é fixo.
    
    public static void main(String[] args){
     int[] anArray; //Declara uma variável como matriz (Lista).
     anArray = new int[6]; //Cria a Matriz.
     
     //Error: ArrayDemo.java:4: Variable anArray may not have been initialized.
     // Se a instrução(campo = new tipo[]) A variável pode não ter sido inicializada.


    //atribuem valores a cada elemento da matriz.
     anArray[0] = 100;
     anArray[2] = 200;
     anArray[3] = 300;
     anArray[4] = 400;
     anArray[5] = 500;

     //Cada elemento da matriz é acessado por seu índice numérico.
     System.out.println("Elemento do índice 0" + anArray[0]);
     System.out.println("Elemento do índice 1" + anArray[1]);
     System.out.println("Elemento do índice 2" + anArray[2]);
     System.out.println("Elemento do índice 3" + anArray[3]);
     System.out.println("Elemento do índice 4" + anArray[4]);
     System.out.println("Elemento do índice 5" + anArray[5]);
     
     
    /**alternativa: pode-se usar a sintaxe de atalho para criar e inicializar uma matriz:
        int[] anArray = { 
        100, 200, 300, 
        400, 500, 600, 
        700, 800, 900, 1000
    };
    */
    }
  
//Matriz Multidimensional.
 class MultiDimArrayDemo {
     public static void main(String[] args) {
         String[][] names = {
             {"Mr. ", "Mrs. ", "Ms. "},
             {"Smith", "Jones"}
         };
         // Mr. Smith
         System.out.println(names[0][0] + names[1][0]);
         // Ms. Jones
         System.out.println(names[0][2] + names[1][1]);
     }
 }

 class ArrayCopyDemo { 
     /*
     * System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
     Os dois argumentos especificam a matriz da qual copiar e a matriz para a qual copiar.
     Os três argumentos especificam a posição inicial na matriz de origem,
     a posição inicial na matriz de destino e o número de elementos de matriz a serem copiados.
     */
     public static void main(String[] args) {
         String[] copyFrom = {
             "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
             "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
             "Marocchino", "Ristretto" };

         String[] copyTo = new String[7];
         System.arraycopy(copyFrom, 2, copyTo, 0, 7);
         for (String coffee : copyTo) {
             System.out.print(coffee + " ");           
         }
     }
 }
 
 //Manipulão de Array (java.util.Arrays)
 class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);        
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        }            
    }
 }

}
