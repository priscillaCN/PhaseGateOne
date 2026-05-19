const prompt = require("prompt-sync")()

let length = Number(prompt("Enter length of rectangle: "))

let width = Number(prompt("Enter width of rectangle: "))

let area = length * width;

console.log("The area is: " + area);
