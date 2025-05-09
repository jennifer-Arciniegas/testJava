/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testjava.conection.prueba;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class application {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("****MENU*****");
        System.out.println("1. Gestión de Clientes:");
        System.out.println("2. Gestión de Servicios");
        System.out.println("3. Gestión de Contratos");
        System.out.println("4. Gestión de Proyectos");
        System.out.println("5. Gestión de Empleados");
        System.out.println("6. Reportes");
         System.out.println("7. Salir");
         System.out.println("Ingrese:");
        int opc = teclado.nextInt();
        teclado.nextLine();
        
        switch (opc) {
            case 1:
                {
                    System.out.println("Opciones:");
                    System.out.println("1. Registrar un nuevo cliente.");
                    System.out.println("2. Listar todos los clientes con su sector y contratos activos.");
                    int opc1 = teclado.nextInt();
                    teclado.nextLine();
                    if (opc1 == 1) {
                        System.out.println("Registrar un nuevo cliente");
                    }else if (opc1 == 2){
                        System.out.println("Listar ");
                    }       break;
                }
            case 2:
                {
                    System.out.println("Opciones:");
                    System.out.println("1. Registrar un nuevo servicio..");
                    System.out.println("2. Consultar servicios por categoría.");
                    int opc1 = teclado.nextInt();
                    teclado.nextLine();
                    if (opc1 == 1) {
                        System.out.println("Registrar un nuevo servicio..");
                    }else if (opc1 == 2){
                        System.out.println("Consultar ");
                    }       break;
                }
            case 3:
                {
                    System.out.println("Opciones:");
                    System.out.println("1. Registrar un nuevo contrato.");
                    System.out.println("2. Consultar contratos activos para un cliente.");
                    System.out.println("3.Finalizar un contrato.");
                    int opc1 = teclado.nextInt();
                    teclado.nextLine();
                    if (opc1 == 1) {
                        System.out.println("Registrar un nuevo contrato..");
                    }else if (opc1 == 2){
                        System.out.println("Consultar ");
                    } else if (opc1 == 3){
                        System.out.println("finalizar ");
                    }      break;
                }
            case 4:
                {
                    System.out.println("Opciones:");
                    System.out.println("1. Crear un nuevo proyecto para un cliente.");
                    System.out.println("2. Asignar empleados a un proyecto.");
                    System.out.println("3.Consultar proyectos activos y su estado.");
                    int opc1 = teclado.nextInt();
                    teclado.nextLine();
                    if (opc1 == 1) {
                        System.out.println("crear");
                    }else if (opc1 == 2){
                        System.out.println("asignar ");
                    } else if (opc1 == 3){
                        System.out.println("consultar ");
                    }      break;
                }  
            case 5:
                {
                    System.out.println("Opciones:");
                    System.out.println("1. Registrar un nuevo empleado.");
                    System.out.println("2. Consultar empleados asignados a un proyecto.");
                    System.out.println("3. Registrar horas trabajadas por empleado.");
                    int opc1 = teclado.nextInt();
                    teclado.nextLine();
                    if (opc1 == 1) {
                        System.out.println("Registrar un nuevo empleado");
             
                    }else if (opc1 == 2){
                        System.out.println("Consultar ");
                    } else if (opc1 == 3){
                        System.out.println("Registrar horas ");
                    }      break;
                }  
             case 6:
                {
                    System.out.println("Opciones:");
                    System.out.println("1. Ver ingresos totales generados por los contratos activos.");
                    System.out.println("2. Listar los servicios más contratados.");
                    System.out.println("3. Listar los empleados con más horas trabajadas.");
                    int opc1 = teclado.nextInt();
                    teclado.nextLine();
                    if (opc1 == 1) {
                        System.out.println("Ver ingresos totales");
                    }else if (opc1 == 2){
                        System.out.println(" Listar los servicios ");
                    } else if (opc1 == 3){
                        System.out.println("Listar los empleados ");
                    }      break;
                }  
            default:
                break;
        }
        
        
       

    }

}
