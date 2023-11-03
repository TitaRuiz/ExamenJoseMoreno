public class Ejercicio1 {
    public static void main(String[] args) {
//variables
        String ipClase3 = "192.168.2";


        for (int i = 0; i < 256; i++) {
            String direccionIp = ipClase3 + "." + i;
            System.out.println(direccionIp);
        }
    }
}