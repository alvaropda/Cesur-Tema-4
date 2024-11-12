package CasoPractico1;

public class test {
    public static void main(String[] args) {
        SerVivo x = new SerVivo(3);
        SerVivo y = new SerVivo(5);
        SerVivo mayorSerVivo = x.mayor(y);

        System.out.println("El ser vivo mayor tiene " + mayorSerVivo.getEdad() + " años.");

        x = new Humano("homero", (byte) 39);
        y = new Humano("bart", (byte)9);
        mayorSerVivo = ((Humano)x).mayor((Humano)y);

        System.out.println("El humano mayor es " + ((Humano) mayorSerVivo).getNombre());

        SerVivo menorSerVivo = y.mayor(x);
        System.out.println("El humano menor es " + ((Humano) mayorSerVivo).getNombre());
    }
}
