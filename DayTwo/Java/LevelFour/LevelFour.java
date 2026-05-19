public class LevelFour {

    public static int addNumbers(int numberOne, int numberTwo) {

        return numberOne + numberTwo;
    }



    public static boolean isEvenNumber(int number) {

        if(number % 2 == 0 )
            return true;

        return false;

    }


    public static squareNumber(int number) {

        return number * 2;

    }


    public static int convertTemp(int celsius) {

        int toFahrenheit = (celsius * 9 / 5) + 32;

        return toFahrenheit;

    }


    public static boolean isPrime(int number) {
        
        if (number < 2)
            return false;

        for(int count = 2; count < number; count++) {

            if (number % count == 0)
                return false;
        }
    
        return true;
}


    public static int largestNumber(int numberOne, int numberTwo, int numberThree) {

        int largest = numberOne;

        if(numberTwo > largest && numberTwo > numberThree)
            return numberTwo;

        else if(numberThree > largest && numberThree > numberTwo)
            return numberThree;

        else
            return largest;

    }


    public static int simpleInterest (int principal, int rate, int time) {

       return ((principal * rate * time) / 100);
    }



    public static int areaOfRectangle (int width, int length) {

        return length * width;  
    }


    public void reverseNumber (int number) {

        while (number != 0) {
            int lastDigit = number % 10;
            number = number / 10;
            System.out.print(lastDigit);
        }

    }

    
    


    public static void main(String[] args) {

        int number = 20;
        int numberOne = 45;
        int numberTwo = 27;
        int numberThree = 60;
        int celsius = 45
        int principal = 5000;
        int rate = 1.6;
        int time = 3;
        int width = 12;
        int length = 15;

        int add = addNumbers(numberOne, numberTwo);
        System.out.println("sum is: " + add);

        boolean even = isEvenNumber(number);
        System.out.println("is number an even number? " + even);

        int square = squareNumber(number);
        System.out.println("The square is: " + square);

        int fahrenheit = convertTemp(celsius);
        System.out.println(fahrenheit + "fahrenheit");         

        boolean prime = isPrime(number);
        System.out.println("is number a prime number? " + prime);

        int getLargest = largestNumber(numberOne, numberTwo, numberThree);
        System.out.println("The largest number is " + getLargest);

        int interest = simpleInterest (principal, rate, time);
        System.out.println("The simple interest is " + interest);

        int area = areaOfRectangle (width, length);
        System.out.println("The area is " + area);

        reverseNumber(number);
        
    }

}
