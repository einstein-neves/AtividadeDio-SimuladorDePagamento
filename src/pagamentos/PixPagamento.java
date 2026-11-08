package src.pagamentos;
import java.util.Scanner;

public class PixPagamento  implements Pagamento {

@Override
public void processar(double valor , Scanner scanner){
    System.out.println("\n =====Pagamento Via Pix====");
    System.out.printf("Valor Da compra :R$ %.2f%n", valor);
    System.out.println("\nGerando condigo Pix");
    System.out.println("Aguarde a Confirmação ! ");
    System.out.println("\n =====Pagamento Feito com Sucesso ====");
} 

}
