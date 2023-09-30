public class Operators {
    public static void main(String[] args) {
        //java operators
        //Arithmetic Operators
        int addition = 10 + 3 ;
        System.out.println(addition);
        int subtraction = 10 - 3 ;
        System.out.println(subtraction);
        int multiply = 10 * 3 ;
        System.out.println(multiply);
        float division = 10 / 3 ;
        System.out.println(division);
        int modulo = 10 % 3 ;
        System.out.println(modulo);
        //Assignement Operators
        //Post Incriment
        int num = 5 ;
        System.out.println("Post increment : " + (num++));
        System.out.println("Pre increment : " + (++num));
        System.out.println("Post decrement : " + (num--));
        System.out.println("Pre decrement : " + (--num));

        //Arithmetic Operators
        int x = 5 ;
        int y = 8 ;
        System.out.println("+ assignment : " + (x += y )); // x = x+y
        System.out.println("- assignment : " + (x -= y )); // x = x-y
        System.out.println("* assignment : " + (x *= y )); // x = x*y
        System.out.println("/ assignment : " + (x /= y )); // x = x/y

        //Relational operators  --> boolean result
        System.out.println(" Equality    : " + (x == y )); //
        System.out.println(" greater  " + (x > y )); //
        System.out.println(" less : " + (x < y )); //
        System.out.println(" greater  or equal to  : " + (x >= y )); //
        System.out.println(" less  or equal to  : " + (x<= y )); //
        System.out.println(" different   : " + ( x != y )); //


        //Logical operators
        System.out.println(" and operator    : " + ((x == y ) && (x>y))); // And operator true and true --> true
        System.out.println(" or operator    : " + ((x == y ) || (x>y))); // or operator true or false --> false
        System.out.println(" Not     : " + (!(x == y)));  // negation
        //ternary operator
        //shorthand version  of else statement
        boolean isAuthenticated = true ;
        String result = (isAuthenticated) ? "Logged In " : "Verify your crediantials " ;
        System.out.println(result);



        //operator precedence
        int z = 10 + 3 * 2 ;
        System.out.println(z);
        //precedence order
        //postfix x++ x--
        //unary ++x --x
        //multiplicative * / %
        //additive + -
        //relational < > <= >=
        //equality == !=
        //logical AND &&
        //logical OR ||
        //ternary ? :
        //assignment = += -= *= /= %=
        //comma ,











    }
}
