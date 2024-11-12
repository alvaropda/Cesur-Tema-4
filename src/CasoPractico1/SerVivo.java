package CasoPractico1;

public class SerVivo {
    private int edad;
    private int mayor;

    public SerVivo(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public boolean equals(SerVivo otro){
        return true;
    }

    public String toString() {
        return "edad ="+edad;
    }

    public SerVivo mayor(SerVivo otro) {
        return this.edad > otro.edad ? this : otro;
    }
}