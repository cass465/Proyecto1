/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 * Esta clase contiene el curso creado con los objetos
 *
 * @version 14/03/2018
 * @author cass465
 */
public class Curso {

    /**
     * Esta funcion crea el curso con los objetos
     *
     * @throws ClassNotFoundException
     */
    public void creandoCurso() throws ClassNotFoundException {
        IntegranteCurso integrantes[] = new IntegranteCurso[20];
        Estudiante estudiantes[] = new Estudiante[15];
        Docente docentes[] = new Docente[5];
        String materias[] = {"MATEMATICAS III", "PROGRAMACION II", "FISICA II", "ARQUITECTURA DE SOFTWARE", "ESTRUCTURAS DE INFORMACION", "ELECTIVA", "BIOLOGIA"};
        String doc1[] = {"PROGRAMACION II", "ARQUITECTURA DE SOFTWARE", "ESTRUCTURAS DE INFORMACION"};
        String doc2[] = {"MATEMATICAS III", "FISICA II"};
        String doc3[] = {"ELECTIVA"};
        String doc4[] = {"BILOGIA"};
        estudiantes[0] = new Estudiante(materias, "ESTUDIANTE", "YEISON FELIPE", "CIFUENTES PALACIOS", 461217171);
        estudiantes[1] = new Estudiante(materias, "ESTUDIANTE", "CAMILO ANDRES", "SANABRIA SANABRIA", 461217172);
        estudiantes[2] = new Estudiante(materias, "ESTUDIANTE", "KAREN VALENTINA", "RODRIGUEZ MAHECHA", 461217173);
        estudiantes[3] = new Estudiante(materias, "ESTUDIANTE", "JUAN MANUEL", "RINCON PEREZ", 461217174);
        estudiantes[4] = new Estudiante(materias, "ESTUDIANTE", "MIGUEL ANGEL", "RUIZ LOPEZ", 461217175);
        estudiantes[5] = new Estudiante(materias, "ESTUDIANTE", "LAURA CATERINE", "LEON RIVERA", 461217176);
        estudiantes[6] = new Estudiante(materias, "ESTUDIANTE", "ANGIE JULIETH", "MENDEZ CARRILLO", 461217177);
        docentes[0] = new Docente(doc1, "DOCENTE", "ALIX JOHANNA", "CARVAJAL PINEDA", 361217111);
        docentes[1] = new Docente(doc2, "DOCENTE", "JULIO CESAR", "GAITAN GARCIA", 361217112);
        docentes[2] = new Docente(doc3, "DOCENTE", "CARLOS JULIO", "ALVARADO SIERRA", 361217113);
        docentes[3] = new Docente(doc4, "DOCENTE", "BLANCA CECILIA", "VARGAS ROJAS", 3612171);
        System.arraycopy(estudiantes, 0, integrantes, 0, 7); //asignar el arreglo de estudiantes a los integrantes del curso
        System.arraycopy(docentes, 0, integrantes, 7, 4); //asignar el arreglo de docentes a los integrantes del curso

    }

}
