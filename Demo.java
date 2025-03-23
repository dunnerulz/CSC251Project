import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Demo {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Policy> policies = new ArrayList<>();

        Scanner fileScanner = new Scanner(new File("PolicyInformation.txt"));

        // Read each set of policy information from the file
        while (fileScanner.hasNextLine()) {
            int policyNumber = Integer.parseInt(fileScanner.nextLine());
            String providerName = fileScanner.nextLine();
            String firstName = fileScanner.nextLine();
            String lastName = fileScanner.nextLine();
            int age = Integer.parseInt(fileScanner.nextLine());
            String smokingStatus = fileScanner.nextLine();
            double height = Double.parseDouble(fileScanner.nextLine());
            double weight = Double.parseDouble(fileScanner.nextLine());

            // Create Policy object and add to the list
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(policy);
        }
        fileScanner.close();

        int smokerCount = 0;
        int nonSmokerCount = 0;

        // Display each policy's information and count smokers/non-smokers
        for (Policy policy : policies) {
            System.out.println(policy);
            System.out.println(); // Add a blank line after each policy

            if (policy.getPolicyholderSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        // Display the counts
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}