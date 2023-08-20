package model;

import java.util.List;

/**
 *
 * @author crist
 */
public class Pagamento {

    private int codigo;
    private Aluguel aluguel;
    private double valorTotal;
    private List<Parcela> parcelas;
    private boolean finalizado;

    public Pagamento() {

    }

    public Pagamento(int codigo, Aluguel aluguel, double valorTotal, List<Parcela> parcelas, boolean finalizado) {
        this.codigo = codigo;
        this.aluguel = aluguel;
        this.valorTotal = valorTotal;
        this.parcelas = parcelas;
        this.finalizado = finalizado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

}
