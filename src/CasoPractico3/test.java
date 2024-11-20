package CasoPractico3;

public class test {
    public static void main(String[] args) {
        ProductoFresco p1 = new ProductoFresco("julio", "001", "España", "Enero");
        ProductoRefrigerado p2 = new ProductoRefrigerado("junio", "002", "C10");
        ProductoCongelado p3 = new ProductoCongelado("Diciembre", "003", -10);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
