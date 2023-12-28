import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu_option = 0;
        
        while (menu_option == 0) {
            System.out.println("WELCOME TO THE CHAMPIONSHIP MENU\nChoose an option below");           
            System.out.println("\n1 - Standings Table\n2 - Top Scorers Table\n3 - Games Schedule");
            menu_option = scanner.nextInt();
    
            if (menu_option == 1) {
                System.out.println("Standings Table:\n1 - Brazil 40 points\n2 - Argentina 30 points\n3 - Spain 20 points\n4 - Uruguay 10 points\n5 - France 5 points");
                System.out.println("Type 0 to go back to the Main Menu");
                menu_option = scanner.nextInt();
            } else if (menu_option == 2) {
                System.out.println("Top Scorers Table\n1 - Neymar jr 99 goals\n2 - Cristiano Ronaldo 98 goals\n3 - Messi 92 goals\n4 - Mbappe 79 goals\n5 - Vinicius Jr 78 goals\n6 - Rodrygo 75 goals");
                System.out.println("Type 0 to go back to the Main Menu");
                menu_option = scanner.nextInt();
            } else if (menu_option == 3) {
                System.out.println("Game Schedule\n1 - Brazil vs Spain at 2:30 PM\n2 - Argentina vs France at 6:30 PM");
                System.out.println("Type 0 to go back to the Main Menu");
                menu_option = scanner.nextInt();
            } else if (menu_option == 0) {
                break;
            } else {
                System.out.println("Invalid Option, Try Another One");
                menu_option = scanner.nextInt();
            }
        }
    }
}
