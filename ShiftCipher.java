// Ann Sam
// CSC 381-001
// Assignment 3: Frequency Historgram
// updated for assignment 3


class ShiftCipher
{ 
        // Encrypts text using a shift, s
        // I manually determined that the shift was +24
        
        public static String decrypt(String cipherText, int shift) 
        { 
            // placeholder for plainText string
            String plainText = " ";
            
            // get length from cipherText
            int length = cipherText.length();
            
            // for loop to shift letters of the text
            for (int i = 0; i < length; i++)
            {
                // return char value at given index
                char letter = cipherText.charAt(i);
                
                if (Character.isLetter(letter))
                {
                    // if letter is lower case
                    if (Character.isLowerCase(letter))
                    {
                        char x = (char)(letter + shift);
                        
                        if (x > 'z')
                        {
                            plainText += (char)(letter - (26 - shift));
                        }
                        
                        else
                        {
                            plainText += x;
                        }
                    }
                    
                    // else if letter is upper case
                    else if (Character.isUpperCase(letter))
                    {
                        char x = (char)(letter + shift);
                        
                        if (x > 'Z')
                        {
                            plainText += (char)(letter - (26 - shift));
                        }
                        
                        else
                        {
                            plainText += x;
                        }
                    }
                }
                
                else
                {
                    plainText += letter;
                }  
            }
            
            return plainText;
        }
         

        // test decryption and print out all possibilities, as well as what the plaintext originally is.
        // plaintext is: watchoutforbrutus
        public static void main(String[] args) 
        { 
                String cipherText = "lcllewljazlnnzmvyiylhrmhza"; 
                
                // for loop to print out all outcomes
                for (int i = 1; i <= 25; i++)
                {
                    System.out.println(i + ":" + decrypt(cipherText, i));
                }
                
                System.out.println("The plaintext was: 'eveexpectseggsforbreakfast'");
        } 
} 
