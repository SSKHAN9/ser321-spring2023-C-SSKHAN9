# Activity: Simplified Concesus Algorithm

## Description:
This program implements the consensus algorithm and involves two bank nodes and a client who inputs data. The client can request a credit of money from either bank node or pay back money owed. The leader manages the requests from the client and calculates the balance of the nodes to decide if they will approve or deny a credit request. The client can make payments to the nodes but cannot exceed the amount owed. Any payment made is divided equally between the two nodes.

## How to run the program: 
- cd Project5/Leader/
- To run leader: gradle leader --console=plain -q
- To run node1: gradle node1 -Pmoney=1000 --console=plain -q
- To run node2: gradle node2 -Pmoney=2000 --console=plain -q
- To run client: gradle client --console=plain -q


## Requirements Met:
1) ✓ You will need a README.md which contains the following (most goes to the protocol):
 - a) A short screencast where you show your project in action and explain everything we need to know about it. (if you do not include a screencast you might loose more      points if we cannot see some of your features)
 - b) Explain your project and which requirements you were able to fulfill.
 - c) Explain your protocol.
2) ✓ Project is well structured and easy to understand.
3) ✓ We want to run the leader node through "gradle leader" with some default port that is set for us, so the client can easily connect to the leader.
4) ✓ We want to start at least two separate nodes through "gradle node1","gradle node2" which should then connect to the leader correctly (let us know in your README.md in which order we will have to start what). It is up to you to
treat the nodes as servers or as clients to the leader – there are pros and cons to
each. You can choose what you like best.
5) ✓ Nodes need to start with initial money, include this in your gradle task with a default value but also let us call it through "gradle node1 -Pmoney=1000", which would then set the start money of the bank to 1000.
6) ✓ The client should start through "gradle client", connecting to the leader
node with which the client can talk.
7) ✓ Leader will ask the Client for their clientID, which should be provided by
the client.
8) ✓ Client will then have the choice between requesting a credit or paying part
of the credit. This should be a client side choice followed by the amount of "credit"
or "payback".
9) ✓ The leader receives the request ("credit", "payback" – or however you want
to call this) with the amount. See below for details on each operation.
10) ✓ Credit
  - a) If the client wants credit, then the leader sends all known nodes the information
that a specific client wants a credit of that amount.
  - b) Nodes will check if that client already has credit with them and if the node
(representing a bank) has enough money available. If the client with that ID
does not have credit with them yet and the bank has at least 150% of what the
client wants available (yes we want the bank to have more than what the client
wants), they respond with a "yes". If that is not the case, they respond with a
"no".
  - c) If the majority of nodes (so if two nodes are connected, both have to answer
yes) say "yes", then the credit is granted to the client.
  - d) The leader will split up the amount as evenly as possible between the nodes
and notify them that this client now has this amount of credit with them. The
nodes will have to persistently save that amount and clientID. The client is
informed that they get the credit and the leader stores the amount persistently
as well.
  - e) Nodes will decrease their available money.
  - f) If the majority vote "no", the client will be informed that they do not get any
credit and the nodes will not decrease their available money.
11) ✓ Pay back
  - a) If the client wants to pay money back, then the leader informs the nodes that
this client wants to pay money back.
  - b) Nodes will check how much the client owes and return how much that clients
owes to them to the leader.
  - c) If the client wants to pay back more than is owed, they will just get an error
message which the leader will send to the client.
  - d) If the client pays back partially or all of their existing credit, the leader will
split up the amount to each node. You can split it up 2/3 1/3 if you like. You
should of course not pay back more than is owed to a node. The nodes will
update their records, the leader will update its records and the client will be
informed about how much debt is still owed.
12) ✓ You should make sure that when a node crashes the whole system does
not go down. If the leader crashes then of course a restart might be needed but the
data should be persistent.
13) ✓ If a restart is needed, the first thing the leader should do is check in with
the nodes and verify their records, e.g. client=1 owes=100 based on leader, node1
says client=1 owes=50, node2 says client=1 owes=20. In this case something went
wrong and you might want to check what happened. Maybe have the leader keep
track of all transactions so you can roll back.
14) ✓ This gets interesting if more than one client can interact with the leader
and make requests. The system will need to make sure it handles them correctly
and the order of transactions is still correct.


