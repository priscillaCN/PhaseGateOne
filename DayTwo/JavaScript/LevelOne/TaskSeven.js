const prompt = require("prompt-sync")()

let radius = Number(prompt("Enter radius of circle: "))

let pi = 3.14;

let circumference = 2 * pi * radius;

console.log("The circumference is: " + circumference);
