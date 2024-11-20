package CasoPractico3;

public class ProductoCongelado extends Producto{
    private int temp;

    public ProductoCongelado(String FechaCaducidad, String Numlote, int temp) {
        super(FechaCaducidad, Numlote);
        this.temp = temp;
    }

    @Override
    public String toString() {
        return super.toString()+"temp = '" + temp;
    }
}
