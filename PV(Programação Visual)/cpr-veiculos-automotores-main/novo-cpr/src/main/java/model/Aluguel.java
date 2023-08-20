package model;

import java.sql.Date;
import java.time.LocalDate;
import model.Cliente;
import model.Agencia;
import model.Veiculo;

/**
 *
 * @author crist
 */
public class Aluguel {

    private int codigo;
    private LocalDate retirada;
    private LocalDate devolucao;
    private Veiculo veiculo;
    private Agencia agencia;
    private Cliente cliente;
    private double valor;

    public Aluguel() {

    }

    public Aluguel(int codigo, LocalDate retirada, LocalDate devolucao, Veiculo veiculo, Agencia agencia, Cliente cliente, double preco) {
        this.codigo = codigo;
        this.retirada = retirada;
        this.devolucao = devolucao;
        this.veiculo = veiculo;
        this.agencia = agencia;
        this.cliente = cliente;
        this.valor = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getRetirada() {
        return retirada;
    }

    public void setRetirada(LocalDate retirada) {
        this.retirada = retirada;
    }

    public LocalDate getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(LocalDate devolucao) {
        this.devolucao = devolucao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double preco) {
        this.valor = preco;
    }

    public Date convertToLocalDate(LocalDate localDate) {
        return Date.valueOf(localDate);
    }

    public LocalDate convertToLocalDate(Date date) {
        return date.toLocalDate();
    }
}
