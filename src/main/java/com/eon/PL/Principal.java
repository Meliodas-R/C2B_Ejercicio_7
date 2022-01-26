
package com.eon.PL;

import com.eon.Entities.Banco;

public class Principal {
    
    public static void main(String[] args) {
        
        Banco.agregarCliente("Michar", "Avila");
        Banco.agregarCliente("Sergio", "Adrian");
        
        Banco.generarInfome();
        
    }
}
