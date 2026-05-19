public class LevelFive {

    public static int [] primeNumbers(int [] numbers) {

        int count = 0;
        int divider = 0;

        for(int index = 0; index < numbers.length; index++) {

            for(divider = 2; divider < numbers[index]; divider++) {

                if(numbers[index] % divider == 0) 
                    count--;
                
                else
                    count++;

            }           

        }

        int [] prime = new int[count];
            for(int index = 0; index < numbers.length; index++) {

                if(numbers[index] % divider == 0)
                    prime[count] = numbers[index];

            return prime;


        }


    }



    int [] replaceNegativeNumbers(int [] numbers) {

        for(int index = 0; index < numbers.length; index++) {

            if(numbers[index] < 0) {

                numbers[index] = 0;
                return numbers[index];

            }
            return numbers;

        }

    }


    int [] moveZeros (int [] numbers) {

        int [] arrayWithzeros = replaceNegativeNumbers(numbers);


       for(int index = 0; index < numbers.length; index++) {

                if(int numbers[index] == 0) 

                numbers[index] = numbers[index + 1];

            }

        return numbers;

        }

    }


}
