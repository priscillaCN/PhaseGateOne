const prompt = require("prompt-sync")()

let numberOne = Number(prompt("Enter first number: "))

let numberTwo = Number(prompt("Enter second number: "))

let numberThree = Number(prompt("Enter third number: "))

let average = (numberOne + numberTwo + numberThree) / 3;

console.log("The average is: " + average);
