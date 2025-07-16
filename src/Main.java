import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //MAD GAME
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("enter an adjective(Description):");
        adjective1 = scanner.nextLine();
        System.out.println("enter an noun(animal or person):");
        noun1 = scanner.nextLine();
        System.out.println("enter an adjective(Description):");
        adjective2 = scanner.nextLine();
        System.out.println("enter a verb end with -ing(action):");
        verb1 = scanner.nextLine();
        System.out.println("enter an adjective(Description):");
        adjective3 = scanner.nextLine();


        System.out.println("\ntoday i went to the " +adjective1+"zoo");
        System.out.println("In an exhibit I saw a " +noun1);
        System.out.println(noun1+ "was" +adjective2+ "and"+verb1 +"!");
        System.out.println("I was" +adjective3 +"!");

        scanner.close();

    }
}