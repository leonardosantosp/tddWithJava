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
        Assertions.assertThrows(ArithmeticException.class, ()-> {
            calculator.divide(5,0);
        });
    }

}
