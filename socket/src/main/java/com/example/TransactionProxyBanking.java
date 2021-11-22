// 뱅킹 서버 프록시 패턴
// Chapter .1
/*
package com.example;

public class TransactionProxyBanking implements IBanking {
    IBanking realBanking;

    public TransactionProxyBanking(IBanking realBanking) {
        this.realBanking = realBanking;
    }

    @Override
    public Integer deposit(Integer money) throws Exception {

        System.out.println("---- database connect ----");

        int balance = realBanking.deposit(money);
        System.out.println("---- database close ----");

        return balance;
    }

    @Override
    public Integer withdraw(Integer money) throws Exception {
        System.out.println("---- database connect ----");
        
        int balance = realBanking.deposit(money);
        System.out.println("---- database close ----");

        return balance;
    }
}
*/






// 뱅킹 서버 프록시 패턴
// Chapter .2
/*
package com.example;

public class TransactionProxyBanking implements IBanking {
    IBanking realBanking;

    public TransactionProxyBanking(IBanking realBanking) {
        this.realBanking = realBanking;
    }

    @Override
    public Integer deposit(Integer money) throws Exception {

        System.out.println("---- database connect ----");

        int balance = realBanking.deposit(money);
        System.out.println("---- database close ----");

        return balance;
    }

    @Override
    public Integer withdraw(Integer money) throws Exception {
        System.out.println("---- database connect ----");
        
        int balance = realBanking.deposit(money); // 후속 처리: balance가 만약에 -로 값이 떨어질 경우 그 값은 취소해 준다.(잔고가 -로 갈 수 없습니다.)

        if(balance < 0) {
            System.out.println("---- database rolledback ----");
        }
        System.out.println("---- database close ----");

        return balance;
    }
}
*/










