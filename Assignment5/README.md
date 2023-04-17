# Project 5: Distributed Algorithms

## Description:
#### Activity: Simplified Concesus Algorithm 
For the first activity, the program uses the consensus algorithm and involves a client who interacts with two bank nodes. The client can request a credit or pay back money owed, and the leader approves or denies the request based on the nodes' balance. Payments made by the client are split equally between the nodes and cannot exceed the amount owed.
#### Activity: Distributed Algorithm Sorting (group chat)
For the second activity, the program allows multiple users to create a group chat where they can communicate. The screencast demonstrates how to run the program and shows the chat in action with multiple users. The chat remains functional even when a user exits the chat.


### How to run the programs
#### Activity: Simplified Concesus Algorithm
- cd Project5/Leader/
- To run leader: gradle leader --console=plain -q
- To run node1: gradle node1 -Pmoney=1000 --console=plain -q
- To run node2: gradle node2 -Pmoney=2000 --console=plain -q
- To run client: gradle client --console=plain -q
#### Activity: Distributed Algorithm Sorting (group chat)
- cd Project5/Peer2Peer/
- 1st user: gradle runPeer --args "A 7000" --console=plain -q
- 2nd user: gradle runPeer --args "B 7001 7000" --console=plain -q
- 3rd user: gradle runPeer --args "C 7002 7000" --console=plain -q
