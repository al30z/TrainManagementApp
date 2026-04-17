import java.util.HashMap;

public class TrainConsistApp {
    public static void main(String[] args) {
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);

        System.out.println("Bogie capacities: " + bogieCapacity);
    }
}