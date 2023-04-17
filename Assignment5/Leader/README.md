# Activity: Simplified Concesus Algorithm

## Description:
This program implements the consensus algorithm and involves two bank nodes and a client who inputs data. The client can request a credit of money from either bank node or pay back money owed. The leader manages the requests from the client and calculates the balance of the nodes to decide if they will approve or deny a credit request. The client can make payments to the nodes but cannot exceed the amount owed. Any payment made is divided equally between the two nodes.

## How to run the program: 
- cd Project5/Leader/
- To run leader: gradle leader --console=plain -q
- To run node1: gradle node1 -Pmoney=1000 --console=plain -q
- To run node2: gradle node2 -Pmoney=2000 --console=plain -q
- To run client: gradle client --console=plain -q
