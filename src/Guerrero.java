public class Guerrero extends Personaje
  {
protected String arma;

 public Personaje(String nombre, String raza, int fuerza, double vitalidad) 
{
super(nombre,raza,fuerza,vitalidad);  
this.arma=arma;
}
public String getArma(){
  retunr arma;
}
public void setArma(String arma){
  this.arma=arma;
} 

@override      
public String atacar(int fuerza, String oponente) {
return "Atacando a " + oponente + " con fuerza " + fuerza;
    }

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



    


  }
