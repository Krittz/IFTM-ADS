/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author crist
 */
public class ManipuladorStrings {

    private String entradaOriginal;
    private String saidaInverter;
    private boolean saidaPalindromo;
    private int saidaTamanho;
    private int saidaVogais;
    private int saidaConsoantes;
    private String saidaCriptografada;
    private String saidaDescriptografada;

    public ManipuladorStrings() {

    }

    public ManipuladorStrings(String entradaOriginal, String saidaInverter, boolean saidaPalindromo, int saidaTamanho, int saidaVogais, int saidaConsoantes, String saidaCriptografada, String saidaDescriptografada) {
        this.entradaOriginal = entradaOriginal;
        this.saidaInverter = saidaInverter;
        this.saidaPalindromo = saidaPalindromo;
        this.saidaTamanho = saidaTamanho;
        this.saidaVogais = saidaVogais;
        this.saidaConsoantes = saidaConsoantes;
        this.saidaCriptografada = saidaCriptografada;
        this.saidaDescriptografada = saidaDescriptografada;
    }

    public void inverter() {
        StringBuilder inverte = new StringBuilder(entradaOriginal).reverse();
        saidaInverter = String.valueOf(inverte);
    }

    public void tamanho() {
        saidaTamanho = entradaOriginal.length();
    }

    public void palindromo() {
        if (entradaOriginal.equals(saidaInverter)) {
            saidaPalindromo = true;
        } else {
            saidaPalindromo = false;
        }
    }

    public void vogais() {
        saidaVogais = 0;
        String regex = "[aeiouAEIOU]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(entradaOriginal);
        while(m.find()){
           saidaVogais++; 
        }
    }
    
    public void consoantes(){
        saidaConsoantes = 0;
        String regex="[^aeiouAEIOU]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(entradaOriginal);
        while(m.find()){
            saidaConsoantes++;
        }
    }

    public String getEntradaOriginal() {
        return entradaOriginal;
    }

    public void setEntradaOriginal(String entradaOriginal) {
        this.entradaOriginal = entradaOriginal;
    }

    public String getSaidaInverter() {
        return saidaInverter;
    }

    public void setSaidaInverter(String saidaInverter) {
        this.saidaInverter = saidaInverter;
    }

    public int getSaidaTamanho() {
        return saidaTamanho;
    }

    public void setSaidaTamanho(int saidaTamanho) {
        this.saidaTamanho = saidaTamanho;
    }

    public int getSaidaVogais() {
        return saidaVogais;
    }

    public void setSaidaVogais(int saidaVogais) {
        this.saidaVogais = saidaVogais;
    }

    public int getSaidaConsoantes() {
        return saidaConsoantes;
    }

    public void setSaidaConsoantes(int saidaConsoantes) {
        this.saidaConsoantes = saidaConsoantes;
    }

    public String getSaidaCriptografada() {
        return saidaCriptografada;
    }

    public void setSaidaCriptografada(String saidaCriptografada) {
        this.saidaCriptografada = saidaCriptografada;
    }

    public String getSaidaDescriptografada() {
        return saidaDescriptografada;
    }

    public void setSaidaDescriptografada(String saidaDescriptografada) {
        this.saidaDescriptografada = saidaDescriptografada;
    }

    public boolean isSaidaPalindromo() {
        return saidaPalindromo;
    }

    public void setSaidaPalindromo(boolean saidaPalindromo) {
        this.saidaPalindromo = saidaPalindromo;
    }

}
