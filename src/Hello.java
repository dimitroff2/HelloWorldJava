public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Brandi");
        //println adds a blank line after printing the text
        boolean isAlien = false;
        //  single = is assignment operator sets the value of the expression
        if (isAlien == false) {
            /*
             == equality  operator test to see if two operands are considered equal and returns boolean value
            if statement does not have a semicolon because the statement is spanning two lines
            when semicolon is placed after the if statement it makes that print statement no longer depend on it so it will print code regardless
            */
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            //&& the logical AND operator , it requires the operands on both sides of the operator to be true
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90 ) || (secondTopScore <= 90)){
            //|| the logical OR operator, it requires the operands on one side of the operator to be true
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        //if (newValue = 50)
        if (newValue == 50) {
            /* using a single = is the assignment operator instead of the equals to operator ==
            We arent assigning a value here we want to test of the two values equal each other
            */
            System.out.println("This is an error");
        }
        boolean isCar = false;
        if (!isCar) {
            /*instead of doing (isCar == True) can use (isCar) as a shortcut to see if it checks as true
            //putting ! in front of isCar checks to see if it is false (!isCar)
            another way to think of !isCar is it returns the opposite of isCar
            ! is the NOT operator
             */
            System.out.println("This is not suppose to happen");
        }
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        /*
        On the second line we are using the ternary operator and thus three operands
        First operand is the condition or expressing were testing and should evaluate to true or false outcome
        second operand will be assigned in the value is false
        Third operand is assigned if the expression is true
        Ternary is a shortcut for if-then-else
         */
        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        //isDomestic true print first option if not print second
            System.out.println(s);
    }
}
