# Ann Sam
# RC4

MOD = 256
    
# KSA
# used to initialize the permutation in the array "S".
def ksa(key):
    """ Key Scheduling Algorithm """
    key_length = len(key)
    # create the array "S"
    S = list(range(MOD))  # [0,1,2, ... , 255]
    j = 0
    for i in range(MOD):
        j = (j + S[i] + key[i % key_length]) % MOD
        # swap values
        S[i], S[j] = S[j], S[i]  

    return S

# PRGA
# modifies the state and outputs a byte of the keystream
def prga(S):
    """ Pseudo Random Generation Algorithm """
    i = 0
    j = 0
    while True:
        i = (i + 1) % MOD
        j = (j + S[i]) % MOD

         # swap
        S[i], S[j] = S[j], S[i]
        t = (S[i] + S[j]) % MOD
        K = S[t]
        
    return K

def getKeystream(key):
    key = [ord(c) for c in key]

    S = ksa(key)
    keystream = prga(S)
    return keystream

def encrypt(plainText, key):
    getKeystream(key)
    out = []
    for char in plainText:
        out.append("%02X" % (ord(char) ^ next(keystream)))
    
    cipherText="".join(out)

    return cipherText

def decrypt(cipherText, key):
    cipherText = cipherText.decode('base64')
    out = []
    getKeystream(key)

    for char in cipherText:
        out.append("%02X" % (ord(char) ^ next(keystream)))

    cipher_hex = ''.join(out)

    return cipher_hex

def main():
    """ test """
    key = "Key"
    plainText = "Plaintext"

  # Ann Sam
# RC4

MOD = 256
    
# KSA
# used to initialize the permutation in the array "S".
def ksa(key):
    """ Key Scheduling Algorithm """
    key_length = len(key)
    # create the array "S"
    S = list(range(MOD))  # [0,1,2, ... , 255]
    j = 0
    for i in range(MOD):
        j = (j + S[i] + key[i % key_length]) % MOD
        # swap values
        S[i], S[j] = S[j], S[i]  

    return S

# PRGA
# modifies the state and outputs a byte of the keystream
def prga(S):
    """ Pseudo Random Generation Algorithm """
    i = 0
    j = 0
    while True:
        i = (i + 1) % MOD
        j = (j + S[i]) % MOD

         # swap
        S[i], S[j] = S[j], S[i]
        t = (S[i] + S[j]) % MOD
        K = S[t]
        
    return K

def getKeystream(key):
    key = [ord(c) for c in key]

    S = ksa(key)
    keystream = prga(S)
    return keystream

def encrypt(plainText, key):
    getKeystream(key)
    out = []
    for char in plainText:
        out.append("%02X" % (ord(char) ^ next(keystream)))
    
    cipherText="".join(out)

    return cipherText

def decrypt(cipherText, key):
    cipherText = cipherText.decode('base64')
    out = []
    getKeystream(key)

    for char in cipherText:
        out.append("%02X" % (ord(char) ^ next(keystream)))

    cipher_hex = ''.join(out)

    return cipher_hex

def main():
    """ test """
    key = "Key"
    plainText = "Plaintext"

    if encrypt("Plaintext", "Key") == "BBF316E8D940AF0AD3":
        print("Yay!")
    else:
        print("Oh no :(")

    if decrypt("BBF316E8D940AF0AD3", "Key") == "Plaintext":
        print("Yay!")
    else:
        print("Oh no :(")
    

 if __name__ == '__main__':
     main()



