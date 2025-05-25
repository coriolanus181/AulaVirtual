import java.util.ArrayList;
import java.util.List;

public class Actividad  {
    private String nombreActividad;
    private Double porcentaje;
    private String  criterio;

    public Actividad(String nombreActividad, Double porcentaje, String criterio) {
        this.nombreActividad = nombreActividad;

        this.porcentaje = porcentaje;
        this.criterio = criterio;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }


    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }
}
