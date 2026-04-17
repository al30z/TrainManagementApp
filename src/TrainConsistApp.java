public class TrainConsistApp {
    public static void main(String[] args) {
        java.util.List<Bogie> bogies = java.util.Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("General", 24)
        );

        java.util.List<Bogie> highCapacity = bogies.stream()
                .filter(b -> b.capacity > 50)
                .toList();

        System.out.println("High capacity bogies: " + highCapacity);
    }
}

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}