// Ann Sam
// Count the Frequency of the characters in the cipher

public class FrequencyHist
{
    public static String FrequencyCounter(String chipherText)
    {
        // print out the frequency of characters in the text in the form of a histogram as well as state the number of times the
        // character appears in the text
        
        String cipherText = "lcllewljazlnnzmvyiylhrmhza";
        
        // first turn all characters to lower case
        cipherText = cipherText.toLowerCase();
        
        // count the frequency of each letter
        System.out.println("Character\tFrequency");
        
        for (char ch = 'a'; ch <= 'z' ; ch++)
        {
            // counter
            int x = 0;
            
            for (int i = 0 ; i < cipherText.length() ; i++)
            {
                if (ch == cipherText.charAt(i))
                {
                    x++;
                }
            }
            
    
            if (x != 0)
            {
                    System.out.println(ch + "\t" + "\t" + x);
            }
        }
        return null;
    }
}