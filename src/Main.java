import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        ConsultaCotacao const1 = new ConsultaCotacao();
        MoedasConversao resultado = const1.consultaCotacao();
        ConversorMoedas conversor = new ConversorMoedas(resultado.getConversion_rates());

        int escolha = 0;

        Scanner leitura = new Scanner(System.in);

        while(escolha != 7) {
            System.out.println("**********************************************");
            System.out.println("Seja bem vindo ao Conversor de Moedas!\n");
            System.out.println("""
                    1 - Dólar >> Peso argentino
                    2 - Peso argentino >> Dólar
                    3 - Dólar >> Real brasileiro
                    4 - Real brasileiro >> Dólar
                    5 - Dólar >> Peso colombiano
                    6 - Peso colombiano >> Dolar
                    7 - Sair
                    Escolha uma opção válida:
                    ***********************************************************
                    """);

            escolha = leitura.nextInt();
            if (escolha == 7) {
                System.out.println("Cotações atuais (base: BRL):");
                System.out.println(resultado);
                System.out.println("Obrigado por usar o programa!");
                break;
            } else if(escolha < 1 || escolha > 7) {
                System.out.println("Digite um valor válido! Tente novamente");
                break;
            }

            System.out.println("Digite o valor que deseja converter: \n");
            double valor = leitura.nextDouble();

            if (escolha == 1) {
                System.out.println("Valor: %s [USD] corresponde ao valor final de >> %s".formatted(valor, conversor.Converter("USD", "ARS", valor)));
            } else if (escolha == 2) {
                System.out.println("Valor: %s [ARS] corresponde ao valor final de >> %s".formatted(valor, conversor.Converter("ARS", "USD", valor)));
            } else if (escolha == 3) {
                System.out.println("Valor: %s [USD] corresponde ao valor final de >> %s".formatted(valor, conversor.Converter("USD", "BRL", valor)));
            } else if (escolha == 4) {
                System.out.println("Valor: %s [BRL] corresponde ao valor final de >> %s".formatted(valor, conversor.Converter("BRL", "USD", valor)));
            } else if (escolha == 5) {
                System.out.println("Valor: %s [USD] corresponde ao valor final de >> %s".formatted(valor, conversor.Converter("USD", "COP", valor)));
            } else if (escolha == 6) {
                System.out.println("Valor: %s [COP] corresponde ao valor final de >> %s".formatted(valor, conversor.Converter("COP", "USD", valor)));
            }
        }
    }
}
