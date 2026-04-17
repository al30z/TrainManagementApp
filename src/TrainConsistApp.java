import java.util.LinkedHashSet;

public class TrainConsistApp {
    public static void main(String[] args) {
        LinkedHashSet<String> bogieIds = new LinkedHashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        System.out.println("Insertion order preserved: " + bogieIds);
    }
}