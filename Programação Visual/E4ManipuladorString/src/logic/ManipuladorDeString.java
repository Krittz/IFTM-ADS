package logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManipuladorDeString {
    
    private String texto;

    public ManipuladorDeString() {
    }

    public String inverterTexto(){
        int size = texto.length() - 1;
        StringBuilder strb = new StringBuilder(); 
        
        for(int i = size; i >= 0; i--){
            int ch = texto.charAt(i);
            strb.append((char) ch);
        }
        return strb.toString();
    }

    public int tamanhoDoTexto(){
        int tamanho = texto.length();
        return tamanho;
    }
    
    public boolean ehPalindromo(){
        String textoInverso = inverterTexto();
        
        String textoSemEspacos = texto.replaceAll(" ", "").toLowerCase();
        String textoInversoSemEspacos = textoInverso.replaceAll(" ", "").toLowerCase();
        
        boolean resultado = textoSemEspacos.equals(textoInversoSemEspacos);
        return resultado;
    }
    
    public int numeroDeVogais(){
        int qtdeVogais = 0;
        
        String regex = "[aeiouAEIOU]";
        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(texto);
        
        while(matcher.find()){
            qtdeVogais++;
        }
        
        return qtdeVogais;
    }
    
    public int numeroDeConsoantes(){
        int qtdeConsoantes = 0;
        
        String regex = "[^aeiouAEIOU]";
        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(texto);
        
        while(matcher.find()){
            qtdeConsoantes++;
        }
        
        return qtdeConsoantes;
    }
    
    public String criptografar(int chave){
        StringBuilder strb = new StringBuilder(); 
        int charCriptografado;
        
        String textoFiltrado = texto.replaceAll("[^a-zA-Z]", "");
        System.out.println("-> " + textoFiltrado);
        
        for(int i = 0; i < textoFiltrado.length(); i++){
            int ch = textoFiltrado.charAt(i);
            
            if( (ch >= 65 && ch <= 90 && (ch + chave) > 90) 
                    || (ch >= 97 && (ch + chave) > 122)){
                charCriptografado = ch + chave - 26;
            }
            else {
                charCriptografado = ch + chave;
            }
            strb.append((char) charCriptografado);
        }
        
        return strb.toString();
    }
    
    public String descriptografar(int chave){
        StringBuilder strb = new StringBuilder(); 
        int charCriptografado;
        
        String textoFiltrado = texto.replaceAll("[^a-zA-Z]", "");
        
        for(int i = 0; i < textoFiltrado.length(); i++){
            int ch = textoFiltrado.charAt(i);
            
            if( (ch >= 65 && ch <= 90 && (ch - chave) < 65) 
                    || (ch >= 97 && ch <= 122 && (ch - chave) < 97)){
                charCriptografado = ch - chave + 26;
            }
            else {
                charCriptografado = ch - chave;
            }
            strb.append((char) charCriptografado);
        }
        
        return strb.toString();
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
