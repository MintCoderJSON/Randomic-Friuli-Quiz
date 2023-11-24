import java.util.Scanner;

public class Friuli{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Friuli Venezia-Giulia quiz, press enter to start.");
        String input = scanner.nextLine();

        System.out.println("What's Friuli Venezia-Giulia's capital?");
        String capoluogo = scanner.nextLine();

        if (!capoluogo.equals("Trieste")) {
            System.out.println("Errore: incorrect answer :/");
            scanner.close();
            return;
        }

        System.out.println("Correct answer: Trieste");

        System.out.println("Next question: which Italian regions does Friuli Venezia Giulia \nborder with?");
        String confine = scanner.nextLine();

        if (!confine.equals("Veneto")) {
            System.out.println("Error: incorrect answer.");
            scanner.close();
            return;
        }

        System.out.println("Correct answer: Veneto");

        System.out.println("Next question: does Friuli have a sea?");
        String mare = scanner.nextLine();

        switch (mare.toLowerCase()) {
            case "yes":
                System.out.println("Correct, Friuli has sea!");
                break;
            case "no":
                System.out.println("Incorrect, Friuli has sea!");
                scanner.close();
                return;
            default:
                System.out.println("Error: invalid answer!");
        }
        System.out.println("Next question: What is the ethnic majority in Friuli?");
        String maggioranzaEtnica = scanner.nextLine();
        
        if(maggioranzaEtnica.equals("Slovenians"))  {
        	System.out.println("Correct answer: the Slovenians!");
        } else {
        	System.out.println("Incorrect answer :/ try again...");
        }
        	
        System.out.println("Next question, which city in Friuli Venezia Giulia is famous for its\nRoman amphitheater?");
        String cittaAnfiteatro = scanner.nextLine();
        
        if(cittaAnfiteatro.equals("Aquileia"))	{
        	System.out.println("Correct answer, the city in question is Aquileia.");
        	
        } else {
        	System.out.println("Incorrect answer! Retry!");
        
        
        scanner.close();
        	}	
        }  
    }



