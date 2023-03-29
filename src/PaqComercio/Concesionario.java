package PaqComercio;

import java.util.Arrays;

public class Concesionario extends Comercio implements Cloneable{
    public VehiculoVenta[] VehiculosVenta;
    public VehiculoParaReparar[] VehiculosaReparar;

    public Concesionario(){
        super();
        Arrays.fill(VehiculosaReparar, null);
        Arrays.fill(VehiculosVenta, null);
    }

    public void añadirReparar(){
        VehiculoParaReparar Coche = new VehiculoParaReparar();
        for(int i=0;i<this.VehiculosaReparar.length;i++){
            if(Coche.getPrioridad()==1 ){
               if(VehiculosaReparar[i].getPrioridad()>=2 || VehiculosaReparar[i] == null){
                    VehiculosaReparar[i + 1] = VehiculosaReparar[i];
                    VehiculosaReparar[i] = Coche;
                }
            }
            else if(Coche.getPrioridad()==2){
                if(VehiculosaReparar[i]==null || VehiculosaReparar[i].getPrioridad()>2) {
                    VehiculosaReparar[i + 1] = VehiculosaReparar[i];
                    VehiculosaReparar[i] = Coche;
                }
            }
            else if(Coche.getPrioridad()==3)
                if( VehiculosaReparar[i]==null){
                    VehiculosaReparar[i]= Coche;
            }
        }
    }


    public void repararVehiculo(int n){
        VehiculosaReparar[n].setReparado(true);
    }

    public  Vehiculo recogerVehiculo(String matricula){
        for(int i=0;i<VehiculosaReparar.length;i++){
            if(VehiculosaReparar[i].getMatricula().equals(matricula) && VehiculosaReparar[i].getReparado().equals(true)){
                VehiculosaReparar[i]=null;
            }
        }
        return null;
    }
    public void añadirVenta(VehiculoVenta v){
        for(int i=0;i<VehiculosVenta.length;i++){
            if(VehiculosVenta[i].Equals(null)){
                VehiculosVenta[i] = v;
            }
        }
    }
    public void Vender(int pos){
       VehiculosVenta[pos]= null;
    }


    @Override
    public Concesionario clone() throws CloneNotSupportedException {
        Concesionario clone = (Concesionario) super.clone();
        for (int i = 0; i < this.VehiculosaReparar.length ;i++){
            clone.VehiculosaReparar[i] = this.VehiculosaReparar[i];
        }
        for(int j=0;j<VehiculosVenta.length;j++){
            clone.VehiculosVenta[j] = this.VehiculosVenta[j];
        }

        return clone;
    }
}
