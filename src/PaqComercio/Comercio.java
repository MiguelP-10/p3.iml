package PaqComercio;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Comercio implements Cloneable{
    public String nombre;
    public String Direccion;
    public String cif;
    public double[][] VentasDiarias = new double[12][31];
    public int[] stock;
    public Empleado[] Empleados;

    public Comercio(){
        this.nombre= " ";
        this.Direccion=" ";
        this.cif=" ";
        for(int i=0;i<12;i++){
            for(int j=0;j<31;j++){
                VentasDiarias[i][j]= 0.0;
            }
        }
        Arrays.fill((int[]) null, 0);
    }

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCif(String cif) {this.cif = cif;}
    public void setDireccion(String direccion) {Direccion = direccion;}
    public void setEmpleados(Empleado[] empleados) {Empleados = empleados;}
    public void setStock(int[] stock) {this.stock = stock;}
    public void setVentasDiarias(double[][] ventasDiarias) {VentasDiarias = ventasDiarias;}

    public double[][] getVentasDiarias() {return VentasDiarias;}
    public Empleado[] getEmpleados() {return Empleados;}
    public int[] getStock() {return stock;}
    public String getCif() {return cif;}
    public String getDireccion() {return Direccion;}
    public String getNombre() {return nombre;}

    public double TotalVentas(){
        double suma=0;
        for(int i=0;i<12;i++){
            for(int j=0;j<31;j++){
                suma = suma + this.VentasDiarias[i][j];
            }
        }
        return suma;
    }

    public double VentasMes(int n){
        double suma=0;
        for(int i=0;i<31;i++){
            suma = suma + this.VentasDiarias[n][i];
        }
        return suma;
    }

    public int ConMasVentas(){
        int mes = 0;
        double suma =0;
        double mayor = 0;
        for(int i=0;i<12;i++){
            for(int j=0;j<31;j++){
                suma = suma + this.VentasDiarias[i][j];
            }
            if(suma > mayor){
                mayor = suma;
                mes=i;
                suma = 0;
            }
        }
        return mes+1;
    }


    public void actualizarVentas( int mes, int dia,double n){
        this.VentasDiarias[dia][mes]=n;
    }

    public String toStringStock(){
        for(int i=0;i<stock.length;i++){
            return "el stock es " + stock[i];
        }
        return null;
    }
    public String toStringVentas(){
        for(int i=0;i<12;i++){
            for(int j=0;j<31;j++){
                return "Las ventas del dia" + (j+1) + " y del mes"+ (i+1) + " son "+VentasDiarias[i][j];
            }
        }
        return null;
    }

    public Comercio duplicar(Comercio Copia){


        this.setCif((Copia.cif));
        this.setDireccion((Copia.Direccion));
        this.setNombre(((Copia.nombre)));


        if(this.Empleados !=null){
            for(int i =0;i<Copia.Empleados.length;i++){
                this.Empleados[i].setCargo(Copia.Empleados[i].getCargo());
                this.Empleados[i].setDireccionE(Copia.Empleados[i].getDireccionE());
                this.Empleados[i].setTelefonoE(Copia.Empleados[i].getTelefonoE());
                this.Empleados[i].setNombreE(Copia.Empleados[i].getNombreE());
                this.Empleados[i].setSalario(Copia.Empleados[i].getSalario());
                this.Empleados[i].setFechaInicio(Copia.Empleados[i].getFechaInicio());




            }
        }
        if(this.stock !=null){
            for(int i=0;i<Copia.stock.length;i++){
                this.setStock(Copia.getStock());
            }
        }
        if(this.VentasDiarias != null){
            for(int i=0;i<12;i++){
                for(int j=0;j<31;i++){
                    this.setVentasDiarias(Copia.getVentasDiarias());
                }
            }
        }

        return Copia;

    }

    public Comercio clone() throws CloneNotSupportedException{
        return (Comercio) super.clone();
    }

}
