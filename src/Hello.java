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

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100){
            //&& the logical and operator , it requires the operands on both sides of the operator to be true
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
