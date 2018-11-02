package hansung.designpatterns.templatemethod.barista;
import java.io.*;

public class DutchCoffeeWithHook extends CaffeineBeverageWithHook {

    void brew() { System.out.println("Dripping Coffee by using cold water."); }
    void addCondiments() { System.out.println("Adding Syrup."); }
    void agingCoffee() { System.out.println("After brewing, Aging the coffee for one~two day on low temperature."); }
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) { return true; }
        else { return false; }
    }
    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like syrup with your dutch coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
