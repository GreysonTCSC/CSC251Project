class Policy {

   //Defined insurace policy attributes

   int policyNumber;    //Insurance policy number
   String providerName; //Insurance provide name
   String firstName;     //Policyholder’s First Name
   String lastName;      //Policyholder’s Last Name
   int age;              //Policyholder’s Age
   String smokingStatus; //Policyholder’s smoking status
   double height;         //Height of the policyholder
   double weight;         //Weight of the policyholder
   
   //constructor with no arguments
   public Policy()
   {
      policyNumber = 0;
      providerName = "n/a";
      firstName = "n/a";
      lastName = "n/a";
      age = 0;
      smokingStatus = "n/a";
      height = 0;
      weight = 0;
   }
   
   //constructor with args
   public Policy(int polNum, String provName, String phFirstName, String phLastName, int phAge, String smokingStat, double phHeight, double phWeight)
   {
      policyNumber = polNum;
      providerName = provName;
      firstName = phFirstName;
      lastName = phLastName;
      age = phAge;
      smokingStatus = smokingStat;
      height = phHeight;
      weight = phWeight;
   }
   
   //methods to set stuff
   public void setPolNum(int polNum)
   {
      policyNumber = polNum;
   }
   
   public void setProvName(String provName)
   {
      providerName = provName;
   }
   
   public void setFirstName(String phFirstName)
   {
      firstName = phFirstName;
   }
   
   public void setLastName(String phLastName)
   {
      lastName = phLastName;
   }
   
   public void setAge(int phAge)
   {
      age = phAge;
   }
   
   public void setSmokingStatus(String smokingStat)
   {
      smokingStatus = smokingStat;
   }
   
   public void setHeight(double phHeight)
   {
      height = phHeight;
   }
   
   public void setWeight(double phWeight)
   {
      weight = phWeight;
   }
   
   //methods to get stuff
   public int getPolNum()
   {
      return policyNumber;
   }
   
   public String getProvName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWeight()
   {
      return weight;
   }

   //method to calculate BMI
   public double calcBMI()
   {
      double bmi;
      
      bmi = ((weight * 703)/(height * height));
      return bmi;
   }
   
   //method to calculates price of insurance 
   public double calcPolicyPrice()
   {
      double baseFee = 600.00;
      double additionalFee = 0.00;
      double bmi;
      
      if (age > 50)
      {
         additionalFee += 75;
      }
      
      if (smokingStatus.equalsIgnoreCase("smoker"))
      {
         additionalFee += 100;
      }
      
      bmi = calcBMI();
      if(bmi > 35)
      {
         additionalFee += ((bmi - 35) * 20);
      }
      
      return baseFee + additionalFee;
   }
}