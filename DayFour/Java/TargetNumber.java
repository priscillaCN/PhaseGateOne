import java.util.Scanner;
public class TargetNumber {

        public static int [] getTarget(int target, Scanner collectInput) {

        target = 0;
        int [] numbers = new int [99];
        int count = 0;
        
            for(int index = 0; index < numbers.length; index++) {

                for(int indexB = index + 1; indexB < numbers.length; indexB++) {

                    if(numbers[index] + numbers[indexB] == target) {
                        count = 2;
                            break;
                    }
                }

            } 

        int [] newArray = new int [count];

            for(int index = 0; index < count; index++) {

                for(int indexB = index + 1; indexB < count; indexB++) {

                    if(numbers[index] + numbers[indexB] == target)
                        newArray[0] = numbers[index]; 
                        newArray[1] = numbers[indexB];
            
                }

        } 
         return newArray;
    }




    public static int [] removeDuplicates (int [] numbers) {

        numbers = new int [8];

         for(int index = 0; index < numbers.length; index++) {

                for(int indexB = index + 1; indexB < numbers.length - 1; indexB++) {

                    if(numbers[index] == numbers[indexB])
                        numbers[indexB] = -1;
                }

            } 

        int count = 0;

        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] != -1);
                count += 1;

        }

        int [] noDuplicates = new int [count];

        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] != -1);
                noDuplicates[index] = numbers[index];
            }
           
        return noDuplicates;

    }


    public static int [] smallestToLargestCount (int [] numbers) {

        numbers = new int [6];
        int temp = 0;

        int smallest = 0;

        int largest = 0;

        for(int index = 0; index < numbers.length; index++) {

           for(int indexB = index + 1; indexB < numbers.length; indexB++) {

                    if(numbers[index] < numbers[indexB]) 
                        smallest = numbers[index];
                        
                    else
                        smallest = numbers[indexB];
                         

        }

        }

        return smallest;


         for(int index = 0; index < numbers.length; index++) {

           for(int indexB = index + 1; indexB < numbers.length; indexB++) {

                    if(numbers[index] > numbers[indexB]) 
                        largest = numbers[index];
                        
                    else
                        largest = numbers[indexB];

            }

        }

        return largest;
                         


        
        int arrayLength = largest - smallest;
        int [] newArray = new int [arrayLength];
        int count = 0;

        for (int index = smallest; index <= largest; index++) {
            newArray[count] = index;
                count += 1;

        }

        return newArray;
        

    }



    public static String [] SortWords (String [] words) {

    words = new String [3];

    



    }


}
