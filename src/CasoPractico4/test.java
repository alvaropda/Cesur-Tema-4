package CasoPractico4;

public class test {
    public static void main(String[] args) {
        Truck t1 = new Truck(120, 14999.6, "blue", 800);
        Ford f1 = new Ford(140, 20000.22, "red", 2010, 1000);
        Sedan s1 = new Sedan(100, 10000, "white", 4);

        System.out.println(t1.GetSalePrice());
        System.out.println(f1.GetSalePrice());
        System.out.println(s1.GetSalePrice());
    }
}
