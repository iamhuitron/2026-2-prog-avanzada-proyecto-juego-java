public abstract class Guerrero extends Personaje {

    protected String arma;

    public Guerrero(String nombre, String raza,
                    int fuerza, double vitalidad) {
        super(nombre, raza, fuerza, vitalidad);
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public void sanacion() {
        vitalidad += 4;
        System.out.println(nombre +
                " ha usado un medicamento y recuperó 4 puntos de vitalidad");
        System.out.println("Vitalidad actual: " + vitalidad);
        System.out.println("--------------------------------------------");
    }

    public abstract void atacar(Personaje oponente);
}
