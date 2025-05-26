import java.util.ArrayList;
import java.util.List;

public class Actividad  {
    private String nombreActividad;

    private int  criterio;
    private double pt=0;
    private double pq=0;
    private double pp=0;
    private double nota=0 ;

    public Actividad(String nombreActividad , int criterio, double pt, double pq, double pp) {
        this.nombreActividad = nombreActividad;

        this.criterio = criterio;
        this.pt = pt;
        this.pq = pq;
        this.pp = pp;

    }

    public double getPt() {
        return pt;
    }

    public void setPt(double pt) {
        this.pt = pt;
    }

    public double getPq() {
        return pq;
    }

    public void setPq(double pq) {
        this.pq = pq;
    }

    public double getPp() {
        return pp;
    }

    public void setPp(double pp) {
        this.pp = pp;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }


    public double getCriterio() {
        return criterio;
    }

    public void setCriterio(int criterio) {
        this.criterio = criterio;
    }


}
