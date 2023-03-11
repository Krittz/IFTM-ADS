package principal;

public class Jogador extends Pessoa{
        private int numeroCamisa;
        private String posicao;

        public Jogador(){

        }
        public Jogador(int numeroCamisa, String posicao){
            this.numeroCamisa = numeroCamisa;
            this.posicao = posicao;
        }

    public int getNumeroCamisa() {
        return this.numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

}
