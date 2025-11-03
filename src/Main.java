import java.util.Scanner;

public class Main {
    public static final String WELCOME_MESSAGE = "========= Bem vindo ao Simulador de Carro v1.0 =========";

    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o modelo do carro: ");
        String modelo = leitor.nextLine();

        System.out.println("Digite a cor do carro: ");
        String cor = leitor.nextLine();

        Carro meuCarro = new Carro(modelo, cor);
        System.out.println("Carro que será usado no simulador de Carro v1.0 é ");
        System.out.println("Modelo: " + meuCarro.getModelo() + " - Cor: " + meuCarro.getCor() + ".");
        System.out.println("***================================***");

        while (true) {
            System.out.println("\n--- Menu do Carro ---");
            System.out.println("1. Ligar carro");
            System.out.println("2. Desligar carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Frear");
            System.out.println("5. Virar carro");
            System.out.println("6. Verificar velocidade");
            System.out.println("7. Trocar marcha");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção de 1 a 8: ");

            int opcao;
            try {
                opcao = leitor.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um número entre 1 e 8.");
                leitor.nextLine(); // Limpa o buffer
                continue;
            }

            switch (opcao) {
                case 1:
                    meuCarro.ligarCarro();
                    break;
                case 2:
                    meuCarro.desligarCarro();
                    break;
                case 3:
                    meuCarro.acelerar();
                    break;
                case 4:
                    meuCarro.frear();
                    break;
                case 5:
                    System.out.println("Digite a direção em que deseja virar o carro (esquerda ou direita): ");
                    String direcao = leitor.next().toLowerCase();
                    if (direcao.equals("esquerda") || direcao.equals("direita")) {
                        meuCarro.virarCarro(direcao);
                    } else {
                        System.out.println("Direção inválida, digite 'direita ou esquerda'.");
                    }
                    break;
                case 6:
                    meuCarro.verificarVelocidade();
                    break;
                case 7:
                    System.out.println("Digite 'subir' para aumentar marcha ou 'descer' para diminuir marcha: ");
                    String acao = leitor.next().toLowerCase();
                    if (acao.equals("subir")) {
                        meuCarro.trocarMarcha(1);
                    } else if (acao.equals("descer")) {
                        meuCarro.trocarMarcha(-1);
                    } else {
                        System.out.println("Ação inválida, tente 'subir' ou 'descer'.");
                    }
                    break;
                case 8:
                    System.out.println("Saindo do Simulador de Carro v1.0, até logo.");
                    leitor.close();
                    return;
                default:
                    System.out.println("Opção inválida, digite uma opção entre 1 a 8.");
            }
        }

    }
}