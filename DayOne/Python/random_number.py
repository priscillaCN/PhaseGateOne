import random

random_number = random.randint(1, 101)

for count in range(1, 6):

    user_guess = int(input("Guess the lucky number: "))

    if user_guess < random_number:
        print("wrong! your guess is too low")

    elif user_guess > random_number and user_guess <= 100:
        print("wrong! your guess is too high")

    elif user_guess > 100:
        print("wrong! your guess is not within range")
        count += -1

    else:
        break;

rating = "";

if random_number == user_guess:

    match(count):
        case 1: rating = "Legendary"
        case 2: rating = "Excellent"
        case 3: rating = "Good"
        case 4: rating = "Good"
        case 5: rating = "Close"
else:
    rating = "Better luck"
            

print("Random number:", random_number)
print("Number of attempts:", count)
print("rating:", rating)







                
