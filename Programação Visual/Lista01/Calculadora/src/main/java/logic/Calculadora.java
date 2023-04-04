/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author crist
 */
public class Calculadora {
    private double resultado = 0;
    
    public Calculadora(){
        
    }
    public Calculadora(double resultado){
        this.resultado = resultado;
    }
    public double somar(double x, double y){
        return resultado = x + y;
    }
    public double subtrair(double x, double y){
        return resultado = x - y;
    }
    public double multiplicar(double x, double y){
        return resultado = x * y;
    }
    public double dividir(double x, double y){
        return resultado= x/y;
    }
    public double elevar(double x, double y){
        return resultado = Math.pow(x, y);
    }
    public double raiz(double x){
        return resultado = Math.sqrt(x);
    }
}
