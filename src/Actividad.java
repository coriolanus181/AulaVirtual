import java.util.ArrayList;
import java.util.List;

public class Actividad  {
    private String nombreActividad;
    private double porcentaje;
    private double  criterio;

    public Actividad(String nombreActividad, double porcentaje) {
        this.nombreActividad = nombreActividad;

        this.porcentaje = porcentaje;

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



    public double getCriterio() {
        return criterio;
    }

    public void setCriterio(double criterio) {
        this.criterio = criterio;
    }

    public void setporcentaje(int porcentaje, int criterio){
        if(criterio == 1){
            this.porcentaje= (porcentaje*20)/100;
        } else if( criterio == 2){
            this.porcentaje =(porcentaje*30)/100;
        } else if ( criterio == 3){
            this.porcentaje  =(porcentaje*50)/100;
        }
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "criterio=" + criterio +
                ", nombreActividad='" + nombreActividad + '\'' +
                ", porcentaje=" + porcentaje +
                '}';
    }
}
