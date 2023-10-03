package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {
    private static ArrayList<Camion> list = new ArrayList<>();
    private int ejes;

    public Camion() {
    }

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
    }

    public int getEjes() {
        return this.ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int cantidadCamiones() {
        return list.size();
    }
}