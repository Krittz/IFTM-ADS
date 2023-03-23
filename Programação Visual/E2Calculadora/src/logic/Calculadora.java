/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author IFTM
 */
public class Calculadora {

    private double n1;
    private double n2;
    private double resultado;

    public Calculadora() {
    }

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public void adicao(){
        this.resultado = n1 + n2;
    }
    
    public void subtracao(){
        this.resultado = n1 - n2;
    }
    
    public void multiplicacao(){
        this.resultado = n1 * n2;
    }
    
    public void divisao(){
        if(n2 != 0){
            this.resultado = n1/n2;
        }
    }
    
    public void potenciacao(){
        this.resultado = Math.pow(n1, n2);
    }
    
    public void radiciacao(){
        this.resultado = Math.pow(n1, (1.0/n2));
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getResultado() {
        return resultado;
    }
}
