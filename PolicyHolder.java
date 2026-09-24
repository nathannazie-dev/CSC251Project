public class PolicyHolder
{
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;

    public PolicyHolder()
    {
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        policyholderSmokingStatus = "";
        policyholderHeight = 0.0;
        policyholderWeight = 0.0;
    }

    public PolicyHolder(String firstName, String lastName,
                        int age, String smokingStatus,
                        double height, double weight)
    {
        policyholderFirstName = firstName;
        policyholderLastName = lastName;
        policyholderAge = age;
        policyholderSmokingStatus = smokingStatus;
        policyholderHeight = height;
        policyholderWeight = weight;
    }

    public PolicyHolder(PolicyHolder object2)
    {
        policyholderFirstName = object2.policyholderFirstName;
        policyholderLastName = object2.policyholderLastName;
        policyholderAge = object2.policyholderAge;
        policyholderSmokingStatus = object2.policyholderSmokingStatus;
        policyholderHeight = object2.policyholderHeight;
        policyholderWeight = object2.policyholderWeight;
    }

    public String getPolicyholderFirstName()
    {
        return policyholderFirstName;
    }

    public void setPolicyholderFirstName(String firstName)
    {
        policyholderFirstName = firstName;
    }

    public String getPolicyholderLastName()
    {
        return policyholderLastName;
    }

    public void setPolicyholderLastName(String lastName)
    {
        policyholderLastName = lastName;
    }

    public int getPolicyholderAge()
    {
        return policyholderAge;
    }

    public void setPolicyholderAge(int age)
    {
        policyholderAge = age;
    }

    public String getPolicyholderSmokingStatus()
    {
        return policyholderSmokingStatus;
    }

    public void setPolicyholderSmokingStatus(String smokingStatus)
    {
        policyholderSmokingStatus = smokingStatus;
    }

    public double getPolicyholderHeight()
    {
        return policyholderHeight;
    }

    public void setPolicyholderHeight(double height)
    {
        policyholderHeight = height;
    }

    public double getPolicyholderWeight()
    {
        return policyholderWeight;
    }

    public void setPolicyholderWeight(double weight)
    {
        policyholderWeight = weight;
    }

    public double getBMI()
    {
        return (policyholderWeight * 703) /
               (policyholderHeight * policyholderHeight);
    }

    public String toString()
    {
        return String.format(
            "Policyholder's First Name: " + policyholderFirstName +
            "\n\nPolicyholder's Last Name: " + policyholderLastName +
            "\n\nPolicyholder's Age: " + policyholderAge +
            "\n\nPolicyholder's Smoking Status (Y/N): " +
            policyholderSmokingStatus +
            "\n\nPolicyholder's Height: %.1f inches" +
            "\n\nPolicyholder's Weight: %.1f pounds" +
            "\n\nPolicyholder's BMI: %.2f",
            policyholderHeight,
            policyholderWeight,
            getBMI());
    }
}