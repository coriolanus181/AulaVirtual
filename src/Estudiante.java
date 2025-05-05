import java.util.List;

public class Estudiante {
    private String nombre;
    private String id;
    private String carrera;

    public Estudiante(String nombre, String id, String carrera) {
        this.nombre = nombre;
        this.id = id;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void agregarActividad(String Titulo  , String Descripcion ){

    }

    public void verNotas(){

    }
}
