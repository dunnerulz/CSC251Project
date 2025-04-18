public class PolicyHolder {
    private String FirstName;
    private String LastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // Replace the current toString() in PolicyHolder.java with this:
    @Override
    public String toString() {
        // Use String.format for precise layout matching the sample output
        return String.format("Policyholder's First Name: %s\nPolicyholder's Last Name: %s\nPolicyholder's Age: %d\nPolicyholder's Smoking Status: %s\nPolicyholder's Height: %.1f inches\nPolicyholder's Weight: %.1f pounds\nPolicyholder's BMI: %.2f",
                this.getFirstName(),
                this.getLastName(),
                this.getAge(),
                this.getSmokingStatus(),
                this.getHeight(),
                this.getWeight(),
                this.getBMI()); // Calculate BMI
    }

    public PolicyHolder()
    {
        FirstName = "";
        LastName = "";
        age = 0;
        smokingStatus = "";
        height = 0;
        weight = 0;
    }

    public PolicyHolder(String fName, String lName,int a, String sStatus, double h, double w)
    {
        FirstName = fName;
        LastName = lName;
        age = a;
        smokingStatus = sStatus;
        height = h;
        weight = w;
    }

    public PolicyHolder(PolicyHolder original) {
        // Copy the values from the original object's fields
        // to the new object's fields ('this')
        this.FirstName = original.FirstName;
        this.LastName = original.LastName;
        this.age = original.age;
        this.smokingStatus = original.smokingStatus;
        this.height = original.height;
        this.weight = original.weight;
    }


    /**
     @return The Policyholder's first name
     */
    public String getFirstName()
    {
        return FirstName;
    }

    /**
     @return The Policyholder's last name
     */
    public String getLastName()
    {
        return LastName;
    }

    /**
     @return The Policyholder's age
     */
    public int getAge()
    {
        return age;
    }

    /**
     @return The Policyholder's smoking status
     */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    /**
     @return The Policyholder's height
     */
    public double getHeight()
    {
        return height;
    }

    /**
     @return The Policyholder's weight
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     @param fName The PolicyHolder's first name
     */
    public void setFirstName(String fName)
    {
        FirstName = fName;
    }

    /**
     @param lName The PolicyHolder's last name
     */
    public void setLastName(String lName)
    {
        LastName = lName;
    }

    /**
     @param a The PolicyHolder's age
     */
    public void setAge(int a)
    {
        age = a;
    }

    /**
     @param sStatus The PolicyHolder's smoking status
     */
    public void setSmokingStatus(String sStatus)
    {
        smokingStatus = sStatus;
    }

    /**
     @param h The PolicyHolder's height
     */
    public void setHeight(double h)
    {
        height = h;
    }

    /**
     @param w The PolicyHolder's weight
     */
    public void setWeight(double w)
    {
        weight = w;
    }

    /**
     Calculates the PolicyHolder's BMI
     @return The BMI of the PolicyHolder
     */
    public double getBMI()
    {
        final double CONVFACTOR = 703;

        return (weight * CONVFACTOR) / (height * height);
    }


}
