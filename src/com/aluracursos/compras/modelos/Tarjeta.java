package com.aluracursos.compras.modelos;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
    private String titular;
    private double saldo;
    private double limite;
    private List<Productos> listaDeCompras;

    public boolean lanzarCompra(Productos productos) {
        if (this.saldo < productos.getValor()) {
            this.saldo -= productos.getValor();
            this.listaDeCompras.add(productos);
            return true;
        }
        return false;
    }

    public Tarjeta(double limite) {
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Productos> getListaDeCompras() {
        return listaDeCompras;
    }
}
