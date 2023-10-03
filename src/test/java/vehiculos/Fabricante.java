package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    public static ArrayList<Fabricante> fabricas = new ArrayList<>();
    public String nombre;
    public Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        Pais.paises.add(this.pais);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante max = null;
        int c_max = 0;

        for (var fabrica : fabricas) {
            int c = 0;
            for (var fabricatemp : fabricas) {
                if (fabrica == fabricatemp) {
                    c++;
                }
            }
            if (c_max < c) {
                c_max = c;
                max = fabrica;
            }
        }

        return max;
    }
}