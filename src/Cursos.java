import java.util.ArrayList;
import java.util.List;

public class Cursos {
    private int nrc;
    private String nombreCurso;
    List<Estudiante> estudiantes = new ArrayList<>();



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

        estudiantes.add(estudiante);
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
            System.out.println("No hay estudiantes");
        }else {
            for(int i=0; i<estudiantes.size();i++){
                System.out.println("\n"
                        +(i+1)+") "+ estudiantes.get(i).getId()+" "+estudiantes.get(i).getNombre());
            }
        }
    }
    @Override
    public String toString() {
        return "\nNombre del Curso: " + nombreCurso +
                "\nNRC: " + nrc +
                "\nEstudiantes: " ;
    }
}
