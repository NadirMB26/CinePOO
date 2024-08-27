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
public class Horario {
private String Hora_inicio;
private String Hora_Fin;
private String Dia_Semana;
private List<Funcion>funciones;

    public Horario() {
    }

    public Horario(String Hora_inicio, String Hora_Fin, String Dia_Semana, List<Funcion> funciones) {
        this.Hora_inicio = Hora_inicio;
        this.Hora_Fin = Hora_Fin;
        this.Dia_Semana = Dia_Semana;
        this.funciones = funciones;
    }

    public String getHora_inicio() {
        return Hora_inicio;
    }

    public void setHora_inicio(String Hora_inicio) {
        this.Hora_inicio = Hora_inicio;
    }

    public String getHora_Fin() {
        return Hora_Fin;
    }

    public void setHora_Fin(String Hora_Fin) {
        this.Hora_Fin = Hora_Fin;
    }

    public String getDia_Semana() {
        return Dia_Semana;
    }

    public void setDia_Semana(String Dia_Semana) {
        this.Dia_Semana = Dia_Semana;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    @Override
    public String toString() {
        return "Horario{" + "Hora_inicio=" + Hora_inicio + ", Hora_Fin=" + Hora_Fin + ", Dia_Semana=" + Dia_Semana + ", funciones=" + funciones + '}';
    }

}
