// 뱅킹 서비스 완성하기
// Chapter .1
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
// 주의사항 :
// - 서버가 띄워져 있어야 정상 작동하기 때문에 socket 폴더 내의 Server을 run 한 후 Client.java를 Debug로 실행
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