public class PolicyHolder {
    private String FirstName;
    private String LastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    @Override
    public String toString(){
         StringBuilder fields = new StringBuilder();
         fields.append("Name: " + getFirstName());
         fields.append("Last Name: " + getLastName());
         fields.append("Age: " + getAge());
         fields.append("Smoking Status: " + getSmokingStatus());
         fields.append("Height: " + getHeight());
         fields.append("Weight: " + getWeight());

         return fields.toString();

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
