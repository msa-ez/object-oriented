// 중간점검 Chpater .1
// Repository Pattern 의 직접 구현 Chpater .1, Chpater .2
// JPA 를 기반한 Repository pattern 구현체 자동생성 Chpater .1
package com.example.petshop;

public class FeedListener implements Listener {

    int feedCriteria = 0;

    public FeedListener(int criteria) {
        this.feedCriteria = criteria;
    }

    @Override
    public void energyChanged(int energy) {
        if(energy < feedCriteria){
            System.out.println("please feed some food.");
        }
    }
}
