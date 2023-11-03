package com.corenetworks.Prueba;

import com.corenetworks.modelo.Paquete;

import java.util.Scanner;

public class PruebaPaquete {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Paquete p1= new Paquete();

        System.out.println("Escriba la dirección IP de origen: ");
        p1.setIpOrigen(teclado.nextLine());
        System.out.println("Esribala dirección IP de destino: ");
        p1.setIpDestino(teclado.nextLine());
        System.out.println("escriba su mensaje: ");
        p1.setMensaje(teclado.nextLine());








    }
}

