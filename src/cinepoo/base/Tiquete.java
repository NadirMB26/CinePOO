/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinepoo.base;

/**
 *
 * @author nadir
 */
public class Tiquete {
protected Usuario Usuarios;
private Tarifa Precio_Entrada;
private Funcion Pelicula_Actual;
private Sala Asientos_Usuario; 

    public Tiquete() {
    }

    public Tiquete(Usuario Usuarios, Tarifa Precio_Entrada, Funcion Pelicula_Actual, Sala Asientos_Usuario) {
        this.Usuarios = Usuarios;
        this.Precio_Entrada = Precio_Entrada;
        this.Pelicula_Actual = Pelicula_Actual;
        this.Asientos_Usuario = Asientos_Usuario;
    }

    public Usuario getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(Usuario Usuarios) {
        this.Usuarios = Usuarios;
    }

    public Tarifa getPrecio_Entrada() {
        return Precio_Entrada;
    }

    public void setPrecio_Entrada(Tarifa Precio_Entrada) {
        this.Precio_Entrada = Precio_Entrada;
    }

    public Funcion getPelicula_Actual() {
        return Pelicula_Actual;
    }

    public void setPelicula_Actual(Funcion Pelicula_Actual) {
        this.Pelicula_Actual = Pelicula_Actual;
    }

    public Sala getAsientos_Usuario() {
        return Asientos_Usuario;
    }

    public void setAsientos_Usuario(Sala Asientos_Usuario) {
        this.Asientos_Usuario = Asientos_Usuario;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "Usuarios=" + Usuarios + ", Precio_Entrada=" + Precio_Entrada + ", Pelicula_Actual=" + Pelicula_Actual + ", Asientos_Usuario=" + Asientos_Usuario + '}';
    }

}
