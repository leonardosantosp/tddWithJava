import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class calculadoraTest {
    private calculadora calculator;
    @BeforeEach
    void setup(){
        calculator = new calculadora();
    }

    /*ADD*/
    @Test
    @DisplayName("Add > when both number are positive > return a positive number")
    void addWhenBothNumbersArePositiveReturnAPositiveNumber(){
        int result = calculator.add(3,4);
        //se result == 7
        Assertions.assertEquals(7,result);
    }

    @Test
    @DisplayName("Add > when both number are negative > return a negative number")
    void addWhenBothNumbersAreNegativeReturnANegativeNumber(){
        int result = calculator.add(-3,-4);
        Assertions.assertEquals(-7,result);
    }

    @Test
    @DisplayName("Add > when one number is positive and the another is negative > return a positive number")
    void addWhenOneNumberIsPositiveAndTheAnotherIsNegativeReturnAPositiveNumber(){
        int result = calculator.add(-3,4);
        Assertions.assertEquals(1,result);
    }

    @Test
    @DisplayName("Add > when one number is positive and the another is negative > return a negative number")
    void addWhenOneNumberIsNegativeAndTheAnotherIsPositiveReturnANegativeNumber(){
        int result = calculator.add(3,-4);
        Assertions.assertEquals(-1,result);
    }

    @Test
    @DisplayName("Add > when one number is zero > return the given number")
    void addWhenOneNumberIsZeroReturnTheGivenNumber(){
        int result = calculator.add(3,0);
        int secondResult = calculator.add(0,4);
        Assertions.assertAll(
                () -> Assertions.assertEquals(3,result),
                ()-> Assertions.assertEquals(4,secondResult)
        );
    }

    @Test
    @DisplayName("Add > when one number is negative and the another is zero > return the given number")
    void addWhenOneNumberIsNegativeAndTheAnotherIsZeroReturnTheGivenNumber(){
        int result = calculator.add(-3,0);
        int secondResult = calculator.add(0,-4);
        Assertions.assertAll(
                () -> Assertions.assertEquals(-3,result),
                ()-> Assertions.assertEquals(-4,secondResult)
        );
    }

    @Test
    @DisplayName("Add > when both numbers are zero > return zero")
    void addWhenBothNumbersAreZeroReturnZero(){
        int result = calculator.add(0,0);
        Assertions.assertEquals(0,result);
    }
    /*DIVISION*/
    @Test
    @DisplayName("#Divide > When the divider is zero > Throw an exception")
    void divideWhenTheDividerIzZeroThrowAnException(){
        Assertions.assertThrows(ArithmeticException.class, ()-> {
            calculator.divide(5,0);
        });
    }

    @Test
    @DisplayName("#Divide > When both numbers are positive >  return a int number")
    void divideWhenBothNumbersArePositiveReturnAIntNumber(){
             int result = calculator.divide(6,3);
            Assertions.assertEquals(2,result);

    }

    @Test
    @DisplayName("#Divide > When both numbers are negative >  return a int number")
    void divideWhenBothNumbersAreNegativeReturnAIntNumber(){
        int result = calculator.divide(-6,-3);
        Assertions.assertEquals(2,result);

    }

    @Test
    @DisplayName("#Divide >  when one number is positive and the another is negative >  return a  negative int number")
    void divideWhenOneNumberIsPositiveAndTheAnotherIsNegativeReturnANegativeIntNumber(){
        int result = calculator.divide(6,-3);
        Assertions.assertEquals(-2,result);
    }

    @Test
    @DisplayName("#Divide >  when one number is Negative and the another is Positive >  return a  negative int number")
    void divideWhenOneNumberIsnegativeAndTheAnotherIsNegativeReturnANegativeIntNumber(){
        int result = calculator.divide(-6,3);
        Assertions.assertEquals(-2,result);
    }

    @Test
    @DisplayName("#Divide > divide when division result is float >  return a  int number")
    void divideWhenDivisionResultIsFloatReturnAIntNumber(){
        int result = calculator.divide(5,2);
        int secondResult = calculator.divide(2,5);
        Assertions.assertAll(
                () -> Assertions.assertEquals(2,result),
                ()-> Assertions.assertEquals(0,secondResult)
        );
    }

    @Test
    @DisplayName("#Divide > divide when division result is float >  return a  negative int number")
    void divideWhenDivisionResultIsFloatReturnANegativeIntNumber(){
        int result = calculator.divide(-5,2);
        int secondResult = calculator.divide(-2,5);
        Assertions.assertAll(
                () -> Assertions.assertEquals(-2,result),
                ()-> Assertions.assertEquals(0,secondResult)
        );
    }

    /*MULTIPLICATION*/
    @Test
    @DisplayName("#Multiply > Multiply when one number is zero >  return zero")
    void multiplyWhenOneNumberIsZeroReturnZero(){
        int result = calculator.multiply(1,0);
        int secondResult = calculator.multiply(0,1);
        Assertions.assertAll(
                () -> Assertions.assertEquals(0,result),
                ()-> Assertions.assertEquals(0,secondResult)
        );
    }

    @Test
    @DisplayName("#Multiply > when one number is Negative and the another is Positive >  return a negative number")
    void multiplyWhenOneNumberIsNegativeAndTheAnotherIsPositiveReturnZero(){
        int result = calculator.multiply(-1,3);
        int secondResult = calculator.multiply(1,-3);
        Assertions.assertAll(
                () -> Assertions.assertEquals(-3,result),
                ()-> Assertions.assertEquals(-3,secondResult)
        );
    }

    @Test
    @DisplayName("#Multiply > when both number are Positive >  return a negative number")
    void multiplyWhenBothNumberArePositiveReturnANegativeNumber(){
        int result = calculator.multiply(-1,3);
        int secondResult = calculator.multiply(1,-3);
        Assertions.assertAll(
                () -> Assertions.assertEquals(-3,result),
                ()-> Assertions.assertEquals(-3,secondResult)
        );
    }

    @Test
    @DisplayName("#Multiply > when both number are Negative >  return a positive number")
    void multiplyWhenBothNumberAreNegativeReturnAPositiveNumber(){
        int result = calculator.multiply(-1,-3);
        Assertions.assertEquals(-3,result);

    }

}
