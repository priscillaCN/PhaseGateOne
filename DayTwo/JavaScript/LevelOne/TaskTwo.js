const prompt = require("prompt-sync")()

let age = Number(prompt("Enter your age: "))

let futureAge = age + 5;

console.log("you will be " + futureAge + " in 5 years");
