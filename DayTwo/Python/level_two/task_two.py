number = int(input("Enter any number: "))

message = ""

if number % 2 >= 0:
    message = "Number is positive"
else:
    message = "Number is negative"

print(message)
