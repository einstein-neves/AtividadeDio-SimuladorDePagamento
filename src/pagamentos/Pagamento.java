package src.pagamentos;
import java.util.Scanner;


public interface Pagamento {
    void processar(double valor , Scanner scanner);
}
