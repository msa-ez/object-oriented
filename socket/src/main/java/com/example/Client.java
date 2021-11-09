// Chapter .3 - 클라이언트 만들기
/*
package com.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client 
{
    public static void main( String[] args ) throws Exception
    {
        Socket client = new Socket("localhost", 9090); // portNumber 9090

        System.out.println("Trying connecting to server");

        InputStream in = client.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
    }
}
*/

// Chapter .4
/*
package com.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client 
{
    public static void main( String[] args ) throws Exception
    {
        Socket client = new Socket("localhost", 9090); // portNumber 9090

        System.out.println("Trying connecting to server");

        InputStream in = client.getInputStream();

        PrintWriter pw = new PrintWriter(client.getOutputStream());
        pw.println("deposit:100");
        pw.flush();


        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        System.out.println(reader.readLine()); // balance 100, 200, 300

        client.close();
    }
}
*/