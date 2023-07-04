import java.util.Scanner;


public class MovieDriver {

    public static void main(String[] args) {
        String doAgain;
        do {
            String title;
            String rating;
            int soldTickets;

            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter the name of a movie");
            title = userInput.nextLine();

            System.out.println("Enter the rating of the movie");
            rating = userInput.nextLine();

            System.out.println("Enter the number of tickets sold for this movie");
            soldTickets = userInput.nextInt();

            System.out.println(title + " (" + rating + "): Tickets Sold: " + soldTickets);

            Scanner tryAgainInput = new Scanner(System.in);

            System.out.println("Do you want to enter another? (y or n)");
            doAgain = tryAgainInput.nextLine();

            if (doAgain.equals("n")) {
                System.out.println("Goodbye");
            }
        } while(doAgain.equals("y"));
        System.exit(0);
    }

}