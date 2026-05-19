const prompt = require("prompt-sync")()

let number = Number(prompt("Enter any number: "))

let message;

    if(number % 2 == 0) 
        message = "number is even";
    else
        message = "number is odd";

console.log(message);
