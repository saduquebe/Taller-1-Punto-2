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
public class Fecha {
    private int año;
    private int mes;
    private int dia;
    private double hora;

    public Fecha(int año, int mes, int dia, double hora) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Fecha{" + "a\u00f1o=" + año + ", mes=" + mes + ", dia=" + dia + ", hora=" + hora + '}';
    }
    
}
