number = int(input("Enter a number"))

factorial = 1

for count in range(number, 0):
    factorial *= count
    print("The factorial of ", number, " is: ", factorial)
