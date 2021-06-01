import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {
    Maximum findMax = new Maximum();

    //Test Case 1.1
    @Test
    public void givenFirstNumberAsLarge_Return_FirstNumberAsMax() {
        Integer max = findMax.Max(25, 10, 7);
        Assertions.assertEquals((Integer) 25, max);
    }

    //Test Case 1.2
    @Test
    public void givenSecondNumberAsLarge_Return_SecondNumberAsMax() {
        Integer max = findMax.Max(35, 46, 10);
        Assertions.assertEquals((Integer) 46, max);
    }

    //Test case 1.3
    @Test
    public void givenThirdNumberAsLarge_Return_ThirdNumberAsMax() {
        Integer max = findMax.Max(35, 25, 140);
        Assertions.assertEquals((Integer) 140, max);
    }
}

