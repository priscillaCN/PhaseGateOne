const prompt = require("prompt-sync")()

let year = Number(prompt("Enter any year: "))

        String message = "";

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            message = "It is a leapyear";
        else  
            message = "It is not a leapyear";

console.log(message);
