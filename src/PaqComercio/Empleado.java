package PaqComercio;

public class Empleado {
    public String NombreE;
    public String DireccionE;
    public int telefonoE;
    public String emailE;
    public String FechaInicio;
    public double salario;
    public String cargo;

    public void setNombreE(String nombreE) {NombreE = nombreE;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public void setDireccionE(String direccionE) {DireccionE = direccionE;}
    public void setEmailE(String emailE) {this.emailE = emailE;}
    public void setFechaInicio(String fechaInicio) {FechaInicio = fechaInicio;}
    public void setSalario(double salario) {this.salario = salario;}
    public void setTelefonoE(int telefonoE) {this.telefonoE = telefonoE;}

    public double getSalario() {return salario;}
    public int getTelefonoE() {return telefonoE;}
    public String getCargo() {return cargo;}
    public String getDireccionE() {return DireccionE;}
    public String getEmailE() {return emailE;}
    public String getFechaInicio() {return FechaInicio;}
    public String getNombreE() {return NombreE;}
}
