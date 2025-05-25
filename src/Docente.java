import java.util.ArrayList;
import java.util.List;

public class Docente {
    private String nombre;
    private int id;
    private List<Cursos> cursos = new ArrayList<>();
    private String jornada;

    public Docente(int id, String nombre, String jornada) {
        this.id = id;
        this.nombre = nombre;
        this.jornada = jornada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public String toString() {
        return "    - - - - - - - - - - - - - - - \n    Docente: " +
                "\n    Nombre: " + nombre +
                "\n    ID: " + id +
                "\n    Jornada: " + jornada;
    }

}
