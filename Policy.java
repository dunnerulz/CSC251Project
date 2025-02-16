public class Policy {

    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;

    // No-argument constructor
    public Policy() {
        policyNumber = 0;
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        policyholderSmokingStatus = "non-smoker";
        policyholderHeight = 0.0;
        policyholderWeight = 0.0;
    }

    // Constructor with arguments
    public Policy(int policyNumber, String providerName, String policyholderFirstName,
                  String policyholderLastName, int policyholderAge, String policyholderSmokingStatus,
                  double policyholderHeight, double policyholderWeight) {

        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.policyholderSmokingStatus = policyholderSmokingStatus;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
    }

    // Getters (Accessors)
    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    public int getPolicyholderAge() {
        return policyholderAge;
    }

    public String getPolicyholderSmokingStatus() {
        return policyholderSmokingStatus;
    }

    public double getPolicyholderHeight() {
        return policyholderHeight;
    }

    public double getPolicyholderWeight() {
        return policyholderWeight;
    }

    // Setters (Mutators)
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public void setPolicyholderFirstName(String policyholderFirstName) {
        this.policyholderFirstName = policyholderFirstName;
    }

    public void setPolicyholderLastName(String policyholderLastName) {
        this.policyholderLastName = policyholderLastName;
    }

    public void setPolicyholderAge(int policyholderAge) {
        this.policyholderAge = policyholderAge;
    }

    public void setPolicyholderSmokingStatus(String policyholderSmokingStatus) {
        this.policyholderSmokingStatus = policyholderSmokingStatus;
    }

    public void setPolicyholderHeight(double policyholderHeight) {
        this.policyholderHeight = policyholderHeight;
    }

    public void setPolicyholderWeight(double policyholderWeight) {
        this.policyholderWeight = policyholderWeight;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }

    // Method to calculate Policy Price
    public double calculatePolicyPrice() {
        double price = 600.0;

        if (policyholderAge > 50) {
            price += 75.0;
        }

        if (policyholderSmokingStatus.equalsIgnoreCase("smoker")) {
            price += 100.0;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }
     @Override
    public String toString() {  //added a toString method to properly display information
        return String.format("Policy Number: %d\n" +
                        "Provider Name: %s\n" +
                        "Policyholder’s First Name: %s\n" +
                        "Policyholder’s Last Name: %s\n" +
                        "Policyholder’s Age: %d\n" +
                        "Policyholder’s Smoking Status: %s\n" +
                        "Policyholder’s Height: %.1f inches\n" +
                        "Policyholder’s Weight: %.1f pounds\n" +
                        "Policyholder’s BMI: %.2f\n" +
                        "Policy Price: $%.2f",
                policyNumber, providerName, policyholderFirstName, policyholderLastName,
                policyholderAge, policyholderSmokingStatus, policyholderHeight,
                policyholderWeight, calculateBMI(), calculatePolicyPrice());
    }
}