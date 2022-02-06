// Ann Sam
// Driver class to call frequency and decrypt programs

public class Driver
{
    public static void main (String[] args)
    {
        String cipherText = "lcllewljazlnnzmvyiylhrmhza";
        
        // call FrequencyHist program first
        FrequencyHist.FrequencyCounter(cipherText);
        
        // the shift is 19
        String plainText = ShiftCipher.decrypt(cipherText, 19);
        
        //the plainText is: eveexpectseggsforbreakfast
        System.out.println("The plaintext was:" + plainText);
    }
}