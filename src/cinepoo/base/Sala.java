/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinepoo.base;

/**
 *
 * @author nadir
 */
public class Sala {
protected String Id_sala;
private String Nombre_sala;
private String Tipo_Sala;
private Funcion Pelicula_rodando;
private Butaca Cantidad_Butacas; 

    public Sala() {
    }

    public Sala(String Id_sala, String Nombre_sala, String Tipo_Sala, Funcion Pelicula_rodando, Butaca Cantidad_Butacas) {
        this.Id_sala = Id_sala;
        this.Nombre_sala = Nombre_sala;
        this.Tipo_Sala = Tipo_Sala;
        this.Pelicula_rodando = Pelicula_rodando;
        this.Cantidad_Butacas = Cantidad_Butacas;
    }

    public String getId_sala() {
        return Id_sala;
    }

    public void setId_sala(String Id_sala) {
        this.Id_sala = Id_sala;
    }

    public String getNombre_sala() {
        return Nombre_sala;
    }

    public void setNombre_sala(String Nombre_sala) {
        this.Nombre_sala = Nombre_sala;
    }

    public String getTipo_Sala() {
        return Tipo_Sala;
    }

    public void setTipo_Sala(String Tipo_Sala) {
        this.Tipo_Sala = Tipo_Sala;
    }

    public Funcion getPelicula_rodando() {
        return Pelicula_rodando;
    }

    public void setPelicula_rodando(Funcion Pelicula_rodando) {
        this.Pelicula_rodando = Pelicula_rodando;
    }

    public Butaca getCantidad_Butacas() {
        return Cantidad_Butacas;
    }

    @Override
    public String toString() {
        return "Sala{" + "Id_sala=" + Id_sala + ", Nombre_sala=" + Nombre_sala + ", Tipo_Sala=" + Tipo_Sala + ", Pelicula_rodando=" + Pelicula_rodando + ", Cantidad_Butacas=" + Cantidad_Butacas + '}';
    }

  

}
