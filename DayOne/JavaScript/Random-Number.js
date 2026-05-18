const prompt = require("prompt-sync")();

let randomNumber = Math.random(1, 100);

let count = 0;

let userGuess = 0;

for(count = 1; count <= 5; count ++) {

    userGuess = Number(prompt("Guess the lucky number: "))

    if(userGuess < randomNumber) 
        System.out.println("wrong! your guess is too low");

    else if(userGuess > randomNumber) 
        System.out.println("wrong! your guess is too high");

    else if(userGuess > 100) {
        System.out.println("wrong! your guess is not within range");
            count += -1;
    }

    else
        break;

}
