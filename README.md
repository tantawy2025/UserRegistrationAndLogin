# User Authentication

User firstly register to the system to give information about him/her, so he enters registeration information so he can login at any time with username and password.


## Actors of the system

- user

## Features of the system
- register
- login

## User Class Diagram

![user class diagram](https://github.com/tantawy2025/UserRegistrationAndLogin/assets/35627054/91987f51-f3dc-486e-a133-af43de176703)




### Register user UseCase

#### description & constrains

1- user enter user information

    - email: String
    - password: String
    - firstName: String
    - lastName: String
2- check required fields are not empty

3- email validation 
  
    - string separated into two parts by @ symbol   "personal_info" and a domain.
      ex personal_info@domain
    - The length of the personal_info part may be up to 64 characters long
    - domain name may be up to 253 characters
    - personal_info part contains the following ASCII characters
        > Uppercase (A-Z) and lowercase (a-z) English letters.
        > Digits (0-9).
        > Characters ! # $ % & ' * + - / = ? ^ _ ` { | } ~
        > Character . ( period, dot or fullstop) provided that it is not the first or last character and it will not come one after the other.
    - The domain name [for example com, org, net, in, us, info] part contains letters, digits, hyphens, and dots


4- password validation 

    - at least eight characters,  
    - at least one number
    - at least one lower letter
    - at least one uppercase letter
    - at least one special characters

5- check user email is not exist




####  sequence Diagram

![register User](https://github.com/tantawy2025/UserRegistrationAndLogin/assets/35627054/f40745ce-013b-4b70-b6c2-3479ec0788c2)

####  pseudocode

```

    // Function to handle user registration
    function registerUser(User user):

        boolean isValid = validateUserData(user);
        if isValid = true :
            boolean existUser =validateUserExistance(user);
            if(existUser = false)
                user = EncodeUserPassword(user);
                createNewUser(user)
                notifyUser(user)
                return "Registration successful."
            else
                "user already registered"
        else:
            return "error user data validation exception";
```
```
    function validateUserData(User user):

        // validate all required feilds has value
        validateRequiredFieldsNotNull(user)
        
        // validate Email Signature
        validateStringAgainstRegExp(user.getEmail(), emailRegex);

        // validate password Signature
        validateStringAgainstRegExp(user.getpassword(), passwordRegex);

        return true;

               

```















