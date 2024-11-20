package CasoPractico1;

public class SerVivo {
    private byte edad;
    private int mayor;

    public SerVivo(byte edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public boolean equals(SerVivo otro){
        return this.edad == otro.edad;
    }

    public String toString() {
        return "edad ="+edad;
    }

    public SerVivo mayor(SerVivo otro) {
        return this.edad > otro.edad ? this : otro;
    }
}