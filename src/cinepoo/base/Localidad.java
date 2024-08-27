/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinepoo.base;

/**
 *
 * @author nadir
 */
public class Localidad {
private String Pais;
private String Ciudad;
private String Sector_Ciudad;
private String Descripcion;

    public Localidad() {
    }

    public Localidad(String Pais, String Ciudad, String Sector_Ciudad, String Descripcion) {
        this.Pais = Pais;
        this.Ciudad = Ciudad;
        this.Sector_Ciudad = Sector_Ciudad;
        this.Descripcion = Descripcion;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getSector_Ciudad() {
        return Sector_Ciudad;
    }

    public void setSector_Ciudad(String Sector_Ciudad) {
        this.Sector_Ciudad = Sector_Ciudad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Localidad{" + "Pais=" + Pais + ", Ciudad=" + Ciudad + ", Sector_Ciudad=" + Sector_Ciudad + ", Descripcion=" + Descripcion + '}';
    }

}
