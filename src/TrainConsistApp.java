import java.util.*;
import java.util.stream.*;

public class TrainConsistApp {
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("General", 24)
        );

        List<Bogie> highCapacity = bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());

        System.out.println("High capacity bogies: " + highCapacity);
    }
}