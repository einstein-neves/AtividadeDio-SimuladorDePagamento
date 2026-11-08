# Simulador de Pagamentos

Projeto de estudo em Java para simular uma escolha entre Pix, cartão e dinheiro. Nenhum pagamento real é processado.

## Sobre o projeto

O programa pede o valor da compra e a forma de pagamento:

- **Pix:** exibe uma confirmação simulada.
- **Cartão:** permite escolher débito ou crédito. No crédito, pede a quantidade de parcelas, de 1 a 12.
- **Dinheiro:** pede o valor recebido e calcula o troco.

O projeto pratica o padrão **Strategy**. A interface `Pagamento` define a operação comum `processar`, e cada forma de pagamento implementa seu próprio comportamento. O simulador escolhe a implementação conforme a opção informada.

## Estrutura

Os arquivos Java estão em `src/pagamentos/`:

- `SimuladorDePagamento.java`: inicia o programa, lê as entradas e seleciona a estratégia.
- `Pagamento.java`: define a interface comum para as estratégias.
- `PixPagamento.java`: simula o pagamento por Pix.
- `CartaoPagamento.java`: simula débito ou crédito parcelado.
- `DinheiroPagamento.java`: verifica o valor recebido e calcula o troco.

## Requisitos

- JDK instalado.
- VS Code com suporte a Java, ou um terminal para compilar e executar o projeto.

## Executar no VS Code

1. Abra no VS Code a pasta do projeto.
2. Abra `src/pagamentos/SimuladorDePagamento.java`.
3. Use **Run Java** acima do método `main`.

## Compilar e executar pelo PowerShell

No terminal, a partir da pasta raiz do projeto, compile os arquivos:

```powershell
javac -encoding UTF-8 -d out .\src\pagamentos\Pagamento.java .\src\pagamentos\PixPagamento.java .\src\pagamentos\CartaoPagamento.java .\src\pagamentos\DinheiroPagamento.java .\src\pagamentos\SimuladorDePagamento.java
```

Em seguida, execute:

```powershell
java -cp out src.pagamentos.SimuladorDePagamento
```

Digite um valor positivo usando ponto como separador decimal, por exemplo `30.00`. Depois escolha uma forma de pagamento. Para dinheiro, o valor recebido também aceita vírgula ou ponto.

## Escopo e segurança

Este é apenas um exercício educacional. Não se conecta a bancos, operadoras ou serviços de pagamento. Não informe dados reais de cartão, senhas ou outras informações financeiras.
