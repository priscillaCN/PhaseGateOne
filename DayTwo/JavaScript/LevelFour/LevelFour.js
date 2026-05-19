function addNumbers(numberOne, numberTwo) {

        return numberOne + numberTwo;
    }



function isEvenNumber(number) {

        if(number % 2 == 0 )
            return true;

        return false;

    }


 function squareNumber(number) {

        return number * 2;

    }


function convertTemp(celsius) {

        let toFahrenheit = (celsius * 9 / 5) + 32;

        return toFahrenheit;

    }


function isPrime(number) {
        
        if (number < 2)
            return false;

        for(let count = 2; count < number; count++) {

            if (number % count == 0)
                return false;
        }
    
        return true;
}


function largestNumber(numberOne, numberTwo, numberThree) {

        let largest = numberOne;

        if(numberTwo > largest && numberTwo > numberThree)
            return numberTwo;

        else if(numberThree > largest && numberThree > numberTwo)
            return numberThree;

        else
            return largest;

    }


function simpleInterest (principal, rate, time) {

       return ((principal * rate * time) / 100);
    }



function areaOfRectangle (width, length) {

        return length * width;  
    }


function reverseNumber ( number) {

        while (number != 0) {
            let lastDigit = number % 10;
            number = number / 10;
            System.out.print(lastDigit);
        }

    }

let number = 20;
let int numberOne = 45;
let numberTwo = 27;
let numberThree = 60;
let celsius = 45
let principal = 5000;
let rate = 1.6;
let time = 3;
let width = 12;
let length = 15;

let add = addNumbers(numberOne, numberTwo);
console.log("sum is: " + add);

let even = isEvenNumber(number);
console.log("is number an even number? " + even);

let square = squareNumber(number);
console.log("The square is: " + square);


let fahrenheit = convertTemp(celsius);
console.log(fahrenheit + "fahrenheit");
            

let prime = isPrime(number);
console.log("is number a prime number? " + prime);

let getLargest = largestNumber(numberOne, numberTwo, numberThree);
console.log("The largest number is " + getLargest);

let interest = simpleInterest (principal, rate, time);
console.log("The simple interest is " + interest);

let area = areaOfRectangle (width, length);
console.log("The area is " + area);
        


