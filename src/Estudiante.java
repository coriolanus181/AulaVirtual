import java.util.List;

public class Estudiante extends Actividad{
    private String nombre;
    private int id;
    private String carrera;

    public Estudiante(String nombre, int id, String carrera) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void agregarActividad(String titulo  , String descripcion ){
        Actividad actividad = new Actividad(titulo,descripcion,nombre,id,carrera);
    }

    public void verNotas(){

    }
}
