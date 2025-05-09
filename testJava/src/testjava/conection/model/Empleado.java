/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjava.conection.model;

/**
 *
 * @author camper
 */
public class Empleado {
    private int ID;
    private String cargo;
    private Double salario;
    private String especialidad;
    private int ID_proyecto;

    public Empleado() {
    }

    public Empleado(String cargo, Double salario, String especialidad, int ID_proyecto) {
        this.cargo = cargo;
        this.salario = salario;
        this.especialidad = especialidad;
        this.ID_proyecto = ID_proyecto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getID_proyecto() {
        return ID_proyecto;
    }

    public void setID_proyecto(int ID_proyecto) {
        this.ID_proyecto = ID_proyecto;
    }
    
    
}
