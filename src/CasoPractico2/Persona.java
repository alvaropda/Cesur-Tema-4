package CasoPractico2;

public class Persona {
    private String nombre;
    private String apellido;
    private String tlfn;

    public Persona(String nombre, String apellido, String tlfn) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tlfn = tlfn;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTlfn() {
        return tlfn;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTlfn(String tlfn) {
    }
    public void datos(){
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido+"\nTlfn: "+tlfn);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tlfn='" + tlfn + '\'' +
                '}';
    }
}
