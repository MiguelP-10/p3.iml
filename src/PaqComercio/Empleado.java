package PaqComercio;

public class Empleado implements  Cloneable {
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

    @Override
    public String toString(){
        return "El empleado "+ NombreE + " con direccion "+ DireccionE + ", telefono "+ telefonoE +" y email "+ emailE +
                " empezo: "+ FechaInicio+" tiene un cargo" + cargo +" con un salario de "+ salario;
    }


    public boolean equals(Empleado empl) {
        return super.equals(empl);
    }

    public Empleado clone() throws CloneNotSupportedException{
        return (Empleado) super.clone();
    }
}

