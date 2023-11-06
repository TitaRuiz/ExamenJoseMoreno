package com.corenetworks.modelo;

public class Gerente extends Empleado{

    private String departamento;

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public double calcularNomina() {
        return super.calcularNomina()+500;
    }
    public double calcularNomina(double bono) {
        return super.calcularNomina()+bono;
    }
    public Gerente() {
    }
    public Gerente(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    public Gerente(String nombre, Double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
}
