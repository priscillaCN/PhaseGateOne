const prompt = require("prompt-sync")()

let numberOne = Number(prompt("Enter first number: "))

let numberTwo = Number(prompt("Enter second number: "))

let largest = numberOne;

if(numberTwo > numberOne)
    largest =numberTwo

console.log("The largest number is: " + largest);
