public class JavaExample {

    public static void main(String[] args) {
        String str = "BeginnersBook";
        int vcount = 0;

        //converting all the chars to lowercase
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) 
          { 
           char ch = str.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            { 
              vcount++; 
            } 

        }
        System.out.println("Number of Vowels: " + vcount);
        
    }
}