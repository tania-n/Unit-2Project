import java.util.Scanner;
public class Main{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in) ;
      System.out.print("Enter your first name ");
      String f_name = input.nextLine();
      System.out.print("Enter your last name ");
      String l_name = input.nextLine();
      System.out.print("Enter the city  you or one of your parents were born:  ");
      String city = input.nextLine();
      System.out.print("The name of your grammer school ");
      String school = input.nextLine();
      System.out.print("Enter the first name of a sibling or other relative ");
      String relatives = input.nextLine();
      System.out.print("Enter the second name of a sibling or other relative  ");
      String relatives2 = input.nextLine();
  
    
        
        // Sci-fi first name 
        // Concatenates the first 3 letters of the users first name and the first 2 letters of their last name
        String scifiF_name = f_name.substring(0, 3) + l_name.substring(0, 2); 
        // Makes the first letter of the string uppercase and the rest lowercase 
        scifiF_name = scifiF_name.substring(0, 1).toUpperCase() + scifiF_name.substring(1).toLowerCase();
        //Sci-fi last name
        String scifi_lname = city.substring(0,2) + school.substring(school.length()-3);
        
        // Generates a two random numbers 
        int firstRand_num = (int)(Math.random() * (relatives.length() - 1)) + 1; 
        int secondRand_num = (int)(Math.random() * (relatives.length() - 1)) + 1;
        // Uses the random numbers and the relatives names to create new strings
        String firstR_name = relatives.substring(firstRand_num);
        String secondR_name = relatives2.substring(secondRand_num); 
        // Concatenates the strings to create the Sci-Fi place of origin        
        String scifi_origin = firstR_name + secondR_name; 
        // Makes the first letter of the string uppercase and the rest lowercase
        scifi_origin = scifi_origin.substring(0, 1).toUpperCase() + scifi_origin.substring(1).toLowerCase();
        
        System.out.println("Hello " + scifiF_name + " " + scifi_lname + " of " + scifi_origin +". Welcome!" ); 
 
    
    }
}      

    

