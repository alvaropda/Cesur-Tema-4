package CasoPractico3;

public class ProductoFresco extends Producto{
    private String Pais;
    private String FechaEnvasado;
    public ProductoFresco(String FechaCaducidad, String Numlote, String Pais, String FechaEnvasado) {
        super(FechaCaducidad, Numlote);
        this.FechaEnvasado = FechaEnvasado;
        this.Pais = Pais;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getFechaEnvasado() {
        return FechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        FechaEnvasado = fechaEnvasado;
    }

    @Override
    public String toString() {
        return super.toString()+" Pais = '" + Pais + '\'' +
                ", FechaEnvasado = '" + FechaEnvasado + '\'';
    }
}
