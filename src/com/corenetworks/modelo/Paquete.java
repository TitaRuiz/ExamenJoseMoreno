package com.corenetworks.modelo;

import java.util.Scanner;

public class Paquete {
    private String ipOrigen;
    private  String ipDestino;
    private String mensaje;
    private int contadorPaquetes;

    public Paquete() {
    }

    public Paquete(String ipOrigen, String ipDestino, String mensaje, int contadorPaquetes) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.mensaje = mensaje;
        this.contadorPaquetes = contadorPaquetes;
    }

    public String getIpOrigen() {
        return ipOrigen;
    }

    public void setIpOrigen(String ipOrigen) {
        this.ipOrigen = ipOrigen;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getContadorPaquetes() {
        return contadorPaquetes;
    }

    public void setContadorPaquetes(int contadorPaquetes) {
        this.contadorPaquetes = contadorPaquetes;
    }
}



