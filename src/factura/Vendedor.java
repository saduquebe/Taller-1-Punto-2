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
public class Vendedor {
    private int Id;
    private String nombre;
    private String apellido;

    public Vendedor(int Id, String nombre, String apellido) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "Id=" + Id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
