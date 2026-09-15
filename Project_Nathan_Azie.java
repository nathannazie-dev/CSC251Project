import java.util.*;
import java.io.*;

public class Project_Nathan_Azie
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("PolicyInformation.txt");
            Scanner inputFile = new Scanner(file);

            ArrayList<Policy> policies = new ArrayList<Policy>();

            while (inputFile.hasNext())
            {
                String line = inputFile.nextLine();

                // Skip blank lines between policy records
                if (!line.isEmpty())
                {
                    int policyNumber = Integer.parseInt(line);

                    String providerName = inputFile.nextLine();
                    String firstName = inputFile.nextLine();
                    String lastName = inputFile.nextLine();

                    int age = Integer.parseInt(inputFile.nextLine());

                    String smokingStatus = inputFile.nextLine();

                    double height =
                        Double.parseDouble(inputFile.nextLine());

                    double weight =
                        Double.parseDouble(inputFile.nextLine());

                    Policy policy = new Policy(policyNumber,
                                               providerName,
                                               firstName,
                                               lastName,
                                               age,
                                               smokingStatus,
                                               height,
                                               weight);

                    policies.add(policy);
                }
            }

            inputFile.close();

            int smokerCount = 0;
            int nonSmokerCount = 0;

            for (int i = 0; i < policies.size(); i++)
            {
                Policy policy = policies.get(i);

                System.out.println("Policy Number: " +
                                   policy.getPolicyNumber());
                System.out.println();

                System.out.println("Provider Name: " +
                                   policy.getProviderName());
                System.out.println();

                System.out.println("Policyholder's First Name: " +
                                   policy.getPolicyholderFirstName());
                System.out.println();

                System.out.println("Policyholder's Last Name: " +
                                   policy.getPolicyholderLastName());
                System.out.println();

                System.out.println("Policyholder's Age: " +
                                   policy.getPolicyholderAge());
                System.out.println();

                System.out.println(
                    "Policyholder's Smoking Status (smoker/non-smoker): " +
                    policy.getPolicyholderSmokingStatus());
                System.out.println();

                System.out.printf(
                    "Policyholder's Height: %.1f inches%n",
                    policy.getPolicyholderHeight());
                System.out.println();

                System.out.printf(
                    "Policyholder's Weight: %.1f pounds%n",
                    policy.getPolicyholderWeight());
                System.out.println();

                System.out.printf(
                    "Policyholder's BMI: %.2f%n",
                    policy.getBMI());
                System.out.println();

                System.out.printf(
                    "Policy Price: $%.2f%n",
                    policy.getPolicyPrice());
                System.out.println();

                if (policy.getPolicyholderSmokingStatus()
                          .equalsIgnoreCase("smoker"))
                {
                    smokerCount++;
                }
                else if (policy.getPolicyholderSmokingStatus()
                               .equalsIgnoreCase("non-smoker"))
                {
                    nonSmokerCount++;
                }
            }

            System.out.println(
                "The number of policies with a smoker is: " +
                smokerCount);

            System.out.println();

            System.out.println(
                "The number of policies with a non-smoker is: " +
                nonSmokerCount);
        }
        catch (IOException ex)
        {
            System.out.println(
                "Something went wrong reading the file: " +
                ex.getMessage());
        }
    }
}