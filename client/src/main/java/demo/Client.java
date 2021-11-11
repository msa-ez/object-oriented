// 뱅킹 서비스 완성하기
//Chpater .1
/*
package demo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client
{
    public static void main( String[] args ) throws Exception {
        IBanking banking = getBankings();

        System.out.println(banking.deposit(100));
    }
    private static IBanking getBankings() {
        return new DummyBanking();
    }
}
*/


// Chapter .2
/*
package demo;

public class Client
{
    public static void main( String[] args ) throws Exception
    {
        IBanking banking = getBankings();
        System.out.println("balance:" + banking.deposit(100));
    }
    private static IBanking getBankings() {
        return new BankingStub();
    }
}
*/


// Chapter .3
package demo;

public class Client
{
    public static void main( String[] args ) throws Exception
    {
        IBanking banking = getBankings();
        System.out.println("balance:" + banking.deposit(100));
        System.out.println("balance:" + banking.withdraw(50));
    }
    private static IBanking getBankings() {
        return new BankingStub();
    }
}