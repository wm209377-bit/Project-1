import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // FirstJavaProgram
        Scanner input = new Scanner(System.in);
        String adjective1;
        String adjective2;
        String noun1;
        String verb1;
        String adjective3;
        System.out.println("Enter an adjective (description): ");
        adjective1 = input.nextLine();
        System.out.println("Enter an noun (Animal or person): ");
        noun1 = input.nextLine();
        System.out.println("Enter an adjective (description):");
        adjective2 = input.nextLine();
        System.out.println("Enter a verb end with -ing (acton)");
        verb1 = input.nextLine();
        System.out.println("Enter an adjective (description):");
        adjective3 = input.nextLine();
        System.out.println();
        


        System.out.println("Today I went to the " + adjective1 + " zoo.");
        System.out.println("In a exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + ".");
        System.out.println("I was " + adjective3 + "!");

        input.close();
    }



}
