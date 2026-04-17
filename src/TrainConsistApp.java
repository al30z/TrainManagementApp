import java.util.HashSet;

public class TrainConsistApp {
    public static void main(String[] args) {
        HashSet<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // duplicate ignored

        System.out.println("Unique bogie IDs: " + bogieIds);
    }
}