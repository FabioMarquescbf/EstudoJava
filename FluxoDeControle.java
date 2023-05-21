/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apache;

/**
 *
 * @author fabio
 */
public class FluxoDeControle {
    double velocidadeAtual = 2;
    
        public double bikeFreios() {
            boolean taAndando = true;
            if(taAndando){
                this.velocidadeAtual--;
            } else{
                System.out.println("A Bike já está parada!");
            }
        }
        
        void seNao() {
            int pontuacao = 30;
            char vogal;
            
            if(pontuacao >= 90){
                vogal = 'A';
            } else if (pontuacao >= 70){
                vogal = 'B';
            } else if(pontuacao >= 60){
                vogal = 'D';
            } else {
                vogal = 'F';
            }
            System.out.println("vogal: = " + vogal);
        }
        
}

    
    
    
    
    
    
    
    
    
    
    
    

