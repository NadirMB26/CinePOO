/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinepoo.base;

import java.util.List;
import javax.swing.Icon;

/**
 *
 * @author nadir
 */
public class Cartelera {
private List<Pelicula>Peliculas;
private List<Horario>Horarios;
private Icon Imagen_Promocional;
private Horario Dia_Semana;

    public Cartelera() {
    }

    public Cartelera(List<Pelicula> Peliculas, List<Horario> Horarios, Icon Imagen_Promocional, Horario Dia_Semana) {
        this.Peliculas = Peliculas;
        this.Horarios = Horarios;
        this.Imagen_Promocional = Imagen_Promocional;
        this.Dia_Semana = Dia_Semana;
    }

    public List<Pelicula> getPeliculas() {
        return Peliculas;
    }

    public List<Horario> getHorarios() {
        return Horarios;
    }

    public Icon getImagen_Promocional() {
        return Imagen_Promocional;
    }

    public void setImagen_Promocional(Icon Imagen_Promocional) {
        this.Imagen_Promocional = Imagen_Promocional;
    }

    public Horario getDia_Semana() {
        return Dia_Semana;
    }

    public void setDia_Semana(Horario Dia_Semana) {
        this.Dia_Semana = Dia_Semana;
    }

    @Override
    public String toString() {
        return "Cartelera{" + "Peliculas=" + Peliculas + ", Horarios=" + Horarios + ", Imagen_Promocional=" + Imagen_Promocional + ", Dia_Semana=" + Dia_Semana + '}';
    }
}
