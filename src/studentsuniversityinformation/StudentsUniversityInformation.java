/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentsuniversityinformation;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author KrRD
 */
 
      
public class StudentsUniversityInformation {
    

    public void ingresar(Student Alumno)throws Exception{
   
        String Archivo_nombre;

        Scanner scnr = new Scanner(System.in);
        Student st = new Student();
        

        System.out.print("Numero de Identificación: ");
        st.NumeroIdentificacion = scnr.nextInt();
        System.out.print("Nombre del estudiante: ");
        st.Nombre = scnr.next();
        System.out.print("Edad del estudiante: ");
        st.Edad = scnr.nextInt();
        System.out.print("Carrera que estudia: ");
        st.Carrera = scnr.next();
        System.out.print("Semestre que cursa: ");
        st.Semestre = scnr.nextInt();
        System.out.print("Nombre de la Universidad: ");
        st.Universidad = scnr.next();

        System.out.print("Por favor ingrese el nombre del archivo: ");
        Archivo_nombre = scnr.next();
        File ArSt = new File(Archivo_nombre);
        PrintWriter WrSt = new PrintWriter(ArSt);
        WrSt.println(Alumno.NumeroIdentificacion);
        WrSt.println(Alumno.Nombre);
        WrSt.println(Alumno.Edad);
        WrSt.println(Alumno.Carrera);
        WrSt.println(Alumno.Semestre);
        WrSt.println(Alumno.Universidad);

        WrSt.close();
        //se da aviso que el archivo ha sido creado
        System.out.println("The file has been created.");

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
