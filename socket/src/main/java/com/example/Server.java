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
            } else if("withdraw".equals(commandAndParam[0])) {
                balance = banking.withdraw(Integer.parseInt(commandAndParam[1]));
            }
            
            pw.println("balance:" + balance);
            pw.flush();
        }
    }
}
*/

// 싱글톤 패턴
// Chapter .1
// - 멀티 스레드로 동작하도록 코드 변경 : 여러 곳이 접근 가능하기 위함
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

        while(true) {

            final Socket socket = server.accept();

            new Thread() {
                @Override
                public void run() {
                    System.out.println("A Client connected");
                    final ServerBanking banking = new ServerBanking();

                    try {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintWriter pw;

                        pw = new PrintWriter(socket.getOutputStream());

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
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
*/



// Chapter .2
// - 서버의 잔고는 계속적으로 하나의 값으로 유지 되어야 합니다.
// - while(true) 내부에서 지속적으로 생성되던 final ServerBanking banking = new ServerBanking();를 한 번만 생성되게끔 변경해줍니다.
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

        final ServerBanking banking = new ServerBanking();

        while(true) {

            final Socket socket = server.accept();

            new Thread() {
                @Override
                public void run() {
                    System.out.println("A Client connected");
                    
                    try {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintWriter pw;

                        pw = new PrintWriter(socket.getOutputStream());

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
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
*/



// Chapter .3
/*
package com.example;

import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main( String[] args ) throws Exception
    {
        ServerSocket server = new ServerSocket(9090); // portNumber 9090

        System.out.println("Waiting for client");

        final ServerBanking banking = new ServerBanking();

        while(true) {

            final Socket socket = server.accept();

            // ClientHandler.java에서 분리시킨 socketm banking 클래스 사용 방법
            new ClientHandler(socket, banking).start();
        }
    }
}
*/

// Chapter .4
// ServerBanking을 하나만 존재하게 하기 위한 코드
/*
package com.example;

import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main( String[] args ) throws Exception
    {
        ServerSocket server = new ServerSocket(9090); // portNumber 9090

        System.out.println( "Waiting for client" );

        while(true) {
            final Socket socket = server.accept();

            new ClientHandler(socket).start();
        }
    }
}
*/


// 뱅킹 서버 프록시 패턴
// Chapter .1, 2
/*
package com.example;

import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main( String[] args ) throws Exception
    {
        ServerSocket server = new ServerSocket(9090); // portNumber 9090

        System.out.println( "Waiting for client" );

        while(true) {
            final Socket socket = server.accept();

            new ClientHandler(socket).start();
        }
    }
}
*/




