import random
randNumber = random.randint(1, 100)
userGuess = None
guesses = 0

# Logic

if(guesses<hiscore):
    print("You have just broken the high score!")
    with open("hiscore.txt", "w") as f:
        f.write(str(guesses))