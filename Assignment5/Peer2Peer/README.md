# Activity Distributed Algorithm: Sorting 
Assignment 5

### Description:
This program functions as a group chat that enables the creation of multiple users who can communicate with each other in a shared chat. The screencast provides instructions on how to operate the program, including the ability to chat with multiple users simultaneously. Furthermore, the chat feature remains stable even when one user exits the chat.

### How to run it

- cd Project5/Peer2Peer/
- 1st user: gradle runPeer --args "A 7000" --console=plain -q
- 2nd user: gradle runPeer --args "B 7001 7000" --console=plain -q
- 3rd user: gradle runPeer --args "C 7002 7000" --console=plain -q

