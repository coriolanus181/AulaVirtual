import java.util.ArrayList;
import java.util.List;

public class Cursos {
    private int nrc;
    private String nombreCurso;
    private List<Estudiante> estudiantes = new ArrayList<>();
    private Docente profesor=null;
    private double porcentajeTrabajos=0;
    private double porcentajeQuizzes=0;
    private double porcentajeParcial=0;
    private List<Actividad> actividades = new ArrayList<>();

    public Cursos(int nrc, String nombreCurso, double porcentajeTrabajos, double porcentajeQuizzes, double porcentajeParcial) {
        this.nrc = nrc;
        this.nombreCurso = nombreCurso;
        this.porcentajeTrabajos = porcentajeTrabajos;
        this.porcentajeQuizzes = porcentajeQuizzes;
        this.porcentajeParcial = porcentajeParcial;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public double getPorcentajeTrabajos() {
        return porcentajeTrabajos;
    }

    public void setPorcentajeTrabajos(double porcentajeTrabajos) {
        this.porcentajeTrabajos = porcentajeTrabajos;
    }

    public double getPorcentajeQuizzes() {
        return porcentajeQuizzes;
    }

    public void setPorcentajeQuizzes(double porcentajeQuizzes) {
        this.porcentajeQuizzes = porcentajeQuizzes;
    }

    public double getPorcentajeParcial() {
        return porcentajeParcial;
    }

    public void setPorcentajeParcial(double porcentajeParcial) {
        this.porcentajeParcial = porcentajeParcial;
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
    public void agregarActividad(String nombre ,int  criterio){
        actividades.add(new Actividad(nombre,criterio,porcentajeTrabajos,porcentajeQuizzes,porcentajeParcial));
        for (Estudiante e : estudiantes){
            e.agregarActividad(nombre,criterio,porcentajeTrabajos,porcentajeQuizzes,porcentajeParcial);
        }
    }
    public void registrarNotaEstudiante(int id ,int actividad,double calificacion){

            estudiantes.get(id).getActividades().get(actividad).setNota(calificacion);

}
}
