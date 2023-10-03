package vehiculos;

import java.util.ArrayList;

public class Pais {
    public static ArrayList<Pais> paises = new ArrayList<>();
    public String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor() {

        Pais max = null;
        int c_max = 0;

        for (var pais : paises) {
            int c = 0;
            for (var paistemp : paises) {
                if (pais == paistemp) {
                    c++;
                }
            }
            if (c_max < c) {
                c_max = c;
                max = pais;
            }
        }

        return max;
    }

}