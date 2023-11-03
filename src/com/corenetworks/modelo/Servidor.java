package com.corenetworks.modelo;

public class Servidor {
    private String ip;

    public String leerPaquetes(Paquete[]paquetes){
return leerPaquetes(paquetes);
    }
    public boolean verificarPaquetes(Paquete[]paquetes){
return verificarPaquetes(paquetes);
    }

    public Servidor() {
    }

    public Servidor(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
