package com.krittz.trabalhofinal.model;

import android.content.ContentValues;

public class Media {
    private int id;
    private int idUser;
    private Double quilometros;
    private Double preco;
    private Double litros;
    private Double total;

    public Media() {

    }

    public Media(int id, int idUser, Double quilometros, Double preco, Double litros, Double total) {
        this.id = id;
        this.idUser = idUser;
        this.quilometros = quilometros;
        this.preco = preco;
        this.litros = litros;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Double getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(Double quilometros) {
        this.quilometros = quilometros;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public ContentValues getValues() {
        ContentValues values = new ContentValues();
        if (this.id > 0) values.put("id", this.id);
        values.put("quilometros", this.quilometros);
        values.put("preco", this.preco);
        values.put("litros", this.litros);
        values.put("idUser", this.idUser);
        values.put("total", this.total);
        return values;

    }
}
