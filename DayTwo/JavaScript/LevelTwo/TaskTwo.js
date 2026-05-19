const prompt = require("prompt-sync")()

let number = Number(prompt("Enter any number: "))

let message;

    if(number % 2 >= 0) 
        message = "number is positive";
    else
        message = "number is negative";

console.log(message);
