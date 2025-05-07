import java.util.ArrayList;
import java.util.List;

public class Cursos {
    private int nrc;
    private String nombreCurso;
    List<Estudiante> estudiantes = new ArrayList<>();
    List<Actividad> actividades= new ArrayList<>();

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
}
