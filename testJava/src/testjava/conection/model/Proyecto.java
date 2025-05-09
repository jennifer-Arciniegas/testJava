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
public class Proyecto {

    private int ID;
    private int ID_cliente;
    private String nombre;
    private Date FechaInicio;
    private Date FechaFin;
    private String estado;

    public Proyecto() {
    }

    public Proyecto(int ID_cliente, String nombre, Date FechaInicio, Date FechaFin, String estado) {
        this.ID_cliente = ID_cliente;
        this.nombre = nombre;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.estado = estado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
