// 싱글톤 패턴 Chapter .3

package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ClientHandler extends Thread {

    public ClientHandler(Socket socket){
        
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
