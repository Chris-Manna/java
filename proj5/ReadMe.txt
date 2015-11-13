------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Project Encoder :D
PURPOSE OF PROJECT: Take the regular or encoded message from a source file 
and properly translate or encode it based on the key word given.
Write a program that uses command line arguments to accept a key word 
and then encrypts or decrypts (decide using a command line option) a 
file using the given key word.
VERSION or DATE: 11/23/11
HOW TO START THIS PROJECT: Accept the key word given from the command 
line arguments. Create a mapping method that coordinates to the 
specifications of the alphabet to the encoded alphabet. Accept the 
message from the source file. Translate the message from regular 
English to the message with encoded alphabet.
(I now see I should have used ASCII code for better style than what 
I did, which was a mapping of the actual characters instead of their 
numerical values).
AUTHOR: Christopher G Manna
USER INSTRUCTIONS: The user is allowed to enter anything as a message, 
including ALL different types of punctuation, numbers and symbols 
and the program will not complain or alter them. Instead,
the characters entered will remain as they are to maintain grammatical 
integrity in the output message, (intentional :D). The message must 
be in all capital letters for it to be encoded or decoded from the 
input.txt file. The message from the input.txt file must ONLY BE
ONE LINE LONG!

Please enter your command line arguments in this fashion:
"java Main -e -k CHRIS input.txt output.txt"
which encodes the input.txt file.
OR
"java Main -d -k CHRIS input.txt output.txt"
which decodes the input.txt file.

CHRIS is used as the keyword to create the new coded alphabet in
this example, BUT, ANY OTHER word can be used as a key word 
in it's place as long as it's written in capital letters.
