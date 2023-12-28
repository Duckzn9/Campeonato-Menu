import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int opcao_menu = 0;
        while (opcao_menu == 0) {
            System.out.println("BEM VINDO AO MENU DO CAMPEONATO\nEscolha uma opcao abaixo");           
    System.out.println("\n1 - Tabela de Classificacao\n2 - Tabela de Artilheiros\n3 - Tabela de Jogos");
    opcao_menu = scanner.nextInt();
            if (opcao_menu == 1) {
                System.out.println("Tabela de Classificacao:\n1 - Brasil 40 pontos\n2 - Argentina 30 pontos\n3 - Espanha 20 pontos\n4 - Uruguai 10 pontos\n5 - França 5 pontos");
                System.out.println("Digite 0 para voltar ao Menu Inicial");
                opcao_menu = scanner.nextInt();
            } else if (opcao_menu == 2) {
                System.out.println("Tabela de Melhores Marcadores\n1 - Neymar jr 99 gols\n2 - Cristiano Ronaldo 98 gols\n3 - Messi 92 gols\n4 - Mbappe 79 gols\n5 - Vinicius Jr 78 gols\n6 - Rodrygo 75 gols");
                System.out.println("Digite 0 para voltar ao Menu inicial");
                opcao_menu = scanner.nextInt();
            } else if (opcao_menu == 3) {
                System.out.println("Horario dos Jogos\n1 - Brasil X Espanha 14:30h\n2 - Argentina X França 18:30h");
                System.out.println("Digite 0 para voltar ao Menu inicial");
                opcao_menu = scanner.nextInt();
            }
            
            else if (opcao_menu == 0) {
                break;
            } else {
                System.out.println("Opcao Invalida, Tente outro");
                opcao_menu = scanner.nextInt();
            }
        }
    }
}

