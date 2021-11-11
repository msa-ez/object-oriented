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
// Chapter .1
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
