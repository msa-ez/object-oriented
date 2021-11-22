// 뱅킹 서비스 완성하기
// Chapter .1, 2
/*
package com.example;

public class ServerBanking implements IBanking{
    
    int balance = 0;

    @Override
    public Integer deposit(Integer money) {
        balance = balance + money;
        return balance;
    }
}
*/

// Chapter .3
/*
package com.example;

public class ServerBanking implements IBanking{

    int balance = 0;

    @Override
    public Integer deposit(Integer money) {
        balance = balance + money;
        return balance;
    }

    @Override
    public Integer withdraw(Integer money) throws Exception {
        balance = balance - money;
        return balance;
    }
}
*/



// 싱글톤 패턴
// Chapter .1, 2, 3
/*
package com.example;

public class ServerBanking implements IBanking{

    public ServerBanking() {
        System.out.println("=== bank is created ===");
    }
    
    int balance = 0;

    @Override
    public Integer deposit(Integer money) {
        balance = balance + money;
        return balance;
    }

    @Override
    public Integer withdraw(Integer money) throws Exception {
        balance = balance - money;
        return balance;
    }
}
*/



// 싱글톤 패턴
// Chapter .4
// ServerBanking을 호출될 때만 접근 가능하게 함과 동시에 접근할 수 있는 methods를 생성
/*
package com.example;

public class ServerBanking implements IBanking{

    static ServerBanking instance = new ServerBanking();

    public static ServerBanking getInstance() {
        return instance;
    }

    public ServerBanking() {
        System.out.println("=== bank is created ===");
    }
    
    int balance = 0;

    @Override
    public Integer deposit(Integer money) {
        balance = balance + money;
        return balance;
    }

    @Override
    public Integer withdraw(Integer money) throws Exception {
        balance = balance - money;
        return balance;
    }
}
*/


// 뱅킹 서버 프록시 패턴
// Chapter .1, 2
/*
package com.example;

public class ServerBanking implements IBanking{

    static IBanking instance = new TransactionProxyBanking(new ServerBanking());

    public static IBanking getInstance() {
        return instance;
    }

    public ServerBanking() {
        System.out.println("=== bank is created ===");
    }
    
    int balance = 0;

    @Override
    public Integer deposit(Integer money) {

        balance = balance + money;

        return balance;
    }

    @Override
    public Integer withdraw(Integer money) throws Exception {
        balance = balance - money;
        return balance;
    }
}
*/



