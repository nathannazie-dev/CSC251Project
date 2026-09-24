public class Policy
{
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    private static int policyCount = 0;

    public Policy()
    {
        policyNumber = 0;
        providerName = "";
        policyHolder = new PolicyHolder();

        policyCount++;
    }

    public Policy(int policyNumber, String providerName,
                  PolicyHolder policyHolder)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(policyHolder);

        policyCount++;
    }

    public int getPolicyNumber()
    {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    public String getProviderName()
    {
        return providerName;
    }

    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    public PolicyHolder getPolicyHolder()
    {
        return new PolicyHolder(policyHolder);
    }

    public void setPolicyHolder(PolicyHolder policyHolder)
    {
        this.policyHolder = new PolicyHolder(policyHolder);
    }

    public static int getPolicyCount()
    {
        return policyCount;
    }

    public double getPolicyPrice()
    {
        double price = 600.0;

        if (policyHolder.getPolicyholderAge() > 50)
        {
            price += 75.0;
        }

        if (policyHolder.getPolicyholderSmokingStatus()
                        .equalsIgnoreCase("smoker"))
        {
            price += 100.0;
        }

        double bmi = policyHolder.getBMI();

        if (bmi > 35)
        {
            price += (bmi - 35) * 20;
        }

        return price;
    }

    public String toString()
    {
        return String.format(
            "Policy Number: " + policyNumber +
            "\n\nProvider Name: " + providerName +
            "\n\n" + policyHolder +
            "\n\nPolicy Price: $%.2f",
            getPolicyPrice());
    }
}