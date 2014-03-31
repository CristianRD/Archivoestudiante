/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentsuniversityinformation;


/**
 *
 * @author KrRD
 */
public class Student {
    

    public int NumeroIdentificacion;
    public String Nombre;
    public int Edad;
    public String Carrera;
    public int Semestre;
    public String Universidad;

    /**
     * @return the NumeroIdentificacion
     */
    public int getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    /**
     * @param NumeroIdentificacion the NumeroIdentificacion to set
     */
    public void setNumeroIdentificacion(int NumeroIdentificacion) {
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the Carrera
     */
    public String getCarrera() {
        return Carrera;
    }

    /**
     * @param Carrera the Carrera to set
     */
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    /**
     * @return the Semestre
     */
    public int getSemestre() {
        return Semestre;
    }

    /**
     * @param Semestre the Semestre to set
     */
    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    /**
     * @return the Universidad
     */
    public String getUniversidad() {
        return Universidad;
    }

    /**
     * @param Universidad the Universidad to set
     */
    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

}
