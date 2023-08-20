package model;

import java.time.LocalDate;

/**
 *
 * @author crist
 */
public class Parcela {

    private int codigo;
    private double valor;
    private LocalDate dataVencimento;
    private boolean finalizada;
    private LocalDate dataPagamento;
    private int fk_pagamento;

    public Parcela() {
    }

    public Parcela(int codigo, double valor, LocalDate dataVencimento, boolean finalizada, LocalDate dataPagamento, int fk_pagamento) {
        this.codigo = codigo;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.finalizada = finalizada;
        this.dataPagamento = dataPagamento;
        this.fk_pagamento = fk_pagamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public int getFk_pagamento() {
        return fk_pagamento;
    }

    public void setFk_pagamento(int fk_pagamento) {
        this.fk_pagamento = fk_pagamento;
    }

}
