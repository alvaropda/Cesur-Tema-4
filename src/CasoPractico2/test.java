package CasoPractico2;

public class test {
    public static void main(String[] args) {
        Persona p1 = new Persona("Álvaro", "Peinado", "684398101");
        Cuenta c1 = new Cuenta("ES99",1000, p1);
        Persona p2 = new Persona("Paco", "Pollos", "684398102");
        Cuenta c2 = new Cuenta("ES98",1000, p2);

        System.out.println(c1);
        c1.transaccion();

        System.out.println(c2);
        c2.transaccion();
    }
}
