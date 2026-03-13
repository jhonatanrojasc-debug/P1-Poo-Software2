public class Cajero {

    public void retirarDinero(Cuenta cuenta, double valor){
        if(valor >= 20000 && valor <= 400000 && valor <= cuenta.consultarSaldo()){
            cuenta.retirar(valor);
            System.out.println("Retiro exitoso");
        }else{
            System.out.println("No se puede realizar el retiro");
        }
    }

    public void consultarSaldo(Cuenta cuenta){
        System.out.println("Saldo disponible: " + cuenta.consultarSaldo());
    }
}

..
public class Principal {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();
        cuenta.saldo = 435000;

        Cajero cajero = new Cajero();

        cajero.consultarSaldo(cuenta);
        cajero.retirarDinero(cuenta, 50000);
        cajero.consultarSaldo(cuenta);
    }
}

