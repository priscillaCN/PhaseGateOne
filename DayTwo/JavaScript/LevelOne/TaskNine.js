const prompt = require("prompt-sync")()

let price = Number(prompt("Enter price of item: "))

let taxAmount = price * 0.01;

console.log("The new price is: " + (price + taxAmount));
