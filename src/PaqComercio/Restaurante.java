package PaqComercio;

import java.util.Arrays;

public class Restaurante extends Comercio{
    public String[] MenuDiario = new String[7];
    public int numMesas;
    public int capacidad;

    public Restaurante(){
        super();
        Arrays.fill(MenuDiario, null);
        this.numMesas = 0;
        this.capacidad = 0;
    }

    public void setMenuDiario(String[] menuDiario) {
        MenuDiario = menuDiario;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public String[] getMenuDiario() {
        return MenuDiario;
    }

    public void FijarMenu(String menu, int dia){
        this.MenuDiario[dia-1] = menu;
    }
    public String MistrarMenu(int dia){
        return MenuDiario[dia-1];
    }

}
