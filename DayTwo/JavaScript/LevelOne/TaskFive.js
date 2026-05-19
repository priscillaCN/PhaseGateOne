const prompt = require("prompt-sync")()

let tempInCelsius = Number(prompt("Enter temperature in celsius: "))

let tempInFarenheit = (tempInCelsius * 9 / 5) + 32

console.log("The temperature in Farenheit is: " + tempInFerenheit);
