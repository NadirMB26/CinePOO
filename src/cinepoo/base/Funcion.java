/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinepoo.base;
import java.util.List;
/**
 *
 * @author nadir
 */
public class Funcion {
private Horario Hora_Inicio;
protected Sala Id_Sala;
private List<Pelicula>Id_Pelicula;
private String Tipo_Funcion;   

    public Funcion() {
    }

    public Funcion(Horario Hora_Inicio, Sala Id_Sala, List<Pelicula> Id_Pelicula, String Tipo_Funcion) {
        this.Hora_Inicio = Hora_Inicio;
        this.Id_Sala = Id_Sala;
        this.Id_Pelicula = Id_Pelicula;
        this.Tipo_Funcion = Tipo_Funcion;
    }

    public Horario getHora_Inicio() {
        return Hora_Inicio;
    }

    public void setHora_Inicio(Horario Hora_Inicio) {
        this.Hora_Inicio = Hora_Inicio;
    }

    public Sala getId_Sala() {
        return Id_Sala;
    }

    public void setId_Sala(Sala Id_Sala) {
        this.Id_Sala = Id_Sala;
    }

    public List<Pelicula> getId_Pelicula() {
        return Id_Pelicula;
    }

    public void setId_Pelicula(List<Pelicula> Id_Pelicula) {
        this.Id_Pelicula = Id_Pelicula;
    }

    public String getTipo_Funcion() {
        return Tipo_Funcion;
    }

    public void setTipo_Funcion(String Tipo_Funcion) {
        this.Tipo_Funcion = Tipo_Funcion;
    }

    @Override
    public String toString() {
        return "Funcion{" + "Hora_Inicio=" + Hora_Inicio + ", Id_Sala=" + Id_Sala + ", Id_Pelicula=" + Id_Pelicula + ", Tipo_Funcion=" + Tipo_Funcion + '}';
    }

}
