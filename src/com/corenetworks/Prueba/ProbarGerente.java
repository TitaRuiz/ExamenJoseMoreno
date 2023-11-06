package com.corenetworks.Prueba;

import com.corenetworks.modelo.Gerente;

public class ProbarGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente("Pepe",2_000);

        System.out.println("Calculo ->" + g2.calcularNomina());
        System.out.println("Calculo ->" + g2.calcularNomina(500));
    }
}
