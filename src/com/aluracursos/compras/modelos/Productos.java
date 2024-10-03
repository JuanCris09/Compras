package com.aluracursos.compras.modelos;

public class Productos implements Comparable<Productos> {
    private String nombre;
    private double valor;

    public Productos(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Productos: " +
                "nombre: " + nombre +
                ", valor: " + valor;
    }

    @Override
    public int compareTo(Productos otroProducto) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otroProducto.getValor()));
    }
}
