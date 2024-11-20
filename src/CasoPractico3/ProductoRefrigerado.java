package CasoPractico3;

public class ProductoRefrigerado  extends Producto{
    private String CodigoOrganismo;
    public ProductoRefrigerado(String FechaCaducidad, String Numlote, String CodigoOrganismo) {
        super(FechaCaducidad, Numlote);
        this.CodigoOrganismo = CodigoOrganismo;
    }

    @Override
    public String toString() {
        return super.toString() +"CodOrganismo = '" +CodigoOrganismo + '\'';
    }
}
