import java.util.*;

public class Pruebafactura {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        factura factura1 = new factura("tres", "grande y rojo", 4, 20, 80.00);
        
        System.out.printf("El numero de pieza es: "+ factura1.getNpieza()+ " " +
                          "La descripcion de la pieza es: "+ factura1.getDescripcion()+ " " + 
                          "La cantidad de articulos que desea comprar es: " + factura1.getCantidadcompra() + " " +
                          "El precio de cada articulo es de: " + factura1.getPrecio() + " " +
                          "El precio total de su compra es: " + factura1.getMontoFactura());
                
        System.out.printf("Ingrese el número de pieza: ");
        String npieza = entrada.nextLine();
        factura1.setNpieza(npieza);
        
        System.out.printf("Ingrese la descripción de la pieza: ");
        String descripcion = entrada.nextLine();
        factura1.setDescripcion(descripcion);
        
        System.out.printf("¿Qué cantidad de articulos desea comprar? ");
        int cantidadcompra = entrada.nextInt();
        factura1.setCantidadcompra(cantidadcompra);
        
        System.out.printf("Tiene un precio de: ");
        double precio = entrada.nextDouble();
        factura1.setPrecio(precio);
              
        factura1.getMontoFactura();
        
        System.out.printf("El numero de pieza es: "+ factura1.getNpieza()+ " " +
                          "La descripcion de la pieza es: "+ factura1.getDescripcion()+ " " + 
                          "La cantidad de articulos que desea comprar es: " + factura1.getCantidadcompra() + " " +
                          "El precio de cada articulo es de: " + factura1.getPrecio() + " " +
                          "El precio total de su compra es: " + factura1.getMontoFactura());
        
    }
}
