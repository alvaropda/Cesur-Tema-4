package CasoPractico1;

public class Humano extends SerVivo{
    private String nombre;

    public Humano (String nombre, byte edad){
        super(edad);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public SerVivo mayor(SerVivo otro) {
        return getEdad() > otro.getEdad() ? this : otro;
    }
}
