import java.time.LocalDateTime;
import java.util.UUID;

public class Transaccion {

        String id;
        String tipoOperacion;
        LocalDateTime fecha;
        double valor;
        double saldoFinal;

        public Transaccion(String tipoOperacion, double valor, double saldoFinal) {

            this.id = UUID.randomUUID().toString();
            this.tipoOperacion = tipoOperacion;
            this.fecha = LocalDateTime.now();
            this.valor = valor;
            this.saldoFinal = saldoFinal;
        }



    }
