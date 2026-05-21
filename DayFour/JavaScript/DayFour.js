function getTarget(target) {

target = 0;
const numbers = []
let count = 0;
        
    for(int index = 0; index < numbers.length; index++) {

        for(int indexB = index + 1; indexB < numbers.length; indexB++) {

            if(numbers[index] + numbers[indexB] == target) {
                count = 2;
                    break;
            }
        }

    } 

   numbers = [count];

        for(int index = 0; index < count; index++) {

            for(int indexB = index + 1; indexB < count; indexB++) {

                if(numbers[index] + numbers[indexB] == target)
                        numbers[0] = numbers[index]; 
                        numbers[1] = numbers[indexB];
            
                }

        } 
         return numbers;
    }


function removeDuplicates (numbers) {

    numbers = [];

    for(let index = 0; index < numbers.length; index++) {

        for(let indexB = index + 1; indexB < numbers.length - 1; indexB++) {

            if(numbers[index] == numbers[indexB])
                numbers[indexB] = -1;

             }

         } 

        int count = 0;

        for(let index = 0; index < numbers.length; index++) {
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

        for(int index = 0; index < numbers.length; index++) {

           for(int indexB = index + 1; indexB < numbers.length; indexB++) {

                    if(numbers[index] > numbers[indexB]) {
                        temp = numbers[index];
                        numbers[index] = numbers[indexB];
                        numbers[indexB] = temp;
                        
                    }
                        
                } 

        }
        int arrayLength = (numbers[5] - numbers[0]);
        int [] newArray = new int [arrayLength];
        int count = 0;

        for (int index = numbers[0]; index <= numbers[5]; index++) {
            newArray[count] = index;
                count += 1;

        }

        return newArray;
        

    }


    modules.export [getTarget]
