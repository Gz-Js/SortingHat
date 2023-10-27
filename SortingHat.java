import java.util.Scanner;
public class SortingHat
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String name;
        String answer;

        System.out.print("Welcome to the Hat Sorting quiz. What is your name? ");
        name = scan.nextLine();
        System.out.println("I will ask you some questions, and you will be sorted by into a Hogwarts House.");
        System.out.print("First Question: Do you value bravery and chivalry? ");
        answer = scan.nextLine();
        if (answer.toLowerCase().equals("yes"))
        {
            System.out.println("\nDear " + name +", \nYou belong to Gryffindor!");
        }
        else if (answer.toLowerCase().equals("no"))
        {
            System.out.print("Do you value hard work, dedication, and loyalty? ");
            answer = scan.nextLine();
            if (answer.toLowerCase().equals("yes"))
            {
                System.out.println("\nDear " + name +", \nYou belong to Hufflepuff!");
            }
            else if (answer.toLowerCase().equals("no"))
            {
                System.out.print("Do you value intelligence, creativity, and learning? ");
                answer = scan.nextLine();
                if (answer.toLowerCase().equals("yes"))
                {
                     System.out.println("\nDear " + name +", \nYou belong to Ravenclaw!");
                }
                else if (answer.toLowerCase().equals("no"))
                {
                    System.out.println("\nDear " + name + ", \nYou belong to Slytherin!");
                }
            }
        }
    }
}
