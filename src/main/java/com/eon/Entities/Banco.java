package com.eon.Entities;

public class Banco {
    
    private static Cliente clientes[];
    private static int numeroClientes;

    static {
        clientes = new Cliente[10];
        numeroClientes = 0;
    }
    
    private Banco() {
    }
    
    public static void agregarCliente(String nombre, String apellido) {
        clientes[numeroClientes] = new Cliente(nombre, apellido);
        numeroClientes++;
    }
    
    public static int getNumeroClientes() {
        return numeroClientes;
    }

    public static Cliente getCliente(int posicion) {
        return clientes[posicion];
    }
    
}
