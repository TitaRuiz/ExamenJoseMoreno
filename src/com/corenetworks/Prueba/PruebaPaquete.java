package com.corenetworks.Prueba;

import com.corenetworks.modelo.Paquete;
import com.corenetworks.modelo.Servidor;

import java.util.Scanner;

public class PruebaPaquete {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String ipOrigen;
        String ipDestino;
        String mensaje;
        int numPaquetes;

        System.out.println("Escriba la dirección IP de origen: ");
        ipOrigen = teclado.nextLine();
        System.out.println("Esribala dirección IP de destino: ");
        ipDestino = teclado.nextLine();
        System.out.println("escriba su mensaje: ");
        mensaje = teclado.nextLine();

        // Calcular la longitud del mensaje
        int longitud = mensaje.length();
        System.out.println("longitud del texto " + longitud);

        //Calcular el numero de paquetes
        if (mensaje.length() % 20 == 0) {
            //Es par
            numPaquetes = mensaje.length() / 20;
        } else {    //Es impar
            numPaquetes = mensaje.length() / 20 + 1;
        }

        Paquete[] paquetes = new Paquete[numPaquetes];

        for (int i = 0; i < numPaquetes; i++) {
            int posicionInicial = i * 20;

            Paquete p1 = new Paquete(ipOrigen, ipDestino, numPaquetes);
            paquetes[i] = p1;

            if (mensaje.length() % 20 != 0 && i == (paquetes.length - 1)) {
                p1.setMensaje(mensaje.substring(posicionInicial));
                break;
            }

            p1.setMensaje(mensaje.substring(posicionInicial, posicionInicial + 20));

        }

        for (Paquete elemento: paquetes
             ) {
            System.out.println(elemento);
        }

        //Probar
        Servidor s1 = new Servidor();
        System.out.println(s1.leerPaquetes(paquetes));
        System.out.println(s1.leerPaquetes(paquetes));
    }

    }

