import java.util.ArrayList;

public class TrainConsistApp {
    public static void main(String[] args) {
        ArrayList<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("General");

        System.out.println("Train bogies: " + bogies);

        bogies.remove("General");
        System.out.println("After removal: " + bogies);

        System.out.println("Contains Sleeper? " + bogies.contains("Sleeper"));
    }
}