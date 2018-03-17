/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 * Esta clase realiza los procesos de los estudiantes
 *
 * @version 14/03/2018
 * @author cass465
 */
public class Estudiante extends IntegranteCurso {

    private String materias[];//array de materias estudiantes

    /**
     *
     * @param materias
     * @param tipoIntegrante
     * @param nombre
     * @param apellido
     * @param codigo
     */
    public Estudiante(String[] materias, String tipoIntegrante, String nombre, String apellido, long codigo) {
        super(tipoIntegrante, nombre, apellido, codigo);
        this.materias = materias;
    }

}
