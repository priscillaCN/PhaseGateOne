const prompt = require("prompt-sync")()

let numberOne = Number(prompt("Enter first number: "))

let numberTwo = Number(prompt("Enter second number: "))

let numberThree = Number(prompt("Enter third number: "))

let largest = numberOne;

if(numberTwo > numberOne && numberTwo > numberThree)
    largest =numberTwo;

if(numberThree > numberOne && numberThree > numberTwo)
    largest =numberThree;

console.log("The largest number is: " + largest);
