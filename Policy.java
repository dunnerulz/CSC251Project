public class Policy
{  //fields
    private String policyNumber;
    private String providerName;
    private static int policyCount = 0;

    private PolicyHolder policyHolder;

    /**
     No-arg constructor that explicitly initializes all fields
     */
    public Policy()
    {
        policyNumber = "";
        providerName = "";
        this.policyHolder = new PolicyHolder();
        policyCount++;
    }

    // Replace the current toString() in Policy.java with this:
    @Override
    public String toString() {
        // Use String.format to combine Policy info, the PolicyHolder's details, and the price
        return String.format("Policy Number: %s\nProvider Name: %s\n%s\nPolicy Price: $%.2f",
                this.policyNumber,
                this.providerName,
                this.policyHolder.toString(), // Calls the PolicyHolder's toString()
                this.getPrice()); // Calculate and format the price
    }

    public static int getPolicyCount(){
        return policyCount;
    }

    /**
     Constructor that accepts arguments for each field
     @param pNumber The Policy number
     @param pName The Policy Provider's Name
     @param fName The Policyhodler's first name
     @param lName The Policyholder's last name
     @param a The Policyholder's age
     @param sStatus The Policyholder's smoking status
     @param h The Policyholder's height
     @param w The Policytholder's weight
     */

    public PolicyHolder getPolicyHolder(){
        return new PolicyHolder(this.policyHolder);
    }

    public Policy(String pNumber, String pName, PolicyHolder policyHolder)
    {
        policyNumber = pNumber;
        providerName = pName;
        this.policyHolder = policyHolder;
        policyCount++;
    }

    //getters//
    /**
     @return The Policy Number
     */
    public String getPolicyNumber()
    {
        return policyNumber;
    }

    /**
     @return The Policy Provider's Name
     */
    public String getProviderName()
    {
        return providerName;
    }

    //setters//

    /**
     @param pNumber The Policy Number
     */
    public void setPolicyNumber(String pNumber)
    {
        policyNumber = pNumber;
    }

    /**
     @param pName The Policy Provider's name
     */
    public void setProviderName(String pName)
    {
        providerName = pName;
    }


    /**
     Calculates the Policy's price
     @return The price of the Policy
     */
    public double getPrice()
    {
        final double BASE_PRICE = 600;
        final double ADDITIONAL_FEE_AGE = 75;
        final double ADDITIONAL_FEE_SMOKING = 100;
        final double ADDITIONAL_FEE_PER_BMI = 20;

        final int AGE_THRESHOLD = 50;
        final int BMI_THRESHOLD = 35;

        double price = BASE_PRICE;

        if(policyHolder.getAge() > AGE_THRESHOLD)
            price += ADDITIONAL_FEE_AGE;

        if(policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
            price += ADDITIONAL_FEE_SMOKING;

        if(policyHolder.getBMI() > BMI_THRESHOLD)
            price += ((policyHolder.getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);

        return price;
    }

    //Not included in the instructions but can be added...
   /*Displays information about the Policy
   public void displayInformation()
   {
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status (Y/N): " + smokingStatus);
      System.out.println("Policyholder's Height: " + height + " inches");
      System.out.println("Policyholder's Weight: " + weight + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", getBMI());
      System.out.printf("Policy Price: $%.2f\n", getPrice());
   }
   */
}