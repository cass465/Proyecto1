/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.Serializable;

/**
 *
 * @author cass465
 */
public class IntegranteCurso implements Serializable {

    private String tipoIntegrante;
    private String nombre;
    private String apellido;
    private long codigo;

    /**
     * Constructor de los integrantes del curso
     *
     * @param tipoIntegrante
     * @param nombre
     * @param apellido
     * @param codigo
     */
    public IntegranteCurso(String tipoIntegrante, String nombre, String apellido, long codigo) {
        this.tipoIntegrante = tipoIntegrante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    /**
     * Obtener nombre del integrante del curso
     *
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtener apellido del integrante del curso
     *
     * @return String
     */
    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return tipoIntegrante + " " + nombre + " " + apellido + " " + codigo;
    }
}
