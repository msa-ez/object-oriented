// Chapter .1
/*
package com.example;

import java.net.ServerSocket;
import java.net.Socket;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ServerSocket server = new ServerSocket(9090); // portNumber 9090

        System.out.println("Waiting for client");

        server.accept();

        System.out.println("A Client connected");
    }
}
*/

// Chapter .2
// Socket programming 기본 개념
/*
package com.example;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ServerSocket server = new ServerSocket(9090); // portNumber 9090

        System.out.println("Waiting for client");

        while(true) {
            Socket socket = server.accept();

            System.out.println("A Client connected");

            PrintWriter pw = new PrintWriter(socket.getOutputStream());

            pw.println("HTTP/1.1 200 OK");
            pw.println("Date: Wed, 6 Oct 2021 23:22:22 GMT");
            pw.println("Content-Type: text/html");
            pw.println("Content-Length: 3");
            pw.println();
            pw.println("ABC");
            pw.flush();
        }
    }
}
*/
