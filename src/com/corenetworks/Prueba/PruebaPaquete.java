package com.corenetworks.Prueba;

import com.corenetworks.modelo.Paquete;

import java.util.Scanner;

public class PruebaPaquete {
    public static void main(String[] args) {



        Scanner teclado = new Scanner(System.in);
        Paquete p1 = new Paquete();

        System.out.println("Escriba la dirección IP de origen: ");
        p1.setIpOrigen(teclado.nextLine());
        System.out.println("Esribala dirección IP de destino: ");
        p1.setIpDestino(teclado.nextLine());
        System.out.println("escriba su mensaje: ");
        p1.setMensaje(teclado.nextLine());
        String mensaje = teclado.nextLine();
        p1.setMensaje(mensaje);
        // Calcular la longitud del mensaje
        int longitud = mensaje.length();

        String[] paquete;
        if (mensaje.length() % 20 == 0) {
            //Es par
            paquete = new String[mensaje.length() / 20];
        } else {    //Es impar
            paquete = new String[mensaje.length() / 20 * 1];
        }
        for (int i = 0; i < paquete.length; i++) {
            int posicionInicial = i * 20;
            System.out.println(posicionInicial);
            paquete[i] = mensaje.substring(posicionInicial, posicionInicial + 20);
            System.out.println(paquete[i]);
            if (mensaje.length() % 20 != 0 && i == paquete.length - 1) {
                paquete[i] = mensaje.substring(posicionInicial);

            }
        }

    }
}
