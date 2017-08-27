/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author PC2017
 */
public class Venta {
   private Fecha fecha;
   private Vendedor vendedor;
   private int codigo;
   private int cantidad;
   private int formadepago;

    public Venta(Fecha fecha, Vendedor vendedor, int codigo, int cantidad, int formadepago) {
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.formadepago = formadepago;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(int formadepago) {
        this.formadepago = formadepago;
    }
    public void imprimir(){
        System.out.println("      "+this.fecha.getAño()+" "+this.fecha.getMes()+" "+this.fecha.getDia()+" "+this.fecha.getHora());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ID "+ this.vendedor.getId()+" Vendedor "+this.vendedor.getNombre()+" "+this.vendedor.getApellido());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Codigo del producto= "+this.codigo);
        System.out.println("    ");
        System.out.println("Cantidad de productos= "+this.cantidad);
        System.out.println("    ");
        System.out.println(this.formadepago+ "FORMA DE PAGO= ");
        
    }

    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", vendedor=" + vendedor + ", codigo=" + codigo + ", cantidad=" + cantidad + ", formadepago=" + formadepago + '}';
    }
   
}
