package PaqComercio;

public class Concesionario extends Comercio{
    public VehiculoVenta[] VehiculosVenta;
    public VehiculoParaReparar[] VehiculosaReparar;

    public void añadirReparar(){
        VehiculoParaReparar Coche = new VehiculoParaReparar();
        for(int i=0;i<this.VehiculosaReparar.length;i++){
            if(Coche.getPrioridad()==1 && VehiculosaReparar[i]==null){
                VehiculosaReparar[i]= Coche;
            }
            else VehiculosaReparar[VehiculosaReparar.length-1]=Coche;
        }
    }

    public void repararVehiculo(int n){
        VehiculosaReparar[n].setReparado(true);
    }

    public Vehiculo recogerVehiculo(String matricula){
        for(int i=0;i<VehiculosaReparar.length;i++){
            if(VehiculosaReparar[i].getMatricula()==matricula){
                return VehiculosaReparar[i];
                VehiculosaReparar[i]=null;


            }
        }
    return null;
    }

}
