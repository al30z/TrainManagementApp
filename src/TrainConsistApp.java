public class TrainConsistApp {
    public static void main(String[] args) {
        String trainId = "TRN-1234";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("TRN-\\d{4}");
        java.util.regex.Matcher matcher = pattern.matcher(trainId);

        System.out.println("Train ID valid? " + matcher.matches());
    }
}