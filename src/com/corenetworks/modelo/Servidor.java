package com.corenetworks.modelo;

public class Servidor {
    private String ip;

   public String leerPaquetes(Paquete[] paquetes){
       String variable = "";
       for (Paquete elemento : paquetes){
           variable += elemento.getMensaje();
       }
       return variable;
    }
    public boolean verificarPaquetes(Paquete[]paquetes){
       return paquetes.length == paquetes[1].getContadorPaquetes();
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
