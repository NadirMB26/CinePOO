/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinepoo.base;

/**
 *
 * @author nadir
 */
public class Comentario {
protected String Id_Comentario;
private Usuario nombre;
private String Descripcion;
private String Calificacion;
private Pelicula pelicula;
private Cine Salas;

    public Comentario() {
    }

    public Comentario(String Id_Comentario, Usuario nombre, String Descripcion, String Calificacion, Pelicula pelicula, Cine Salas) {
        this.Id_Comentario = Id_Comentario;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.Calificacion = Calificacion;
        this.pelicula = pelicula;
        this.Salas = Salas;
    }

    public String getId_Comentario() {
        return Id_Comentario;
    }

    public void setId_Comentario(String Id_Comentario) {
        this.Id_Comentario = Id_Comentario;
    }

    public Usuario getNombre() {
        return nombre;
    }

    public void setNombre(Usuario nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(String Calificacion) {
        this.Calificacion = Calificacion;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Cine getSalas() {
        return Salas;
    }

    public void setSalas(Cine Salas) {
        this.Salas = Salas;
    }

    @Override
    public String toString() {
        return "Comentario{" + "Id_Comentario=" + Id_Comentario + ", nombre=" + nombre + ", Descripcion=" + Descripcion + ", Calificacion=" + Calificacion + ", pelicula=" + pelicula + ", Salas=" + Salas + '}';
    }

}
