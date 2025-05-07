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
    int opc , opcGE, idE;
    String nombreE,carreraE;
    boolean estado= true;
    List<Estudiante> estudiantes = new ArrayList<>();
    List<Cursos> cursos= new ArrayList<>();
    System.out.println("    Bienvenido(a) a Virtual WinKan\n");

    do {
        System.out.print("""
                            * MENÚ *
                    1) Gestión de Estudiantes.
                    2) Gestión de Cursos.
                    3) Buscar Estudiantes.
                    4) Gestión de Notas.
                    Dígite la opción que desea elegir: 
                """);
        opc = teclado.nextInt();

        switch (opc) {
            case 1 -> {
                System.out.println("    1) Registrar Estudiante");
                System.out.println("    2) Eliminar Estudiante");
                opcGE = teclado.nextInt();
                if (opcGE == 1) {
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
                    for (Estudiante c : estudiantes) {
                        System.out.println(c);

                    }
                }

            }

            case 2 -> {
                for (Estudiante c : estudiantes) {
                    System.out.println(c);
                }

            }
            case 3 -> {
                System.out.println("Ingrese el estudiante que dese eliminar");
                int ops = teclado.nextInt();
                estudiantes.remove(ops);
            }

            case 7 -> estado=false;

            default -> System.out.println("Elija una opción valida");
        }
    }while(estado);
    }
}