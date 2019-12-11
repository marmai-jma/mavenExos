package application;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        String stringToTest ="toto";
        boolean result;

        result = StringUtils.isAllLowerCase(stringToTest) ||
                StringUtils.isAllUpperCase(stringToTest);
        System.out.println(result);





    }
}
