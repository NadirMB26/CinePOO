/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinepoo.base;

/**
 *
 * @author nadir
 */

public class Tarifa {
private String Precio;
private Sala Tipo;
private Oferta ofertas;  

    public Tarifa() {
    }

    public Tarifa(String Precio, Sala Tipo, Oferta ofertas) {
        this.Precio = Precio;
        this.Tipo = Tipo;
        this.ofertas = ofertas;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public Sala getTipo() {
        return Tipo;
    }

    public void setTipo(Sala Tipo) {
        this.Tipo = Tipo;
    }

    public Oferta getOfertas() {
        return ofertas;
    }

    public void setOfertas(Oferta ofertas) {
        this.ofertas = ofertas;
    }

    @Override
    public String toString() {
        return "Tarifa{" + "Precio=" + Precio + ", Tipo=" + Tipo + ", ofertas=" + ofertas + '}';
    }
}
