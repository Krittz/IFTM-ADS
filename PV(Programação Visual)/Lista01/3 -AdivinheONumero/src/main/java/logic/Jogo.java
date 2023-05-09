/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Random;

/**
 *
 * @author crist
 */
public class Jogo {

    private int chances = 5;
    

    public Jogo() {

    }

    public Jogo(int chances) {
        this.chances = chances;

    }

    public int valorFacil() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(5) + 1;
        return valor;
    }

    public int valorMedio() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(10) + 1;
        return valor;
    }

    public int valorDificil() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(20) + 1;
        return valor;
    }

   public void diminuirChances(){
       chances--;
   }

    public int getChances() {
        return chances;
    }

    public void setChances(int chances) {
        this.chances = chances;
    }
    
   
   
}
