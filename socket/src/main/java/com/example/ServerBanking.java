// Chapter .1
// 뱅킹 서비스 완성하기
package com.example;

public class ServerBanking implements IBanking{
    
    int balance = 0;

    @Override
    public Integer deposit(Integer money) {
        balance = balance + money;
        return balance;
    }
}
