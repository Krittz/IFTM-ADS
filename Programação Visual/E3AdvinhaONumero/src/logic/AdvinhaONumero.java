package logic;

public class AdvinhaONumero {

    private int numeroDeVidas;
    private int intervaloMinimo;
    private int intervaloMaximo;
    private int numero;

    public AdvinhaONumero() {
        this.numeroDeVidas = 5;
    }
    
    public void iniciarJogo(){
        double num = (Math.random() * intervaloMaximo) + intervaloMinimo;
        num = Math.ceil(num);
        this.numero =(int) num;
    }
    
    public int compararPalpite(int palpite){
        if(palpite > numero){
            return 1;
        }
        else if(palpite < numero){
            return -1;
        }
        else {
            return 0;
        }
    }
    
    public void setDificuldadeFacil(){
        this.intervaloMinimo = 0;
        this.intervaloMaximo = 10;
    }
    
    public void setDificuldadeMedio(){
        this.intervaloMinimo = 0;
        this.intervaloMaximo = 100;
    }
    
    public void setDificuldadeDificil(){
        this.intervaloMinimo = -100;
        this.intervaloMaximo = 100;
    }

    public void diminuirVida(){
        this.numeroDeVidas--;
    }
    
    public int getNumeroDeVidas() {
        return numeroDeVidas;
    }

    public void setIntervaloMinimo(int intervaloMinimo) {
        this.intervaloMinimo = intervaloMinimo;
    }

    public void setIntervaloMaximo(int intervaloMaximo) {
        this.intervaloMaximo = intervaloMaximo;
    }
}
