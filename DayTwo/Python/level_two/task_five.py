number_one = int(input("Enter first number: "))

number_two = int(input("Enter second number: "))

number_three = int(input("Enter third number: "))

largest = number_one

if number_two > number_one and number_two > number_three:
    largest = number_two

if number_three > number_one and number_three > number_two:
    largest = number_three

print("The largesr number is:", largest)
