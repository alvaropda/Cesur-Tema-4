package CasoPractico2;

import java.util.Scanner;

public class Cuenta {

    Scanner sc = new Scanner(System.in);
    private String numCuenta;
    private int saldo;
    private Persona propietario;


    public Cuenta(String numCuenta, int saldo, Persona propietario){
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = String.valueOf(numCuenta);
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                ", numCuenta='" + numCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario +
                '}';
    }

    public void transaccion(){
        int cantidad;
        System.out.println("----\n¿que quiere?\n 1.Reintegro\n 2.ingreso\n----");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1 ->{
                System.out.println("----\nCuanto quieres retirar\n----");
                do {
                    cantidad = sc.nextInt();
                }while (cantidad > saldo);
                System.out.println("----\nAhora tienes en la cuenta: "+(saldo-cantidad)+"\n----");
            }
            case 2 ->{
                System.out.println("----\nCuanto quieres ingresar\n----");
                cantidad = sc.nextInt();
                System.out.println("----\nAhora tienes en la cuenta: "+(saldo+cantidad)+"\n----");
            }
        }
    }
}
