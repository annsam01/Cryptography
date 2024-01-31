// Ann Sam
// Shift Cipher Frequency Histogram
// 1. A program that prints a histogram of the frequencies of the characters that are present in the ciphertext.
// 2. Using frequency analysis, manually decide what the most likely decryption shift is. Once you have done that,
// validate your answer by updating the program written in Decrypt Shift Cipher. 
// 3. A driver program that first calls the frequency analysis program and then calls the decryption program.


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
