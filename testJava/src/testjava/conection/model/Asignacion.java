/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjava.conection.model;

import java.util.Date;

/**
 *
 * @author camper
 */
public class Asignacion {

    private int ID;
    private int ID_Proyecto;
    private int HorasTrabajadas;
    private Date FechaAsignacion;

    public Asignacion() {
    }

    public Asignacion(int ID_Proyecto, int HorasTrabajadas, Date FechaAsignacion) {
        this.ID_Proyecto = ID_Proyecto;
        this.HorasTrabajadas = HorasTrabajadas;
        this.FechaAsignacion = FechaAsignacion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(int ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;
    }

    public Date getFechaAsignacion() {
        return FechaAsignacion;
    }

    public void setFechaAsignacion(Date FechaAsignacion) {
        this.FechaAsignacion = FechaAsignacion;
    }
    
    
}
