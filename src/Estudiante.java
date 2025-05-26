import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private int id;
    private String carrera;
    private List<Actividad> actividades = new ArrayList<>();

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

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


    public void verNotas(){}

    public void getCurso( List<Cursos> curso){
        boolean verficar= false;
        for(Cursos nrc: curso ){
            for(Estudiante alumno : nrc.getEstudiantes()){
                if(id== alumno.getId()){
                    verficar = true;
                    System.out.println("        * "+nrc.getNombreCurso());
                }
            }

        }
        if( verficar== false){
            System.out.println("    No hay cursos");
        }
    }

    @Override
    public String toString() {
        return "    - - - - - - - - - - - - - - - \n        Estudiante: " +
                "\n    Nombre: " + nombre +
                "\n    ID: " + id +
                "\n    Carrera: " + carrera;
    }

    public void agregarActividad(String nombre ,int  criterio,double porcentajeTrabajos,double porcentajeQuizzes,double porcentajeParcial){
        actividades.add(new Actividad(nombre,criterio,porcentajeTrabajos,porcentajeQuizzes,porcentajeParcial));
        System.out.println();
    }
    public double getDefinitiva(){
        double definitiva = 0;
        double notat=0;
        double notaq=0;
        double notap=0;
        double pt=0,pq = 0,pp=0;

        for (Actividad actividad:actividades){

            if(actividad.getCriterio() == 1){
                notat+=actividad.getNota();
                pt=actividad.getPt();

            } else if( actividad.getCriterio() == 2){
                notaq+=actividad.getNota();
                pq=actividad.getPq();

            } else if ( actividad.getCriterio() == 3){
                notap+=actividad.getNota();
                pp=actividad.getPp();

            }
        }
        definitiva=(notat*(pt/100))+(notaq*(pq/100))+(notap*(pp/100));
            return definitiva;
        }

    }

