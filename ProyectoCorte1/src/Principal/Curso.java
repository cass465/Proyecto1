/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in);
        byte opcion;
        do {
            System.out.println("INGRESE UNA OPCION");
            System.out.println("1. VER ARCHIVO");
            System.out.println("2. CREAR INTEGRANTE (ESTUDIANTE / DOCENTE)");
            System.out.println("3. ELIMINAR INTEGRANTE (ESTUDIANTE / DOCENTE)");
            System.out.println("4. VER MATERIAS DE LOS DOCENTES");
            System.out.println("5. VER LISTADO GENERAL");
            System.out.println("6. VER MEJORES PROMEDIOS");
            System.out.println("7. ASIGNAR NOTAS");
            System.out.println("0. SALIR");
            opcion = leer.nextByte();
            switch (opcion) {
                case 1:
                    archivando(integrantes);
                    break;
                case 2:
                      crearIntegrante(estudiantes, docentes, integrantes, materias);
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    System.out.println("-------------------------");
                    System.out.println("EL PROGRAMA HA FINALIZADO");
                    System.out.println("-------------------------");
                    break;
                default:
                    System.out.println("--OPCION INVALIDA--");
            }
        } while (opcion != 0);
    }

    /**
     * Archivar los datos al disco duro y recuperarlos para imprimir en consola
     *
     * @param integrantes
     * @throws ClassNotFoundException
     */
    public void archivando(IntegranteCurso[] integrantes) throws ClassNotFoundException {
        try {
            try (ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream("curso.txt"))) {
                escritura.writeObject(integrantes);
                escritura.close();
            }
            try (ObjectInputStream lectura = new ObjectInputStream(new FileInputStream("curso.txt"))) {
                IntegranteCurso integrantesEscritura[] = (IntegranteCurso[]) lectura.readObject();
                lectura.close();

                for (int i = 0; i < integrantesEscritura.length; i++) {
                    if (integrantesEscritura[i] != null) {
                        System.out.println((i + 1) + ". " + integrantesEscritura[i]);
                    }
                }
            }

        } catch (IOException e) {

        }
    }
   public void crearIntegrante(Estudiante[] estudiantes, Docente[] docentes, IntegranteCurso[] integrantes, String[] materias) {

        Scanner leer = new Scanner(System.in);
        byte opcion;
        String nombre;
        String apellido;
        long codigo;
        byte cupoEstudiantes = 0;
        byte cupoDocentes = 0;
        String materiasIndefinidas[] = {"MATERIA INDEFINIDA"};
        System.out.println("QUE TIPO DE ROL DESEA CREAR");
        System.out.println("1. ESTUDIANTE");
        System.out.println("2. DOCENTE");
        opcion = leer.nextByte();
        switch (opcion) {
            case 1:
                for (int i = 0; i < 15; i++) {
                    if (estudiantes[i] != null) {
                        cupoEstudiantes++;
                    }

                }
                if (cupoEstudiantes < 15) {
                    for (int i = 0; i < 15; i++) {
                        if (estudiantes[i] == null) {
                            System.out.print("INGRESE EL NOMBRE DEL ESTUDIANTE: ");
                            nombre = leer.nextLine();
                            nombre = leer.nextLine();
                            System.out.print("INGRESE EL APELLIDO DEL ESTUDIANTE: ");
                            apellido = leer.nextLine();
                            System.out.print("INGRESE EL CODIGO DEL ESTUDIANTE: ");
                            codigo = leer.nextLong();
                            estudiantes[i] = new Estudiante(materias, "ESTUDIANTE", nombre.toUpperCase(), apellido.toUpperCase(), codigo);
                            for (int j = 0; j < 15; j++) {
                                if (integrantes[j] == null) {
                                    integrantes[j] = estudiantes[i];
                                    j = 15;
                                }

                            }
                            i = 15;
                        }
                    }
                } else {
                    System.out.println("-------------------------------------------------");
                    System.out.println("EL CUPO DE ESTUDIANTES PARA ESTE CURSO ESTA LLENO");
                    System.out.println("-------------------------------------------------");
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    if (docentes[i] != null) {
                        cupoDocentes++;
                    }

                }
                if (cupoDocentes < 5) {
                    for (int i = 0; i < 5; i++) {
                        if (docentes[i] == null) {
                            System.out.print("INGRESE EL NOMBRE DEL DOCENTE: ");
                            nombre = leer.nextLine();
                            nombre = leer.nextLine();
                            System.out.print("INGRESE EL APELLIDO DEL DOCENTE: ");
                            apellido = leer.nextLine();
                            System.out.print("INGRESE EL CODIGO DEL DOCENTE: ");
                            codigo = leer.nextLong();
                            docentes[i] = new Docente(materiasIndefinidas, "DOCENTE", nombre.toUpperCase(), apellido.toUpperCase(), codigo);
                            for (int j = 0; j < 5; j++) {
                                if (integrantes[j] == null) {
                                    integrantes[j] = docentes[i];
                                    j = 5;
                                }

                            }
                            i = 5;
                        }
                    }
                } else {
                    System.out.println("----------------------------------------------");
                    System.out.println("EL CUPO DE DOCENTES PARA ESTE CURSO ESTA LLENO");
                    System.out.println("----------------------------------------------");
                }
                break;
            default:
                System.out.println("--OPCION INVALIDA--");
        }

    } 
}
