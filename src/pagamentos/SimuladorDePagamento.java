package src.pagamentos;
import java.util.Scanner;

public class SimuladorDePagamento {
    

// metodo main 
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);

    double valor=0;
    
    while(true) {
        System.out.println("Digite o valor do pagamento :  ");

        try{
            valor=Double.parseDouble(scanner.nextLine()); 
        
        if (valor > 0) {
        break;
        }else{System.out.println("o Valor deve ser  maior que 0,00");}
    }     
    catch(NumberFormatException e) {
        System.out.println("digite um valor .");
    }
}
    
    //formas de pagamento . 

System.out.println("\n ==================forma de pagamento================");
System.out.println("1- pix");
System.out.println("2-cartao");
System.out.println("3-especie");

// receber pagamentos .
System.out.println("escolha uma opção");

String opcao=scanner.nextLine();

Pagamento pagamento;
switch (opcao) {
    case "1":
        pagamento = new PixPagamento();
        break;
    case "2":
        pagamento = new CartaoPagamento();
        break;
    case "3":
        pagamento = new DinheiroPagamento();
        break;
    default:
        System.out.println("opçao invalida");
        scanner.close();
        return;
}

pagamento.processar(valor, scanner);
scanner.close(); 

}

}
