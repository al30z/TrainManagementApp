import java.util.TreeSet;

public class TrainConsistApp {
    public static void main(String[] args) {
        TreeSet<String> bogieIds = new TreeSet<>();

        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("Ordered bogie IDs: " + bogieIds);
    }
}