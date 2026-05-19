const prompt = require("prompt-sync")()

let number = Number(prompt("Enter a number"))
let sum = 0;

for(let count = 1; count <= number; count++) {
    sum += count;
}

console.log("The sum of " + number + " is: " + sum);
