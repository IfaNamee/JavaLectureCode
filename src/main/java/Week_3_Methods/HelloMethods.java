package Week_3_Methods;

import static input.InputUtils.stringInput;

public class HelloMethods {

    public static void main(String[] args) {
        String name = stringInput("Enter your name: ");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    }

    public static String makeGreeting(String n){
        //  The "public static" keyword is an access modifier that indicates that the method can
        //be accessed from any other class.

        // The "String" or "int" keyword specifies the return type of the method. In this case,
        // the method returns an integer or String value.

        // The "makeGreeting" is method name can be anything you chose.

        // Arguments (int or string a, int or string b) is the parameter list. It specifies the data type
        // and name of each parameter that the method accepts.

        String greeting = "Hello " + n + '!';
        return greeting;  // return or output message.
    }
}
