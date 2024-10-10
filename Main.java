class Main{ 
    public static void main(String[] args) { 
        // Rename all variables used 
        
        // Sci-fi first name 
        String f_name = "Once"; //remove
        String l_name = "Twice"; //remove
        // Concatenates the first 3 letters of the users first name and the first 2 letters of their last name
        String scifiF_name = f_name.substring(0, 3) + l_name.substring(0, 2); 
        // Makes the first letter of the string uppercase and the rest lowercase 
        scifiF_name = scifiF_name.substring(0, 1).toUpperCase() + scifiF_name.substring(1).toLowerCase();
        
        // Sci-fi place of origin 
        String relatives  = "hello"; //remove
        String relatives2 = "goodbye"; //remove
        
        // Generates a two random numbers 
        int firstRand_num = (int)(Math.random() * (relatives.length() - 1)) + 1; 
        int secondRand_num = (int)(Math.random() * (relatives.length() - 1)) + 1;
        // Uses the random numbers two create new strings using the relatives' names
        String firstR_name = relatives.substring(firstRand_num);
        String secondR_name = relatives2.substring(secondRand_num); 
        // Concatenates the strings to create the Sci-Fi place of origin        
        String scifi_origin = firstR_name + secondR_name; 
        // Makes the first letter of the string uppercase and the rest lowercase
        scifi_origin = scifi_origin.substring(0, 1).toUpperCase() + scifi_origin.substring(1).toLowerCase();
        
        System.out.println(scifiF_name); //remove
        System.out.println(scifi_origin); //remove
    
    }
}