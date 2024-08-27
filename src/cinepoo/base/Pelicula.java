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
public class Pelicula {
protected String Id_Pelicula;
private String Titulo_Distribucion;
private String Titulo_Original;
private String Idiomas;
private String Subtitulos;
private String Pais_Origen;
private String A_Produccion;
private String Duracion;
private String Clasificacion;
private String Resumen_Pelicula;
private String Identificador;
private Participantes reparto;
private List<Comentario>comentarios;

    public Pelicula() {
    }

    public Pelicula(String Id_Pelicula, String Titulo_Distribucion, String Titulo_Original, String Idiomas, String Subtitulos, String Pais_Origen, String A_Produccion, String Duracion, String Clasificacion, String Resumen_Pelicula, String Identificador, Participantes reparto, List<Comentario> comentarios) {
        this.Id_Pelicula = Id_Pelicula;
        this.Titulo_Distribucion = Titulo_Distribucion;
        this.Titulo_Original = Titulo_Original;
        this.Idiomas = Idiomas;
        this.Subtitulos = Subtitulos;
        this.Pais_Origen = Pais_Origen;
        this.A_Produccion = A_Produccion;
        this.Duracion = Duracion;
        this.Clasificacion = Clasificacion;
        this.Resumen_Pelicula = Resumen_Pelicula;
        this.Identificador = Identificador;
        this.reparto = reparto;
        this.comentarios = comentarios;
    }

    public String getId_Pelicula() {
        return Id_Pelicula;
    }

    public void setId_Pelicula(String Id_Pelicula) {
        this.Id_Pelicula = Id_Pelicula;
    }

    public String getTitulo_Distribucion() {
        return Titulo_Distribucion;
    }

    public void setTitulo_Distribucion(String Titulo_Distribucion) {
        this.Titulo_Distribucion = Titulo_Distribucion;
    }

    public String getTitulo_Original() {
        return Titulo_Original;
    }

    public void setTitulo_Original(String Titulo_Original) {
        this.Titulo_Original = Titulo_Original;
    }

    public String getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(String Idiomas) {
        this.Idiomas = Idiomas;
    }

    public String getSubtitulos() {
        return Subtitulos;
    }

    public void setSubtitulos(String Subtitulos) {
        this.Subtitulos = Subtitulos;
    }

    public String getPais_Origen() {
        return Pais_Origen;
    }

    public void setPais_Origen(String Pais_Origen) {
        this.Pais_Origen = Pais_Origen;
    }

    public String getA_Produccion() {
        return A_Produccion;
    }

    public void setA_Produccion(String A_Produccion) {
        this.A_Produccion = A_Produccion;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getResumen_Pelicula() {
        return Resumen_Pelicula;
    }

    public void setResumen_Pelicula(String Resumen_Pelicula) {
        this.Resumen_Pelicula = Resumen_Pelicula;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public Participantes getReparto() {
        return reparto;
    }

    public void setReparto(Participantes reparto) {
        this.reparto = reparto;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Id_Pelicula=" + Id_Pelicula + ", Titulo_Distribucion=" + Titulo_Distribucion + ", Titulo_Original=" + Titulo_Original + ", Idiomas=" + Idiomas + ", Subtitulos=" + Subtitulos + ", Pais_Origen=" + Pais_Origen + ", A_Produccion=" + A_Produccion + ", Duracion=" + Duracion + ", Clasificacion=" + Clasificacion + ", Resumen_Pelicula=" + Resumen_Pelicula + ", Identificador=" + Identificador + ", reparto=" + reparto + ", comentarios=" + comentarios + '}';
    }

}
