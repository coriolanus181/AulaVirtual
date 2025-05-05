import java.util.ArrayList;
import java.util.List;

public class Actividad  {

    private String nombreActividad;
    private String Descripcion;
    private String nombreEntrega;
    private int idEntrega;
    private String carreraEntrega;
    private List<Estudiante> listaEntrega= new ArrayList<>();

    public Actividad(String nombreActividad, String descripcion, String nombreEntrega, int idEntrega, String carreraEntrega) {
        this.nombreActividad = nombreActividad;
        Descripcion = descripcion;
        this.nombreEntrega = nombreEntrega;
        this.idEntrega = idEntrega;
        this.carreraEntrega = carreraEntrega;
    }


    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public List<Estudiante> getListaEntrega() {
        return listaEntrega;
    }

    public void setListaEntrega(List<Estudiante> listaEntrega) {
        this.listaEntrega = listaEntrega;
    }
}
