package com.corenetworks.Prueba;

import com.corenetworks.modelo.Producto;
import com.corenetworks.modelo.ProductoPerecedero;

public class ProbarProducto {

    public static void main(String[] args) {
        ProductoPerecedero pp1 = new ProductoPerecedero
                ("leche",2,1.2,"2023/12/31");
        System.out.println(pp1.toString());
        Producto p1 = new Producto("pan",1,0.8);
        Producto p2 = new Producto("pan",1,0.8);
        System.out.println(p1.toString());
        System.out.println("Resultado del método equals "+ p1.equals(p2));
    }
}
