package com.corenetworks.modelo;

import java.util.Objects;

public class ProductoPerecedero extends Producto{
    private String fCaducidad;

    @Override
    public String toString() {
        return "ProductoPerecedero{" +
                "fCaducidad='" + fCaducidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", pvp=" + pvp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductoPerecedero that = (ProductoPerecedero) o;
        return Objects.equals(fCaducidad, that.fCaducidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fCaducidad);
    }

    public ProductoPerecedero() {
    }

    public ProductoPerecedero(String nombre, int cantidad, double pvp, String fCaducidad) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
    }

    public String getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(String fCaducidad) {
        this.fCaducidad = fCaducidad;
    }


}
