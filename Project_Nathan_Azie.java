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

            ArrayList<Policy> policies =
                new ArrayList<Policy>();

            while (inputFile.hasNext())
            {
                String line = inputFile.nextLine();

                if (!line.isEmpty())
                {
                    int policyNumber =
                        Integer.parseInt(line);

                    String providerName =
                        inputFile.nextLine();

                    String firstName =
                        inputFile.nextLine();

                    String lastName =
                        inputFile.nextLine();

                    int age =
                        Integer.parseInt(inputFile.nextLine());

                    String smokingStatus =
                        inputFile.nextLine();

                    double height =
                        Double.parseDouble(inputFile.nextLine());

                    double weight =
                        Double.parseDouble(inputFile.nextLine());

                    PolicyHolder policyHolder =
                        new PolicyHolder(firstName,
                                         lastName,
                                         age,
                                         smokingStatus,
                                         height,
                                         weight);

                    Policy policy =
                        new Policy(policyNumber,
                                   providerName,
                                   policyHolder);

                    policies.add(policy);
                }
            }

            inputFile.close();

            int smokerCount = 0;
            int nonSmokerCount = 0;

            for (int i = 0; i < policies.size(); i++)
            {
                Policy policy = policies.get(i);

                System.out.println(policy);
                System.out.println();
                System.out.println();

                PolicyHolder policyHolder =
                    policy.getPolicyHolder();

                if (policyHolder.getPolicyholderSmokingStatus()
                                .equalsIgnoreCase("smoker"))
                {
                    smokerCount++;
                }
                else if (policyHolder.getPolicyholderSmokingStatus()
                                     .equalsIgnoreCase("non-smoker"))
                {
                    nonSmokerCount++;
                }
            }

            System.out.println(
                "There were " +
                Policy.getPolicyCount() +
                " Policy objects created.");

            System.out.println();

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