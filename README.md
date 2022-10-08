# Java-Socket-Programming

This is showing connection between client side and server side by establishing a connection through socket.


## How it works ##

This is a very basic one-way Client and Server setup where a Client connects, sends messages to the server and the server shows them using a socket connection. 
There’s a lot of low-level stuff that needs to happen for these things to work but the Java API networking package (java.net) takes care of all of that, making network programming alot easier.

#### **<div align = "center">Client Side Programming </div>**
**Establishing a socket connection**
> A socket connection means that two machines have information about each others netork location (IP address) and TCP port. Using the java.net.Socket class represents a socket. To open the port:

<div align="center">Socket socket = new Socket(“127.0.0.1”, 5000)</div>
- First arguement - (**IP address of server**). ("127.0.0.1"  is the IP address of localhost, where code will run on the single stand-alone machine)
- Second arguement - (**TCP port**). (Just a number representing which application to run on a server. For example, HTTP runs on port 80. The port number can be from 0 to 65535)

**Communication between sockets**
To communicate over a socket connection, streams are used for both input and output of data.

**Closing the Connection**
The socket connection is closed explicitly once the message or whatever function it was sent out to do to the server is complete.
In this program, the Client keeps reading input from a user and sends it to the server until “Over” is typed. (You can use any keyword to substitute "Over").


## Prerequisites ##

Understanding how to use java's classes, and libraries.

## Technology Stack ##

- Java

The use of java's io, net, and util library was necessary in order to create this.


## Contact Me ##

- marcuschau8786@gmail.com
- LinkedIn : [marcuschau/LinkedIn](https://www.linkedin.com/in/marcus-chau-b88878221/)
- Personal Website : [Marcus Chau](https://marcuschau.com/)

