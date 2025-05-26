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
    int opc , opcGE, idE , opcGC , nrcG;
    String nombreE,carreraE,jornadaD;
    boolean estado= true;
    boolean estadoC1= true;
    boolean estadoC2= true;
    boolean estadoAdministarCursos = true;
    List<Estudiante> estudiantes = new ArrayList<>();
    List<Docente> docentes = new ArrayList<>();
    List<Cursos> cursos= new ArrayList<>();



    cursos.add(new Cursos(111,"Ingles",40,30,30));
    cursos.add(new Cursos(123,"Español",25,25,50));
    estudiantes.add(new Estudiante("Winder",968,"Sistemas"));
    estudiantes.add(new Estudiante("Joan",971,"Sistemas"));
    docentes.add(new Docente(999,"William Matallana","Manana"));
    cursos.get(0).getEstudiantes().add(estudiantes.get(0));
    cursos.get(0).getEstudiantes().add(estudiantes.get(1));
    cursos.get(0).asignarDocente(docentes.get(0));
    cursos.get(0).agregarActividad(" Vocabulario",1);

    System.out.println("    Bienvenido(a) a Virtual WinKan\n");

    do {
        System.out.print("""
                            * MENÚ *
                    1) Gestión de Estudiantes.
                    2) Gestión de Docentes.
                    3) Gestión de Cursos.
                    4) Buscar Estudiantes.
                    5) Gestión de Notas.
                    6) Salir.
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
                        if(estudiantes.size()!=0){
                        for (Estudiante c : estudiantes) {
                            System.out.println(c);

                        }
                    }else {
                        System.out.println("     X X X | No hay Estudiantes en el sistema  | X X X ");
                    }
                    } else if (opcGE == 4) {
                        estadoC1 = false;
                    } else {
                        System.out.println("    * * * * *| Dígite una opción válida |* * * * *");

                    }
                } while (estadoC1);
            }
            case 2 ->{
                do {
                    System.out.println("    + + + GESTIÓN DE DOCENTES + + +");
                    System.out.println("    1) Registrar Docentes");
                    System.out.println("    2) Eliminar Docentes");
                    System.out.println("    3) Mostrar Docentes");
                    System.out.println("    4) Volver al Menú");
                    System.out.print("    Dígite la opción que desea elegir: ");
                    opcGE = teclado.nextInt();
                    if (opcGE == 1) {
                        System.out.println("    - - - Registrar Docentes - - -");
                        teclado.nextLine();
                        System.out.print("  Ingrese el nombre del Docente: ");
                        nombreE = teclado.nextLine();
                        System.out.print("  Ingrese la ID del Docente : ");
                        idE = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("  Ingrese la jornada del Docente (Mañana o Tarde): ");
                        jornadaD = teclado.nextLine();

                        docentes.add(new Docente ( idE,nombreE, jornadaD));


                    } else if (opcGE == 2) {
                        System.out.println("    - - - Eliminar Docentes - - -");
                        System.out.print("    Ingrese el  ID del Docente  que desea eliminar: ");
                        int ops = teclado.nextInt();
                        boolean verificarE = false;
                        int indiceE = -1;
                        for (Docente docente : docentes) {
                            if (docente.getId() == ops) {
                                verificarE = true;

                                indiceE = docentes.indexOf(docente);
                            }
                        }

                        if (verificarE == true) {
                            docentes.remove(indiceE);
                            System.out.println("     X X X | El Docente ha sido eliminado correctamente | X X X ");
                        } else {
                            System.out.println("    * * * * *| No existe el docente a eliminar | * * * * * ");
                        }

                    } else if (opcGE == 3) {
                        if(docentes.size()!=0){
                        for (Docente docente : docentes) {
                            System.out.println(docente);

                        }}else {
                            System.out.println("     X X X | No hay docentes en el sistema  | X X X ");
                        }
                    } else if (opcGE == 4) {
                        estadoC1 = false;
                    } else {
                        System.out.println("    * * * * *| Dígite una opción válida |* * * * *");

                    }
                } while (estadoC1);
            }
            case 3 -> {
                do {
                    System.out.println("\n    + + + GESTIÓN DE CURSOS + + +");
                    System.out.println("    1) Agregar cursos.");
                    System.out.println("    2) Mostrar Cursos.");
                    System.out.println("    3) Eliminar Cursos.");
                    System.out.println("    4) Administrar Estudiantes.");
                    System.out.println("    5) Administrar Docentes.");
                    System.out.println("    6) Volver al Menú.");
                    System.out.print("    Dígite la opción que desea elegir: ");
                    opcGC = teclado.nextInt();
                    if (opcGC == 1) {
                        System.out.println("    - - - Agregar Cursos - - -");
                        teclado.nextLine();
                        System.out.print("    Ingrese el nombre del curso: ");
                        String nombreC = teclado.nextLine();
                        System.out.print("    Ingrese el nrc del curso: ");
                        int nrc = teclado.nextInt();
                        System.out.print("    Ingrese el porcentaje de trabajos del curso: ");
                        double pt = teclado.nextInt();
                        System.out.print("    Ingrese el porcentaje de los Quizzes del curso: ");
                        double pq = teclado.nextInt();
                        System.out.print("    Ingrese el porcentaje del parcial curso: ");
                        double pp = teclado.nextInt();
                        cursos.add(new Cursos(nrc,nombreC,pt,pq,pp));

                    } else if (opcGC == 2) {
                        System.out.print("    - - - Cursos - - -");
                        for (Cursos c : cursos) {
                            System.out.print(c);
                            c.mostrarDocente();
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
                        do {
                            System.out.println("    - - - Administrar Docentes  - - -");
                            System.out.println("    1) Asignar Docente a un curso.");
                            System.out.println("    2) Destituir Docente de un  curso.");
                            System.out.println("    3) Volver a Gestión de Cursos.");
                            System.out.print("    Dígite la opción que desea elegir: ");
                            int opcAE = teclado.nextInt();
                            if (opcAE == 1) {
                                System.out.println("    - - -  Asignar Docente a un curso - - -");
                                System.out.print("    Ingrese el ID del Docente : ");
                                int idAE = teclado.nextInt();
                                boolean verificarDocente= false;
                                int indiceDocente = -1;
                                for(Docente docente: docentes){
                                    if (docente.getId() == idAE) {
                                        verificarDocente = true;
                                        indiceDocente= docentes.indexOf(docente);

                                    }
                                }

                                if(verificarDocente== true){
                                    System.out.print("    Escriba el NRC del curso al que desea asignarle : ");
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
                                        cursos.get(indiceCurso).asignarDocente(docentes.get(indiceDocente));
                                        System.out.println("    X X X | El docente ha sido asignado exitosamente  | X X X ");
                                    }else{
                                        System.out.println("    * * * * | El curso no ha sido encontrado, dígite un NRC válido | * * * *");
                                    }

                                }else{
                                    System.out.println("    * * * * | El docente no ha sido encontrado, dígite un ID válido | * * * *");
                                }





                            } else if (opcAE == 2) {
                                System.out.println("    - - - Eliminar Docente de un Curso - - -");
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
                                if (verificarCurso == true) {
                                    cursos.get(indiceCurso).eliminarDocente();

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

                    }else if (opcGC == 6) {
                        estadoC2 = false;

                    }  else {
                        System.out.println("    * * * * *| Dígite una opción válida |* * * * *");
                    }


                } while (estadoC2);

            }
            case 4 -> {

                System.out.println("    Ingrese el Id del estudiante: ");
                int id  = teclado.nextInt();
                boolean verificarEstudiante = false;

                for(Estudiante alumno: estudiantes){
                    if (alumno.getId() == id) {
                        verificarEstudiante = true;
                        System.out.println("    Nombre: "+alumno.getNombre());
                        System.out.println("    ID: "+alumno.getId());
                        System.out.println("    Curso: ");
                        alumno.getCurso(cursos);
                        System.out.println("    Programa: "+alumno.getCarrera());
                    }
                }
                if(verificarEstudiante==false){
                    System.out.println("    * * * * | El estudiante no se encuentra | * * * * ");
                }

            }

            case 5 ->{

                boolean estadoGestion=true;

                System.out.println("    + + + GESTIÓN DE NOTAS + + +");

                System.out.print("    Ingrese el NRC del curso al que va gestionar notas :");
                nrcG = teclado.nextInt();
                boolean verificarCurso = false;
                int indiceCurso=-1;
                    for(Cursos curso: cursos){
                        if (curso.getNrc() == nrcG) {
                            verificarCurso = true;
                            indiceCurso= cursos.indexOf(curso);
                        }
                    }
                    if (verificarCurso == true) {
                        do {
                            System.out.println("\n    - - - Administrar notas del curso- - -");
                            System.out.println("    1) Crear Actividad");
                            System.out.println("    2) Registrar notas");
                            System.out.println("    3) Ver notas .");
                            System.out.println("    4) Volver al menú.");
                            System.out.print("    Digite una opcion : ");
                            int select = teclado.nextInt();
                            switch (select) {
                                case 1 -> {
                                    teclado.nextLine();
                                    System.out.println("    - - - Crear actividad- - -");
                                    System.out.print("    Ingrese el nombre de la actividad :");
                                    String actividad = teclado.nextLine();

                                    System.out.print("\n    Elija el criterio de evaluacion : " +
                                            "\n      1) Talleres / Tareas ->  " + cursos.get(indiceCurso).getPorcentajeTrabajos() + "%" +
                                            "\n      2) Quizzes -> " + cursos.get(indiceCurso).getPorcentajeQuizzes() + "%" +
                                            "\n      3) Parcial -> " + cursos.get(indiceCurso).getPorcentajeParcial() + "%");
                                    System.out.print("\n   Digite una opcion : ");
                                    int criterio = teclado.nextInt();
                                    cursos.get(indiceCurso).agregarActividad(actividad, criterio);
                                    System.out.println("    X X X | La actividad ha sido creada exitosamente  | X X X ");
                                    for (Actividad a : cursos.get(indiceCurso).getActividades()) {
                                        a.setCriterio(criterio);
                                    }

                                }

                                case 2 -> {
                                    teclado.nextLine();
                                    System.out.print("\n    - - - Registrar notas - - -");
                                    System.out.print("\n    Elija la actividad a calificar: ");
                                    int i = 1;
                                    for (Actividad act : cursos.get(indiceCurso).getActividades()) {
                                        System.out.print("\n        "+i + ")" + act.getNombreActividad());
                                        i++;
                                    }
                                    System.out.print("\n    Ingrese una opcion: ");
                                    int indiceActividad = teclado.nextInt();
                                    indiceActividad=indiceActividad-1;

                                    System.out.print("\n    Ingrese el ID del estudiante a calificar : ");
                                    int id = teclado.nextInt();
                                    boolean verificarEstudiante = false;
                                    int indiceEstudiante = -1;
                                    for (Estudiante alumno : cursos.get(indiceCurso).getEstudiantes()) {
                                        if (alumno.getId() == id) {
                                            verificarEstudiante = true;
                                            indiceEstudiante = cursos.get(indiceCurso).getEstudiantes().indexOf(alumno);
                                        }
                                    }
                                    if (verificarEstudiante == false) {
                                        System.out.println("    * * * * | El estudiante no se encuentra | * * * * ");
                                    } else {
                                        System.out.print("    Ingrese la calificacion entre el 0 y el 5: ");
                                        double nota = teclado.nextDouble();
                                        if (nota >= 0 && nota <= 5) {
                                            cursos.get(indiceCurso).registrarNotaEstudiante(indiceEstudiante, indiceActividad, nota);
                                            System.out.println("    X X X | Se ha registrado la nota exitosamente  | X X X ");
                                        } else {
                                            System.out.println("    * * * * | Ingrese un valor valido  | * * * * ");
                                        }
                                    }
                                }
                                case 3 ->{
                                        int anchoCol = 25;

                                        System.out.printf("%-" + 15 + "s", "NOMBRE");
                                        System.out.printf("%-" + 10 + "s", "ID");
                                        for (Actividad e : cursos.get(indiceCurso).getActividades()) {
                                            System.out.printf("%-" + anchoCol + "s", e.getNombreActividad());
                                        }
                                        System.out.printf("%-" + 15 + "s", "Definitiva");
                                        System.out.println();

                                        for (Estudiante estudiante : cursos.get(indiceCurso).getEstudiantes()) {
                                            System.out.printf("%-" + 15 + "s", estudiante.getNombre());
                                            System.out.printf("%-" + 10 + "s", estudiante.getId());
                                            int i = 0;
                                            for (Actividad e : cursos.get(indiceCurso).getActividades()) {
                                                System.out.printf("%-" + anchoCol + "s", estudiante.getActividades().get(i).getNota());
                                                i++;
                                            }
                                            System.out.printf("%-" + anchoCol + "s", estudiante.getDefinitiva());
                                            System.out.println();
                                        }
                                }
                                case 4->{
                                    estadoGestion=false;
                                }
                                default ->  System.out.println("    * * * * | Ingrese un valor valido  | * * * * ");
                            }
                        }while (estadoGestion);
                    }else{
                        System.out.println("    * * * * | El curso no se encuentra | * * * * ");
                    }



            }

            case 6 -> estado=false;

            default -> System.out.println("    * * * * *| Dígite una opción valida |* * * * *");

        }
    }while(estado);
    }
}