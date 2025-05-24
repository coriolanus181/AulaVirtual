import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    Scanner teclado = new Scanner(System.in);
    int opc , opcGE, idE , opcGC;
    String nombreE,carreraE;
    boolean estado= true;
    boolean estadoC1= true;
    boolean estadoC2= true;
    boolean estadoAdministarCursos = true;
    List<Estudiante> estudiantes = new ArrayList<>();
    List<Cursos> cursos= new ArrayList<>();


    cursos.add(new Cursos("Ingles",111));
    cursos.add(new Cursos("Español",123));
    estudiantes.add(new Estudiante("Winder",968,"Sistemas"));
    estudiantes.add(new Estudiante("Joan",971,"Sistemas"));

    cursos.get(0).estudiantes.add(estudiantes.get(0));
    cursos.get(0).estudiantes.add(estudiantes.get(1));

    System.out.println("\n    Bienvenido(a) a Virtual WinKan\n");

    do {
        System.out.print("""
                            * MENÚ *
                    1) Gestión de Estudiantes.
                    2) Gestión de Cursos.
                    3) Buscar Estudiantes.
                    4) Gestión de Notas.
                    5) Salir.
                """);
        System.out.print("    Dígite la opción que desea elegir: ");
        opc = teclado.nextInt();
        System.out.print("    - - - - - - - - - - - - - - - - - -\n");

        switch (opc) {
            case 1 -> {
                do {
                    System.out.println("    + + + GESTIÓN DE ESTUDIANTES + + +");
                    System.out.println("    1) Registrar Estudiante");
                    System.out.println("    2) Eliminar Estudiante");
                    System.out.println("    3) Mostrar Estudiantes");
                    System.out.println("    4) Volver al Menú");
                    System.out.print("    Dígite la opción que desea elegir: ");
                    opcGE = teclado.nextInt();
                    if (opcGE == 1) {
                        System.out.println("    - - - Registrar Estudiantes - - -");
                        teclado.nextLine();
                        System.out.print("  Ingrese el nombre del estudiante: ");
                        nombreE = teclado.nextLine();
                        System.out.print("  Ingrese la ID del estudiante: ");
                        idE = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("  Ingrese el programa: ");
                        carreraE = teclado.nextLine();

                        estudiantes.add(new Estudiante(nombreE, idE, carreraE));


                    } else if (opcGE == 2) {
                        System.out.println("    - - - Eliminar Estudiantes - - -");
                        System.out.print("    Ingrese el  ID del estudiante que desea eliminar: ");
                        int ops = teclado.nextInt();
                        boolean verificarE = false;
                        int indiceE = -1;
                        for (Estudiante e : estudiantes) {
                            if (e.getId() == ops) {
                                verificarE = true;

                                indiceE = estudiantes.indexOf(e);
                            }
                        }

                        if (verificarE == true) {
                            estudiantes.remove(indiceE);
                            System.out.println("     X X X | El estudiante ha sido eliminado correctamente | X X X ");
                        } else {
                            System.out.println("    * * * * *| No existe el estudiante a eliminar | * * * * * ");
                        }

                    } else if (opcGE == 3) {
                        for (Estudiante c : estudiantes) {
                            System.out.println(c);

                        }
                    } else if (opcGE == 4) {
                        estadoC1 = false;
                    } else {
                        System.out.println("    * * * * *| Dígite una opción válida |* * * * *");

                    }
                } while (estadoC1);
            }

            case 2 -> {
                do {
                    System.out.println("\n    + + + GESTIÓN DE CURSOS + + +");
                    System.out.println("    1) Agregar cursos.");
                    System.out.println("    2) Mostrar Cursos.");
                    System.out.println("    3) Eliminar Cursos.");
                    System.out.println("    4) Administrar Estudiantes.");
                    System.out.println("    5) Volver al Menú.");
                    System.out.print("    Dígite la opción que desea elegir: ");
                    opcGC = teclado.nextInt();
                    if (opcGC == 1) {
                        System.out.println("    - - - Agregar Cursos - - -");
                        teclado.nextLine();
                        System.out.print("    Ingrese el nombre del curso: ");
                        String nombreC = teclado.nextLine();
                        System.out.print("    Ingrese el nrc del curso: ");
                        int nrc = teclado.nextInt();
                        cursos.add(new Cursos(nombreC, nrc));

                    } else if (opcGC == 2) {
                        System.out.print("    - - - Cursos - - -");
                        for (Cursos c : cursos) {
                            System.out.print(c);
                            c.mostrarEstudiantes();
                        }
                    } else if (opcGC == 3) {
                        System.out.println("    - - - Eliminar Cursos - - -");
                        System.out.print("    Ingrese el NRC del curso: ");
                        int nrc = teclado.nextInt();
                        boolean verficarC = false;
                        int indiceC = -1;
                        for (Cursos c : cursos) {
                            if (c.getNrc() == nrc) {
                                verficarC = true;
                                indiceC = cursos.indexOf(c);
                            }
                        }

                        if (verficarC == true) {
                            cursos.remove(indiceC);
                            System.out.println("    X X X | El curso ha sido eliminado | X X X   ");

                        } else {
                            System.out.println("    * * * * |No se ha encontrado ningún curso con ese NRC | * * * *     ");
                        }


                    } else if (opcGC == 4) {
                        do {
                            System.out.println("    - - - Administrar Estudiantes - - -");
                            System.out.println("    1) Agregar estudiante al curso.");
                            System.out.println("    2) Eliminar estudiante del curso.");
                            System.out.println("    3) Volver a Gestión de Cursos.");
                            System.out.print("    Dígite la opción que desea elegir: ");
                            int opcAE = teclado.nextInt();
                            if (opcAE == 1) {
                                System.out.println("    - - - Agregar Estudiante al Curso - - -");
                                System.out.print("    Ingrese el ID del estudiante: ");
                                int idAE = teclado.nextInt();
                                boolean verificarEstudiante= false;
                                int indiceEstudiante = -1;
                                for(Estudiante alumno: estudiantes){
                                    if (alumno.getId() == idAE) {
                                        verificarEstudiante = true;
                                        indiceEstudiante= estudiantes.indexOf(alumno);

                                    }
                                }

                                if(verificarEstudiante== true){
                                    System.out.print("    Escriba el NRC del curso al que desea agregarlo: ");
                                    int cursoAE = teclado.nextInt();
                                    boolean verficarNRC = false;
                                    int indiceCurso = -1;

                                    for(Cursos nrc: cursos){
                                        if(nrc.getNrc()== cursoAE){
                                            verficarNRC = true;
                                            indiceCurso = cursos.indexOf(nrc);
                                        }
                                    }

                                    if(verficarNRC==true){
                                        cursos.get(indiceCurso).agregarEstudiante(estudiantes.get(indiceEstudiante));
                                        System.out.println("    X X X | El estudiante ha sido agregado exitosamente | X X X ");
                                    }else{
                                        System.out.println("    * * * * | El curso no ha sido encontrado, dígite un NRC válido | * * * *");
                                    }

                                }else{
                                    System.out.println("    * * * * | El estudiante no ha sido encontrado, dígite un ID válido | * * * *");
                                }





                            } else if (opcAE == 2) {
                                System.out.println("    - - - Eliminar Estudiante del Curso - - -");
                                System.out.print("    Ingrese el ID del estudiante: ");
                                int idAE = teclado.nextInt();
                                System.out.print("    Escriba el NRC del curso que desea eliminarlo: ");
                                int cursoAE = teclado.nextInt();
                                Boolean verificarCurso = false;
                                int indiceCurso = -1;
                                for (Cursos e : cursos) {
                                    if (cursoAE == e.getNrc()) {
                                        verificarCurso = true;
                                        indiceCurso = cursos.indexOf(e);
                                    }
                                }
                                boolean verificarEstudiantes = false;
                                int indiceEstudiante = -1;
                                if (verificarCurso == true) {
                                    for (Estudiante e : cursos.get(indiceCurso).getEstudiantes()) {
                                        if (idAE == e.getId()) {
                                            verificarEstudiantes = true;
                                            indiceEstudiante = cursos.get(indiceCurso).getEstudiantes().indexOf(e);
                                        }
                                    }
                                    if (verificarEstudiantes == true) {
                                        cursos.get(indiceCurso).getEstudiantes().remove(indiceEstudiante);
                                        System.out.println("    X X X | Estudiante eliminado exitosamente | X X X ");
                                    } else {
                                        System.out.println("    * * * * | El estudiante no se encuentra | * * * * ");
                                    }
                                } else {
                                    System.out.println("    * * * * | El curso no se encuentra | * * * * ");
                                }

                            } else if (opcAE == 3) {
                                estadoAdministarCursos = false;
                            } else {
                                estadoAdministarCursos = true;
                                System.out.println("    * * * * *| Dígite una opción válida |* * * * *");
                            }
                        } while (estadoAdministarCursos);
                    } else if (opcGC == 5) {
                        estadoC2 = false;

                    } else {
                        System.out.println("    * * * * *| Dígite una opción válida |* * * * *");
                    }


                } while (estadoC2);

            }
            case 3 -> {

                System.out.println("Ingrese el Id del estudiante");
                int id  = teclado.nextInt();
                boolean verificarEstudiante = false;

                for(Estudiante alumno: estudiantes){
                    if (alumno.getId() == id) {
                        verificarEstudiante = true;
                        System.out.println("Nombre: "+alumno.getNombre());
                        System.out.println("ID: "+alumno.getId());
                        System.out.println("Curso: ");
                        alumno.getCurso(cursos);
                        System.out.println("Programa: "+alumno.getCarrera());
                    }
                }
                if(verificarEstudiante==false){
                    System.out.println("    * * * * | El estudiante no se encuentra | * * * * ");
                }

            }

            case 4 ->{

            }

            case 5 -> estado=false;

            default -> System.out.println("    * * * * *| Dígite una opción valida |* * * * *");

        }
    }while(estado);
    }
}