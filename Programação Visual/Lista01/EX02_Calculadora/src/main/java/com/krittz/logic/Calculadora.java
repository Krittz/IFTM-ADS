/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krittz.logic;

/**
 *
 * @author crist
 */
public class Calculadora {
    private double valor1;
    private double valor2;
    private double resultado;
    private String op;
   
    public Calculadora(){
        
    }
    public Calculadora(double valor1, double valor2,double resultado, String op){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado= resultado;
        this.op = op;
    }
    
    
    // ========================= METODOS =======================================
    
    
    public double calculadoraSoma(){
        this.resultado = this.valor1 + this.valor2;
        return this.resultado;
    }
    public double calculadoraSub(){
        this.resultado = this.valor1 - this.valor2;
        return this.resultado;
    }
    
    public double calculadoraDiv(){
        this.resultado = this.valor1 / valor2;
        return this.resultado;
    }
    public double calculadoraMult(){
        this.resultado = this.valor1 * this.valor2;
        return this.resultado;
    }
    
    public void verificarOperacao(){
        switch(this.op){
            case "soma":
                   calculadoraSoma();
                   break;
            case "sub":
                calculadoraSub();
                    break;
            case "mult":
                calculadoraMult();
                    break;
            case "div":
                calculadoraDiv();
                    break;
            default:
                    break;
        }

    }
    
    // ========================== GETTERS AND SETTERS ===========================

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}
