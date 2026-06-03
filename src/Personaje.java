public abstract class Personaje {

    protected String nombre;
    protected String raza;
    protected int fuerza;
    protected double vitalidad;

    public Personaje(String nombre, String raza, int fuerza, double vitalidad) {
        this.nombre   = nombre;
        this.raza     = raza;
        this.fuerza   = fuerza;
        this.vitalidad = vitalidad;
    }

    public void sanacion() {
        vitalidad += 4;
    }

    public void mostrarPersonaje() {
        System.out.println("Se ha creado un personaje con los siguientes valores: ");
        System.out.println("Nombre: "    + nombre);
        System.out.println("Raza: "      + raza);
        System.out.println("Fuerza: "    + fuerza);
        System.out.println("Vitalidad: " + vitalidad);
        System.out.println("--------------------------------------------");
    }

    public void mostrarVitalidad() {
        System.out.println("Vitalidad del personaje atacado: " + vitalidad);
    }

    public void verificarOponentes(Personaje oponente) {
        if (this.vitalidad <= 0) {
            System.out.println(this.nombre   + " ha muerto");
            System.out.println(oponente.nombre + " es el vencedor");
        } else if (oponente.vitalidad <= 0) {
            System.out.println(oponente.nombre + " ha muerto");
            System.out.println(this.nombre   + " es el vencedor");
        } else {
            System.out.println("la lucha sigue");
        }
    }
}
