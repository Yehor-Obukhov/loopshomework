package project3intoloop;

import java.util.Scanner;
public class improvedconvinloop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userChoice;

        do {

            System.out.println("Book recommendation");
            System.out.println("Hello! Welcome to the Book Recommendation System.");
            System.out.println("I will recommend a book based on your age and favourite genre.");


            System.out.print("What is your name? ");
            String name = scanner.nextLine();

            System.out.print("How old are you? ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Available genres:");
            System.out.println("detective");
            System.out.println("fantasy");
            System.out.println("non-fiction");
            System.out.println("science fiction");
            System.out.println("adventure");

            System.out.print("What is your favourite genre? ");
            String genre = scanner.nextLine().toLowerCase();

            System.out.println("Thank you, " + name + "!");
            System.out.println("Let's find a book for you...");

            String recommendation;

            if (age >= 13 && age <= 16 && genre.equals("detective")) {

                recommendation = "The Hound of the Baskervilles by Arthur Conan Doyle";

            } else if (age >= 13 && age <= 16 && genre.equals("fantasy")) {

                recommendation = "Harry Potter and the Philosopher's Stone by J.K. Rowling";

            } else if (age >= 17 && age <= 25 && genre.equals("non-fiction")) {

                recommendation = "Atomic Habits by James Clear";

            } else if (age >= 17 && age <= 25 && genre.equals("science fiction")) {

                recommendation = "The Martian by Andy Weir";

            } else if (age >= 17 && age <= 25 && genre.equals("detective")) {

                recommendation = "The Girl with the Dragon Tattoo by Stieg Larsson";

            } else if (age >= 18 && genre.equals("adventure")) {

                recommendation = "The Call of the Wild by Jack London";

            } else if (age > 25 && genre.equals("non-fiction")) {

                recommendation = "Sapiens by Yuval Noah Harari";

            } else if (age > 25 && genre.equals("detective")) {

                recommendation = "Murder on the Orient Express by Agatha Christie";

            } else if (age > 25 && genre.equals("fantasy")) {

                recommendation = "The Hobbit by J.R.R. Tolkien";

            } else {

                recommendation = "The Little Prince by Antoine de Saint-Exupéry";
            }

            System.out.println("Your recommendation:");
            System.out.println(recommendation);


            System.out.println("I hope you enjoy your book, " + name + "!");
            System.out.println("Do you want to repeat the conversation? Y/N: ");
            userChoice = scanner.nextLine();


        } while (userChoice.equalsIgnoreCase("Y"));
            System.out.println("Thank you for your choice!");
            scanner.close();

        }
    }
