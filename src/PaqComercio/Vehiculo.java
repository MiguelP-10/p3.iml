package PaqComercio;

public abstract class Vehiculo implements Cloneable{
    private String marca;
    private String modelo;
    private String matricula;

    public Vehiculo(){
        this.marca = " ";
        this.modelo=" ";
        this.matricula=" ";
    }

    public void setMarca(String marca) {this.marca = marca;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public void setModelo(String modelo) {this.modelo = modelo;}


    public String getMarca() {return marca;}
    public String getMatricula() {return matricula;}
    public String getModelo() {return modelo;}

    public void ConsVehiculo(){
        this.marca= " ";
        this.matricula= " ";
        this.modelo= " ";
    }
    public void IntroVehiculo(String marca, String modelo, String matricula ){
        this.marca= marca;
        this.matricula= matricula;
        this.modelo= modelo;
    }

    @Override
    public String toString() {
        return "Coche "+this.marca+" "+modelo+" de matricula: "+this.matricula;
    }

    public Boolean Equals(Vehiculo coche){
        if(!coche.matricula.equals(this.matricula)) return false;
        if(!coche.marca.equals(this.marca)) return false;
        return coche.modelo.equals(this.modelo);

    }
    public Vehiculo Clone(Vehiculo clon){
        this.modelo= clon.modelo;
        this.marca = clon.marca;
        this.matricula= clon.matricula;
        return clon;
    }

    public Vehiculo(Vehiculo clon) {

        this.modelo= clon.modelo;
        this.marca = clon.marca;
        this.matricula= clon.matricula;
    }
}
