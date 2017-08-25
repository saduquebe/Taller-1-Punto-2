/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;
import java.util.*;
/**
 *
 * @author PC2017
 */
public class Factura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Ingrese la opcion");
        System.out.println("1.Agregar un producto");
        System.out.println("2.Agregar una venta");
        double opcion= in.nextInt();
        if(opcion==1){
            System.out.println("Digite el codigo del producto");
            int codigo= in.nextInt();
            System.out.println("Digite la descripcion del producto");
            String descripcion= in.next();
            System.out.println("Digite el precio del producto");
            double precio=in.nextDouble();
            Producto producto= new Producto(codigo,descripcion,precio);
            System.out.println(producto);
        }
        else if(opcion==2){
            System.out.println("Digite la fecha");
            String fecha= in.next();
            System.out.println("Digite el id del vendedor");
            int idvendedor=in.nextInt();
            System.out.println("Digite el nombre del vendedor");
            String nombre=in.next();
            System.out.println("Digite el apellido del vendedor");
            String apellido=in.next();
            System.out.println("Digite el codigo de venta");
            int codigo=in.nextInt();
            System.out.println("Digite la cantidad");
            int cantidad=in.nextInt();
            System.out.println("Digite el medio de pago");
            int medio=in.nextInt();
            Vendedor vendedor=new Vendedor(idvendedor,nombre,apellido);
            Venta venta= new Venta(fecha,vendedor,codigo,cantidad,medio);
            System.out.println(venta);
        }
    }
    
}
