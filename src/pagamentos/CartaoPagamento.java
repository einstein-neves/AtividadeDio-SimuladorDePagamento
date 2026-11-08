package src.pagamentos;
import java.util.Scanner;

public class CartaoPagamento implements Pagamento  {

    @Override 
    public void  processar(double valor , Scanner scanner){


    System.out.println("\n =====Pagamento Via Cartão====");
    System.out.printf("Valor Da compra :R$ %.2f%n", valor);

    System.out.println("\n Ecolha modalidade "); 
    System.out.println(" 1- Debito");
    System.out.println(" 2- Credito");
    
    System.out.print("Opção: ");
    String modalidade=scanner.nextLine();

    if(modalidade.equals("1"))
    {
        System.out.println("\n Modalidade Debito");
    }

    else if (modalidade.equals("2")){
    System.out.println("\n modalidade Credito ");

    System.out.println("Quantidade de parcelas ? ");
    int parcelas;
    
    try{
        parcelas=Integer.parseInt(scanner.nextLine());
        
        if (parcelas <1|| parcelas > 12) {
            System.out.println("qauntidade de parcelas invalidas ");
                return;
        }
    }
        catch(NumberFormatException e ){
            System.err.println("Digite um numero de Parcelas Validos ! ");
            return ;
        }

        double valorParcela =valor/parcelas ;
        System.out.printf("parcelamento  %dx de R$ %.2f%n",parcelas , valorParcela);
    }
    else{
        System.out.println("Modalidade Invalida");
        return;
    }

    System.out.println("\nPagamento simulado com sucesso.");
} 

}
