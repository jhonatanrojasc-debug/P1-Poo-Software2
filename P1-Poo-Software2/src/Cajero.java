import java.util.Scanner;

public class Cajero {
    import java.util.Scanner;

    public class Cajero {

        private int clave = 1234;

        public boolean validarClave() {

            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese clave de 4 digitos:");
            int ingreso = sc.nextInt();

            return ingreso == clave;
        }


