def extractSecretMessage(Str, Sub): 
    Str= Str.replace(Sub,"")     
    return Str.strip() 
Str = input("")
Sub = input("")
print(extractSecretMessage(Str, Sub)) 