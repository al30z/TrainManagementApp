public class TrainConsistApp {
    public static void main(String[] args) {
        java.util.List<Bogie> bogies = java.util.Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("Goods", 100)
        );

        java.util.Map<String, java.util.List<Bogie>> grouped = bogies.stream()
                .collect(java.util.stream.Collectors.groupingBy(
                        b -> b.name.equals("Goods") ? "Cargo" : "Passenger"
                ));

        System.out.println("Grouped bogies: " + grouped);
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