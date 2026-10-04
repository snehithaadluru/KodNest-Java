import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        int solvedProblems = scanner.nextInt();
        double assessmentPercentage = scanner.nextDouble();

        // Read and display the profile
        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + assessmentPercentage);

        scanner.close();
    }
}