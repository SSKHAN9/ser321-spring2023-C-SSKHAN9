# TCP Picture Guessing Game
	
## Running the example

Running the build.gradle file on the individual folder "tcp" can be done with:
- cd tcp/ 
- `gradle runServer`
- `gradle runClient`
	
b) How to Run:
	Step 1: open cli and navigate to "build.gradle" file path
	Step 2: gradle runServer [Optional -Pport=<custom port value>]
	Step 2: gradle runClient [Optional -Pport=<custom port value> -Phost=<custom ip address>]

c) Sequence Diagram
	!(sequence_diagram.png)

d) Protocol Description
	JSON objects are used to pass data between Server Client.  All JSON objects contain a sequence value witch allows the 
	receiver to confirm the proper sequence and expectation of data.  These objects also contain a datatype which takes validation
	one set further and limits errors from parsing.  Finally, there is the data itself which allows the program to progess.

	d.1) ServerTCP
	nameRequest
	Purpose: To establish the clients required for the game.
	Possible Response: Out of sequence error.

	quantityRequest
	Purpose: To establish the picture count required for the game.
	Possible Response: Errors responses for values other than integers, and an out of sequence error.

	readyRequest
	Purpose: Confirmation for the game to start the timer and send the first image.
	Possible Response: Errors responose for values other than "ready" (not case sensitive), and an out of sequence error.

	image
	Purpose: Send images to the client.
	Possible Response: Errors responos for unknown file path, unable to save image to byte array, and an out of sequence error.

	d.2) ClientGui
	reqName
	Purpose: Respond and send name to the server.
	Possible Response: Out of sequence error.

	reqPicCount
	Purpose: Respond and send picture count to the server.
	Possible Response: Errors responses for values other than integers, and an out of sequence error.

	reqConfig
	Purpose: Respond and send "ready" to the server.
	Possible Response: Errors responose for values other than "ready" (not case sensitive), and an out of sequence error.

	reqGuess
	Purpose: Respond and send guess for the current image send by the server.
	Possible Response: Out of sequence error.
