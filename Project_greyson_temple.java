import java.util.Scanner;

public class Project_greyson_temple
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int policyNumber;    //Insurance policy number
      String providerName; //Insurance provide name
      String firstName;     //Policyholder’s First Name
      String lastName;      //Policyholder’s Last Name
      int age;              //Policyholder’s Age
      String smokingStatus; //Policyholder’s smoking status
      double height;         //Height of the policyholder
      double weight;         //Weight of the policyholder
      
      System.out.print("\nPlease enter the Policy Number: ");
      policyNumber = input.nextInt();
      input.nextLine();
      
      System.out.print("\nPlease enter the Provider Name: ");
      providerName = input.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's First Name: ");
      firstName = input.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Last Name: ");
      lastName = input.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Age: ");
      age = input.nextInt();
      input.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = input.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
      height = input.nextDouble();
      
      System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
      weight = input.nextDouble();
      
      //create new policy from inputs
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      //display new policy info
      input.nextLine();
      System.out.println("\nPolicy Number: " + policy.getPolNum());
      System.out.println("\nProvider Name: " + policy.getProvName());
      System.out.println("\nPolicyholder's First Name: " + policy.getFirstName());
      System.out.println("\nPolicyholder's Last Name: " + policy.getLastName());
      System.out.println("\nPolicyholder's Age: " + policy.getAge());
      System.out.println("\nPolicyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.printf("\nPolicyholder's Height: %.1f inches%n", policy.getHeight());
      System.out.printf("\nPolicyholder's Weight: %.1f pounds%n", policy.getWeight());
      System.out.printf("\nPolicyholder's BMI: %.2f%n", policy.calcBMI());
      System.out.printf("\nPolicy Price: $%.2f%n", policy.calcPolicyPrice());
   
   }


}