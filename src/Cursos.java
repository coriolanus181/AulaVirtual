import java.util.ArrayList;
import java.util.List;

public class Cursos {
    private int nrc;
    private String nombreCurso;
    List<Estudiante> estudiantes = new ArrayList<>();
    private Docente profesor=null;


    public Cursos(String nombreCurso, int nrc) {
        this.nombreCurso = nombreCurso;
        this.nrc = nrc;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getNrc() {
        return nrc;
    }

    public void setNrc(int nrc) {
        this.nrc = nrc;
    }

    public void agregarEstudiante(Estudiante estudiante){
        boolean verificarPresencia=false;
        for(Estudiante alumno : estudiantes){
            if(estudiante.equals(alumno)){
                verificarPresencia=true;
            }
        }
        if(verificarPresencia==true){
            System.out.println(" * * * * *| El estudiante ya esta inscrito a este curso | * * * * * ");
        }else{
            estudiantes.add(estudiante);
            System.out.println("    X X X | El estudiante ha sido agregado exitosamente | X X X ");
        }

    }

    public void eliminarEstudiante(Estudiante estudiante){

        estudiantes.remove(estudiante);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void mostrarEstudiantes(){

        if(estudiantes.size()==0){
            System.out.print("No hay estudiantes");
        }else {
            System.out.println("Estudiantes :");
            for(int i=0; i<estudiantes.size();i++){
                System.out.print("\n    "
                        +(i+1)+") "+ estudiantes.get(i).getId()+" - "+estudiantes.get(i).getNombre());
            }
        }
        System.out.print("\n    - - - - - - - - - - - - - - - - - -");
    }
    @Override
    public String toString() {
        return "\n    Nombre del Curso: " + nombreCurso +
                "\n    NRC: " + nrc +
                "\n    Docente: " ;
    }
    public void mostrarDocente(){
        if(profesor!=null) {
            System.out.println(profesor.getNombre());
        }else{
            System.out.println("No hay profesor ");
        }
    }
    public void asignarDocente(Docente docente) {
        if (profesor == null) {
            profesor = docente;
            System.out.println("    X X X | El docente ha sido asignado exitosamente  | X X X ");
        } else {
            System.out.println("    * * * * *| El curso ya tiene un docente asignado  |* * * * *");
        }
    }
    public void eliminarDocente(){
        if(profesor==null){
            System.out.println("    * * * * *| El curso no tiene un docente asignado  |* * * * *");
        }else{
            profesor=null;
            System.out.println("    X X X | El docente ha sido eliminado del curso  | X X X ");
        }
    }
}
