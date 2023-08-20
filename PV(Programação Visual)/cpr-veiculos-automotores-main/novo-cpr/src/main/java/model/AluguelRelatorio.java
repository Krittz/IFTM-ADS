package model;

import java.sql.Date;

/**
 *
 * @author crist
 */
public class AluguelRelatorio {

    private int codigo;
    private Date retirada;
    private Date devolucao;
    private Veiculo veiculo;
    private Agencia agencia;
    private Cliente cliente;
    private double valor;

    public AluguelRelatorio() {
    }

    public AluguelRelatorio(int codigo, Date retirada, Date devolucao, Veiculo veiculo, Agencia agencia, Cliente cliente, double valor) {
        this.codigo = codigo;
        this.retirada = retirada;
        this.devolucao = devolucao;
        this.veiculo = veiculo;
        this.agencia = agencia;
        this.cliente = cliente;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getRetirada() {
        return retirada;
    }

    public void setRetirada(Date retirada) {
        this.retirada = retirada;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
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

    public void setValor(double valor) {
        this.valor = valor;
    }

}
