import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // O "continuar" foi colocado com a ideia de podermos fazer mais de uma operação
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o primeiro número: "); /*Nessa parte colocamos o primeiro numero, depois a operação e o segundo numero*/
            double num1 = scanner.nextDouble();

            System.out.println("Digite a operação desejada: (+, -, *, /)");
            char op = scanner.next().charAt(0);

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;
            boolean valido = true;

            /*Aqui são as operações*/
            switch (op) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':

                    if (num2 != 0){
                        resultado = num1 / num2;
                    }
                    System.out.println("Não é possível dividir por zero");
                    valido = false;
                    break;
                default:
                    System.out.println("Operação inválida");
                    valido = false;
                    break;


            }
            /*Aqui consideramos que caso valido seja verdadeiro, teremos o resultado e a pergunta para caso o usuario*/
            /*queira fazer outra operação,*/
            if (valido) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.println("Deseja fazer outra operação? (Sim/Não)");
            char escolha = scanner.next().charAt(0);

            continuar = (escolha == 'S' || escolha == 's');
        }

        scanner.close();
        System.out.println("Obrigado!");
    }
            /*Scanner scanner = new Scanner(System.in);

            boolean continuar = true;

            while (continuar) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                System.out.print("Qual operação você deseja realizar? (Digite +, -, *, /, ^ para potenciação, % para módulo): ");
                char operacao = scanner.next().charAt(0);

                boolean operacaoValida = true;
                double resultado = 0;

                switch (operacao) {
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Erro: divisão por zero!");
                            operacaoValida = false;
                        }
                        break;
                    default:
                        System.out.println("Operação inválida!");
                        operacaoValida = false;
                        break;
                }

                if (operacaoValida) {
                    System.out.println("O resultado da operação é: " + resultado);
                }

                System.out.print("Deseja realizar outra operação? (S/N): ");
                char escolha = scanner.next().charAt(0);

                continuar = (escolha == 'S' || escolha == 's');
            }

            scanner.close();
            System.out.println("Obrigado por usar a calculadora!");
        }*/
}
