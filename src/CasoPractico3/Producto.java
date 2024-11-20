package CasoPractico3;

public class Producto {
    private String FechaCaducidad;
    private String NumLote;

    public Producto(String FechaCaducidad, String Numlote) {
        this.FechaCaducidad = FechaCaducidad;
        this.NumLote = Numlote;
    }

    public String getFechaCaducidad() {
        return FechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        FechaCaducidad = fechaCaducidad;
    }

    public String getNumLote() {
        return NumLote;
    }

    public void setNumLote(String numLote) {
        NumLote = numLote;
    }

    @Override
    public String toString() {
        return "FechaCaducidad = '" + FechaCaducidad + '\'' +
                ", NumLote = '" + NumLote + '\'';
    }
}
