/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinepoo.base;

/**
 *
 * @author nadir
 */
public class Butaca {
private String Numero_Butaca;
private String Fila_Pertenece;
private String Adicionales;
protected Sala Id_Sala;  

    public Butaca() {
        
    }

    public Butaca(String Numero_Butaca, String Fila_Pertenece, String Adicionales, Sala Id_Sala) {
        this.Numero_Butaca = Numero_Butaca;
        this.Fila_Pertenece = Fila_Pertenece;
        this.Adicionales = Adicionales;
        this.Id_Sala = Id_Sala;
    }

    public String getNumero_Butaca() {
        return Numero_Butaca;
    }

    public void setNumero_Butaca(String Numero_Butaca) {
        this.Numero_Butaca = Numero_Butaca;
    }

    public String getFila_Pertenece() {
        return Fila_Pertenece;
    }

    public void setFila_Pertenece(String Fila_Pertenece) {
        this.Fila_Pertenece = Fila_Pertenece;
    }

    public String getAdicionales() {
        return Adicionales;
    }

    public void setAdicionales(String Adicionales) {
        this.Adicionales = Adicionales;
    }

    public Sala getId_Sala() {
        return Id_Sala;
    }

    public void setId_Sala(Sala Id_Sala) {
        this.Id_Sala = Id_Sala;
    }

    @Override
    public String toString() {
        return "Butaca{" + "Numero_Butaca=" + Numero_Butaca + ", Fila_Pertenece=" + Fila_Pertenece + ", Adicionales=" + Adicionales + ", Id_Sala=" + Id_Sala + '}';
    }
    
}
