/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinepoo.base;

/**
 *
 * @author nadir
 */
public class Oferta {
private Horario Dia_Semana;
private String Descripcion;
private String Descuentos;

    public Oferta() {
    }

    public Oferta(Horario Dia_Semana, String Descripcion, String Descuentos) {
        this.Dia_Semana = Dia_Semana;
        this.Descripcion = Descripcion;
        this.Descuentos = Descuentos;
    }

    public Horario getDia_Semana() {
        return Dia_Semana;
    }

    public void setDia_Semana(Horario Dia_Semana) {
        this.Dia_Semana = Dia_Semana;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDescuentos() {
        return Descuentos;
    }

    @Override
    public String toString() {
        return "Oferta{" + "Dia_Semana=" + Dia_Semana + ", Descripcion=" + Descripcion + ", Descuentos=" + Descuentos + '}';
    }

 

}
