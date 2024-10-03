package com.aluracursos.compras.principal;

import com.aluracursos.compras.modelos.Productos;
import com.aluracursos.compras.modelos.Tarjeta;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe el limite de la tarjeta");
        double limite = lectura.nextDouble();
        Tarjeta tarjeta = new Tarjeta(limite);

        int salir = 1;
        while (salir != 0) {
            System.out.println("Escriba el producto de la compra");
            String nombre = lectura.next();

            System.out.println("Escriba el valor de la compra:");
            double valor = Double.valueOf(lectura.next());

            Productos productos = new Productos(nombre, valor);
            boolean compraRealizada = tarjeta.lanzarCompra(productos);

            if (compraRealizada) {
                System.out.println("Compra Realizada");
                System.out.println("Escribe 0 para salir o 1 para continuar");
                salir = lectura.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                salir = 0;
            }
        }
        System.out.println("*******************");
        System.out.println("Comrpas Realizadas:\n");
        Collections.sort(tarjeta.getListaDeCompras());
        for (Productos productos : tarjeta.getListaDeCompras()) {
            System.out.println(productos.getNombre() + "-" + productos.getValor());
        }
        System.out.println("\n*******************");
        System.out.println("\nSaldo en la tarjeta: " + (tarjeta.getLimite() + tarjeta.getSaldo()));
    }
}
