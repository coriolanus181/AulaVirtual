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
    List<Estudiante> estudiantes = new ArrayList<>();
    List<Cursos> cursos= new ArrayList<>();

    cursos.add(new Cursos("Ingles",111));
    cursos.add(new Cursos("Español",123));
    estudiantes.add(new Estudiante("Winder",968,"Sistemas"));
    estudiantes.add(new Estudiante("Joan",971,"Sistemas"));

    System.out.println("    Bienvenido(a) a Virtual WinKan\n");

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
                        System.out.println("    Ingrese el estudiante que desea eliminar: ");
                        int ops = teclado.nextInt();
                        estudiantes.remove(ops);

                    } else if (opcGE == 3) {
                        for (Estudiante c : estudiantes) {
                            System.out.println(c);

                        }
                    }else if (opcGE== 4) {
                        estadoC1=false;
                    }else{
                        System.out.println("    * * * * *| Dígite una opción válida |* * * * *");

                    }
                }while(estadoC1);
            }

            case 2 -> {
                do {
                    System.out.println("    + + + GESTIÓN DE CURSOS + + +");
                    System.out.println("    1) Agregar cursos.");
                    System.out.println("    2) Mostrar Cursos.");
                    System.out.println("    3) Volver al Menú.");
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
                        System.out.println("Cursos");
                        for (Cursos c : cursos) {
                            System.out.println(c);
                        }

                        System.out.println("    1) Agregar estudiante al curso");
                        System.out.println("    2) Eliminar estudiante del curso");
                        int opcAE = teclado.nextInt();
                        if (opcAE == 1) {
                            System.out.println("    Ingrese el Id del estudiante: ");
                            int idAE = teclado.nextInt();
                            System.out.println("    Escriba el nrc del curso que desea agregarlo: ");
                            int cursoAE = teclado.nextInt();
                            for (Estudiante e : estudiantes) {
                                if (idAE == e.getId()) {
                                    for (Cursos c : cursos) {
                                        if (cursoAE == c.getNrc()) {
                                            c.agregarEstudiante(e);
                                            break;
                                        }
                                    }

                                }
                            }
                        } else if (opcAE == 2) {
                            System.out.println("----------- Eliminar Cursos -----------");

                        }else if((opcAE == 3)){
                            estadoC2=false;
                        }

                        else {
                            System.out.println("    * * * * *| Dígite una opción válida |* * * * *");
                        }
                    }


                }while(estadoC2);

            }
            case 3 -> {


            }

            case 4 ->{
              /*  System.out.println("Registrar nota");
                System.out.println("ingrese el nombre de la actividad");
                String actividad = teclado.nextLine();*/

            }

            case 5 -> estado=false;

            default -> System.out.println("    * * * * *| Dígite una opción valida |* * * * *");

        }
    }while(estado);
    }
}