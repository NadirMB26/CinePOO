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
public class Cine {
private String Link_pagina;
private String Nombre_Cine;
private String Telefono;
private String Gerente;
private Localidad Sector;
private Sala cantidad;
private Horario horario_Cine;
private List<Usuario>Usuarios;
private List<Comentario>comentarios;   

    public Cine() {
    }

    public Cine(String Link_pagina, String Nombre_Cine, String Telefono, String Gerente, Localidad Sector, Sala cantidad, Horario horario_Cine, List<Usuario> Usuarios, List<Comentario> comentarios) {
        this.Link_pagina = Link_pagina;
        this.Nombre_Cine = Nombre_Cine;
        this.Telefono = Telefono;
        this.Gerente = Gerente;
        this.Sector = Sector;
        this.cantidad = cantidad;
        this.horario_Cine = horario_Cine;
        this.Usuarios = Usuarios;
        this.comentarios = comentarios;
    }

    public String getLink_pagina() {
        return Link_pagina;
    }

    public void setLink_pagina(String Link_pagina) {
        this.Link_pagina = Link_pagina;
    }

    public String getNombre_Cine() {
        return Nombre_Cine;
    }

    public void setNombre_Cine(String Nombre_Cine) {
        this.Nombre_Cine = Nombre_Cine;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getGerente() {
        return Gerente;
    }

    public void setGerente(String Gerente) {
        this.Gerente = Gerente;
    }

    public Localidad getSector() {
        return Sector;
    }

    public void setSector(Localidad Sector) {
        this.Sector = Sector;
    }

    public Sala getCantidad() {
        return cantidad;
    }

    public void setCantidad(Sala cantidad) {
        this.cantidad = cantidad;
    }

    public Horario getHorario_Cine() {
        return horario_Cine;
    }

    public void setHorario_Cine(Horario horario_Cine) {
        this.horario_Cine = horario_Cine;
    }

    public List<Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(List<Usuario> Usuarios) {
        this.Usuarios = Usuarios;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        return "Cine{" + "Link_pagina=" + Link_pagina + ", Nombre_Cine=" + Nombre_Cine + ", Telefono=" + Telefono + ", Gerente=" + Gerente + ", Sector=" + Sector + ", cantidad=" + cantidad + ", horario_Cine=" + horario_Cine + ", Usuarios=" + Usuarios + ", comentarios=" + comentarios + '}';
    }



}
