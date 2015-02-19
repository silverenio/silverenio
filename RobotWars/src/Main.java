/**
 * Created by Anton on 15-Feb-15.
 */
public class Main {

    public static void main(String[] args) {

        Robot robotRed = new Robot();
        System.out.println("RED Robot's characteristics was created:");
        robotRed.characteristics();

        Robot robotBlue = new Robot();
        System.out.println("BLUE Robot's characteristics was created:");
        robotBlue.characteristics();

        for (int i = 1; i <= 3; i++) {
            System.out.println("===========================");
            System.out.println("Round " + i + ", FIGHT !!!");
            robotBlue.attack(robotRed);
            robotRed.attack(robotBlue);
            System.out.println("===========================");
            System.out.println("RED Robot's health: " + robotRed.getHealth());
            System.out.println("BLUE Robot's health: " + robotBlue.getHealth());
            System.out.println("");
            System.out.println("");

        }
        if (robotRed.getHealth()<robotBlue.getHealth())
        {
            System.out.println("<<< BLUE robot WINS >>>");
        }
        else if (robotRed.getHealth()>robotBlue.getHealth())
        {
            System.out.println("<<< RED robot WINS >>>");
        }
        else System.out.println("<<< DRAW GAME >>>");
    }
}


