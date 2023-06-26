# BallCollisionGame

at src/
to COMPILE : javac Main.java
to RUN : java Main board.txt move.txt

Before starting the game, prepare a move.txt file and a board.txt, or use existing files. ( There are one in the src file )
If you examine the existing files, you will understand the purposes of the files, so you can easily prepare the contents of the files you want.

The goal of the game is to collect points without falling into the hole, each letter in the board.txt file actually represents a colored ball (your ball is represented by a * )
If your ball collides with black, yellow and red balls, you will earn points. 
If he falls into the Hole represented by the letter H, the game ends. 
The letter W represents the Wall, if your ball hits the wall, your ball bounces back two steps from the wall.

If you run the code, it gives you a file named output.txt. It shows the result of each of your movements in the move.txt file to this file one by one by printing the board. You can also see your total paun at the end of the file. 
To learn more in detail, you can read the pdf of the assignment BBM104_23_AS1 prepared by our teacher. 
