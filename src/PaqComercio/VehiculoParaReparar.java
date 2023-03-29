package PaqComercio;

public class VehiculoParaReparar extends Vehiculo{
    private String averia;
    private Boolean reparado;
    private int prioridad;

    public VehiculoParaReparar(){
        super();
        this.averia = " ";
        this.reparado = false;
        this.prioridad = 0;

    }

    public void setAveria(String averia) {
        this.averia = averia;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setReparado(Boolean reparado) {
        this.reparado = reparado;
    }

    public Boolean getReparado() {
        return reparado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getAveria() {
        return averia;
    }

    public VehiculoParaReparar(VehiculoParaReparar veh){
        super.setMarca( veh.getMarca());
        super.setMatricula(veh.getMatricula());
        super.setModelo(veh.getModelo());
        this.averia = veh.getAveria();
        this.reparado = veh.getReparado();
        this.prioridad = veh.getPrioridad();

    }

}
