package com.corenetworks.modelo;

import java.util.Scanner;

public class Paquete {
    private String ipOrigen;
    private  String ipDestino;
    private String mensaje;
    private String[] contadorPaquetes;

    public Paquete() {
    }

    public Paquete(String ipOrigen, String ipDestino, String mensaje, String[] contadorPaquetes) {
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

    public String[] getContadorPaquetes() {
        return contadorPaquetes;
    }

    public void setContadorPaquetes(String[] contadorPaquetes) {
        this.contadorPaquetes = contadorPaquetes;
    }
}


