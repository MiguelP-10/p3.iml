package PaqComercio;

public class VehiculoVenta extends Vehiculo{
    private double precio;
    private int descuento;

    public VehiculoVenta(){
        super();
        this.precio=0;
        this.descuento=0;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public VehiculoVenta(VehiculoVenta v){
        super.setMarca(v.getMarca());
        super.setMatricula(v.getMatricula());
        super.setModelo(v.getModelo());
        this.descuento = v.getDescuento();
        this.precio = v.getPrecio();
    }
}
