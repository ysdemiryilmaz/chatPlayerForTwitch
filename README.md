# chatPlayerForTwitch

To enable to make your game to play by watchers while you are broadcasting, you have to use Chatty Twitch Chat Client (https://github.com/chatty/chatty) by adding this package  into it. 

To use this package you must add below lines to Chatlog class in chatty.util.chatlog after adding package to Chatty;

// insert the line bottom of the import lines to import package 

...
import (YOUR_PATH_TO_PACKAGE).keyPress.ysd.Keyboard;
...

// insert the line before "writeLine" function in "public void message" 

...
Keyboard.keyPress(name, message);
...

and use it :)

PS: MAKE SURE THE MOUSE'S FOCUS IS ON THE GAME.



***** Commands in chat for play the game; *****

            #IN CHAT        #IN GAME
          |    UP      |  up arrow key
          |   DOWN     | down arrow key
          |   RIGHT    | right arrow key
          |   LEFT     | left arrow key
          |    A       |      Z
          |    B       |      X
          |    L       |      A
          |    R       |      S
          |  SELECT    |      O
          |  START     |  enter key
