/**
 * Created by cbadhrinath on 29/07/16.
 */

/**
 * Always the member variables and initialiser code blocks are executed in the order in which they appear in the file.
 * Then the constructor is executed at last
 */
public class InitialiserExample {

    public InitialiserExample() {
        name = "Badhrinath Canessane";
    }
    String name = "Badhrinath";  //Member Variables

    {name = "Canessane";} //Initialiser code blocks

    public static void main(String[] args) {
        System.out.print(new InitialiserExample().name);
    }

}
