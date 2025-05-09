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
public class Contrato {
    private int ID;
    private int ID_cliente;
    private int ID_Servicio;
    private Date FechaInicio;
    private Date FechaFin;
    private Double CostoTotal;
    private String estado;

    public Contrato() {
    }

    public Contrato(int ID_cliente, int ID_Servicio, Date FechaInicio, Date FechaFin, double CostoTotal, String estado) {
        this.ID_cliente = ID_cliente;
        this.ID_Servicio = ID_Servicio;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.CostoTotal = CostoTotal;
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

    public int getID_Servicio() {
        return ID_Servicio;
    }

    public void setID_Servicio(int ID_Servicio) {
        this.ID_Servicio = ID_Servicio;
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

    public double getCostoTotal() {
        return CostoTotal;
    }

    public void setCostoTotal(double CostoTotal) {
        this.CostoTotal = CostoTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
