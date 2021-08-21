package model.vo;

public class Consulta1VO_19 {
    
    private Integer idProyecto;
    private String fechaInicio;
    private String construtora;
    private String serial;


    public Consulta1VO_19() {
    }


    public Consulta1VO_19(Integer idProyecto, String fechaInicio, String construtora, String serial) {
        this.idProyecto = idProyecto;
        this.fechaInicio = fechaInicio;
        this.construtora = construtora;
        this.serial = serial;
    }


    public Integer getIdProyecto() {
        return idProyecto;
    }


    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }


    public String getFechaInicio() {
        return fechaInicio;
    }


    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    public String getConstrutora() {
        return construtora;
    }


    public void setConstrutora(String construtora) {
        this.construtora = construtora;
    }


    public String getSerial() {
        return serial;
    }


    public void setSerial(String serial) {
        this.serial = serial;
    }

}
