package factura;

public class Producto {
private int codigo;
private String Descripcion;
private double Precio;

    public Producto(int codigo, String Descripcion, double Precio) {
        this.codigo = codigo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", Descripcion=" + Descripcion + ", Precio=" + Precio + '}';
    }

}
