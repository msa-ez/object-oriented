// 싱글톤 패턴 Chapter .3
// **스콥에서 접근될 변수들을 ClientHandler 라하는 컨텍스트 내에서 클래스로 분리**
/*
package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread {

    Socket socket;
    IBanking banking;

    public ClientHandler(Socket socket, IBanking banking){
        this.socket = socket;
        this.banking = banking;
    }


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
}
*/



// Chapter. 4
// **싱글톤 패턴이란 하나만 생성되도록 하는 것**
// public => private로 변경 그 어디에서도 외부에 있는 객체에서는 싱글톤 객체를 생성할 수 없고 자기 자신만이 생성 가능하도록 하는 것입니다.
/*
package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread {

    Socket socket;

    public ClientHandler(Socket socket){
        this.socket = socket;
    }


    @Override
    public void run() {
        System.out.println("A Client connected");

        ServerBanking banking = ServerBanking.getInstance();
        
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
}
*/



// 뱅킹 서버 프록시 패턴
// Chapter. 1, 2
/*
package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread {

    Socket socket;

    public ClientHandler(Socket socket){
        this.socket = socket;
    }


    @Override
    public void run() {
        System.out.println("A Client connected");

        IBanking banking = ServerBanking.getInstance();
        
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
}
*/













