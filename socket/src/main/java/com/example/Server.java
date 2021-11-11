// Chapter .3 - 클라이언트 만들기
/*
package com.example;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
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

// Chapter .4
/*
package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main( String[] args ) throws Exception
    {
        ServerSocket server = new ServerSocket(9090); // portNumber 9090

        System.out.println("Waiting for client");

        int balance = 0;

        while(true) {
            Socket socket = server.accept();

            System.out.println("A Client connected");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());

            String depositCommend = reader.readLine();
            String commandAndParam[] = depositCommend.split(":");

            if("deposit".equals(commandAndParam[0])) {
                balance = balance + Integer.parseInt(commandAndParam[1]);
            }
            pw.println("balance:" + balance);
            pw.flush();
        }
    }
}
*/



// 뱅킹 서비스 완성하기
// Chapter .1, 2
/*
package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main( String[] args ) throws Exception
    {
        ServerSocket server = new ServerSocket(9090); // portNumber 9090

        System.out.println("Waiting for client");

        ServerBanking banking = new ServerBanking();

        while(true) {
            Socket socket = server.accept();

            System.out.println("A Client connected");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());

            String depositCommend = reader.readLine();
            String commandAndParam[] = depositCommend.split(":");

            int balance = 0;
            if("deposit".equals(commandAndParam[0])) {
                balance = banking.deposit(Integer.parseInt(commandAndParam[1]));
            }
            
            pw.println("balance:" + balance);
            pw.flush();
        }
    }
}
*/



// Chapter .3
package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main( String[] args ) throws Exception
    {
        ServerSocket server = new ServerSocket(9090); // portNumber 9090

        System.out.println("Waiting for client");

        ServerBanking banking = new ServerBanking();

        while(true) {
            Socket socket = server.accept();

            System.out.println("A Client connected");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());

            String depositCommend = reader.readLine();
            String commandAndParam[] = depositCommend.split(":");

            int balance = 0;
            if("deposit".equals(commandAndParam[0])) {
                balance = banking.deposit(Integer.parseInt(commandAndParam[1]));
            } else if("withdraw".equals(commandAndParam[0])) {
                balance = banking.withdraw(Integer.parseInt(commandAndParam[1]));
            }
            
            pw.println("balance:" + balance);
            pw.flush();
        }
    }
}

