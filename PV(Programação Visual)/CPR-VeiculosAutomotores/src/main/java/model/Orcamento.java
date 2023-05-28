package model;

import java.time.LocalDate;

/**
 *
 * @author crist
 */
public class Orcamento {

    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    private Cliente cliente;
    private Veiculo veiculo;
    private double valorTotal;

    public Orcamento() {
    }

    public Orcamento(LocalDate dataRetirada, LocalDate dataDevolucao, Cliente cliente, Veiculo veiculo,
            double valorTotal) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorTotal = valorTotal;
    }

    public LocalDate getDataRetirada() {
        return this.dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
