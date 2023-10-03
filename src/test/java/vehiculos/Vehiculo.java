package vehiculos;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected int peso;
    protected String traccion;
    public Fabricante fabricante;
    protected static int CantidadVehiculos = 0;

    public Vehiculo() {
    }

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
            String traccion, Fabricante fabricante) {
        CantidadVehiculos++;
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Fabricante.fabricas.add(this.fabricante);

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return this.puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTraccion() {
        return this.traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public static void setCantidadVehiculos(int CantidadVehiculos) {
        Vehiculo.CantidadVehiculos = CantidadVehiculos;
    }

    public static int getCantidadVehiculos() {
        return Vehiculo.CantidadVehiculos;
    }

    public static String vehiculosPorTipo() {
        return "Automoviles: " + Automovil.cantidadAutomoviles() + "\nCamionetas: " + Camioneta.cantidadCamionetas()
                + "\nCamiones: " + Camion.cantidadCamiones();
    }
}