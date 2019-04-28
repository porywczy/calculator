package pl.edu.agh.mwo.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int result;
        System.out.println( "Hello World!" );
        Calculator calc = new Calculator();
        result = calc.sum(2,3);
        System.out.println(result);
    }
}
