const prompt = require("prompt-sync")()

let score = Number(prompt("Enter your score: "))

let message;

    if(score >= 50) 
        message = "Pass";
    else
        message = "Fail";

console.log(message);
