/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinepoo.base;

import java.util.Date;

/**
 *
 * @author nadir
 */
public class Usuario {
protected String Nombre_Usuario;
protected String Edad_usuario;
protected Date Fecha_Registro;
protected Localidad Sector;
protected String Correo_Usuario;
protected String Contra_Usuario;   

    public Usuario() {
    }

    public Usuario(String Nombre_Usuario, String Edad_usuario, Date Fecha_Registro, Localidad Sector, String Correo_Usuario, String Contra_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
        this.Edad_usuario = Edad_usuario;
        this.Fecha_Registro = Fecha_Registro;
        this.Sector = Sector;
        this.Correo_Usuario = Correo_Usuario;
        this.Contra_Usuario = Contra_Usuario;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String Nombre_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
    }

    public String getEdad_usuario() {
        return Edad_usuario;
    }

    public void setEdad_usuario(String Edad_usuario) {
        this.Edad_usuario = Edad_usuario;
    }

    public Date getFecha_Registro() {
        return Fecha_Registro;
    }

    public void setFecha_Registro(Date Fecha_Registro) {
        this.Fecha_Registro = Fecha_Registro;
    }

    public Localidad getSector() {
        return Sector;
    }

    public void setSector(Localidad Sector) {
        this.Sector = Sector;
    }

    public String getCorreo_Usuario() {
        return Correo_Usuario;
    }

    public void setCorreo_Usuario(String Correo_Usuario) {
        this.Correo_Usuario = Correo_Usuario;
    }

    public String getContra_Usuario() {
        return Contra_Usuario;
    }

    public void setContra_Usuario(String Contra_Usuario) {
        this.Contra_Usuario = Contra_Usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre_Usuario=" + Nombre_Usuario + ", Edad_usuario=" + Edad_usuario + ", Fecha_Registro=" + Fecha_Registro + ", Sector=" + Sector + ", Correo_Usuario=" + Correo_Usuario + ", Contra_Usuario=" + Contra_Usuario + '}';
    }

}
