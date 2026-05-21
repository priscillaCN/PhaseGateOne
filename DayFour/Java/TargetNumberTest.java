import java.util.Scanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TargetNumberTest {

    @Test
    public void givenGetTarget_whenInputIsAnArrayOf5NumbersAndTargetNumber6_thenExpectedResultIs8AndMinus2() {

    String testInput = "8\n6\n12\n4\n-2";
    Scanner collectInput = new Scanner(testInput);
    int [] numbers = {8, 6, 12, 4, -2};
    int target = 6;
    int [] expectedResult = {8, -2};
    int [] actualResult = TargetNumber.getTarget(6, collectInput);

    assertArrayEquals(expectedResult, actualResult);
    
    }


    @Test
    public void givenGetTarget_whenInputIsAnArrayOf7NumbersAndTargetNumber12_thenExpectedResultIs5And7() {

    String testInput = "1\n2\n5\n7\n6\n8\n9";
    Scanner collectInput = new Scanner(testInput);
    int [] numbers = {1, 2, 5, 7, 6, 8, 9};
    int target = 12;
    int [] expectedResult = {5, 7};
    int [] actualResult = TargetNumber.getTarget(12, collectInput);

    assertArrayEquals(expectedResult, actualResult);
    
    }


    @Test
    public void givenRemoveDuplicates_whenInputIsAnArrayOf8Numbers_thenExpectedResultIsNoDuplicates() {

    int [] numbers = {9, 5, 1, 9, 4, 5, 1, 7};
    int [] expectedResult = {9, 5, 1, 4, 7};
    int [] actualResult = TargetNumber.removeDuplicates(numbers);

    assertArrayEquals(expectedResult, actualResult);
    
    }


    @Test
    public void givenSmallestToLargestCount_whenSmallestNumberIs5_thenExpectedResultIs5() {

    int [] numbers = {14, 9, 6, 5, 8, 10};
    int [] expectedResult = 5;
    int [] actualResult = TargetNumber.smallestToLargestCount(smallest);

    assertArrayEquals(expectedResult, actualResult);
    
    }


    @Test
    public void givenSmallestToLargestCount_whenLargestNumberIs14_thenExpectedResultIs14() {

    int [] numbers = {14, 9, 6, 5, 8, 10};
    int [] expectedResult = 14;
    int [] actualResult = TargetNumber.smallestToLargestCount(largest);

    assertArrayEquals(expectedResult, actualResult);
    
    }


    @Test
    public void givenSmallestToLargestCount_whenInputIsAnArrayOf8Numbers_thenExpectedResultIsNoDuplicates() {

    int [] numbers = {14, 9, 6, 5, 8, 10};
    int [] expectedResult = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int [] actualResult = TargetNumber.smallestToLargestCount(numbers);

    assertArrayEquals(expectedResult, actualResult);
    
    }

}
