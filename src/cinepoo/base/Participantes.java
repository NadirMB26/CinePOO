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
public class Participantes {
private String Rol;
private String Nombre;
private String Apellido;
private Localidad Nacionalidad;
private String Nombre_Artistico;
private List<Pelicula>Papeles_Interpretados;
private List<Pelicula>Peliculas_Dirigidas;
private List<Pelicula>Peliculas_actuadas;

    public Participantes() {
    }

    public Participantes(String Rol, String Nombre, String Apellido, Localidad Nacionalidad, String Nombre_Artistico, List<Pelicula> Papeles_Interpretados, List<Pelicula> Peliculas_Dirigidas, List<Pelicula> Peliculas_actuadas) {
        this.Rol = Rol;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nacionalidad = Nacionalidad;
        this.Nombre_Artistico = Nombre_Artistico;
        this.Papeles_Interpretados = Papeles_Interpretados;
        this.Peliculas_Dirigidas = Peliculas_Dirigidas;
        this.Peliculas_actuadas = Peliculas_actuadas;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Localidad getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(Localidad Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getNombre_Artistico() {
        return Nombre_Artistico;
    }

    public void setNombre_Artistico(String Nombre_Artistico) {
        this.Nombre_Artistico = Nombre_Artistico;
    }

    public List<Pelicula> getPapeles_Interpretados() {
        return Papeles_Interpretados;
    }

    public void setPapeles_Interpretados(List<Pelicula> Papeles_Interpretados) {
        this.Papeles_Interpretados = Papeles_Interpretados;
    }

    public List<Pelicula> getPeliculas_Dirigidas() {
        return Peliculas_Dirigidas;
    }

    public void setPeliculas_Dirigidas(List<Pelicula> Peliculas_Dirigidas) {
        this.Peliculas_Dirigidas = Peliculas_Dirigidas;
    }

    public List<Pelicula> getPeliculas_actuadas() {
        return Peliculas_actuadas;
    }

    @Override
    public String toString() {
        return "Participantes{" + "Rol=" + Rol + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Nacionalidad=" + Nacionalidad + ", Nombre_Artistico=" + Nombre_Artistico + ", Papeles_Interpretados=" + Papeles_Interpretados + ", Peliculas_Dirigidas=" + Peliculas_Dirigidas + ", Peliculas_actuadas=" + Peliculas_actuadas + '}';
    }


  
}
