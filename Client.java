/*
 * Use BufferedReader since DataInputStream is depreciated!
 */
import java.net.*;
import java.io.*;


// program for client
public class Client {
    
    // initialize socket and input output streams
    private Socket socket = null;
    private BufferedReader input = null;
    private DataOutputStream out = null;


    // constructor to put in address and port
    public Client(String address, int port) {

        // establish a connection
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            // take input from terminal
            input = new BufferedReader(new InputStreamReader(System.in));

            // sends output to the socket
            out = new DataOutputStream(socket.getOutputStream());

        // 
        } catch (UnknownHostException u) {
            System.out.println(u);
        }
        catch (IOException i) {
            System.out.println(i);
        }

        // string to read message from input
        String line = "";

        // keep reading until "Over" is input
        while(!line.equals("Over")) {
            
            try {
                // reading lines
                line = input.readLine();
                out.writeUTF(line);
            } catch (IOException i) {
                System.out.println(i);
            }
        }

        // close connectiono
        try{
            input.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Client client = new Client("127.0.01", 5000);
    }
}