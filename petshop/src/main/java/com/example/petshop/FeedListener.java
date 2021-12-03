//중간점검 Chpater .1, Repository Pattern 의 직접 구현
package com.example.petshop;

public class FeedListener implements Listener {
    int feedCreteria = 0;

    public FeedListener(int criteria) {
        this.feedCreteria = criteria;
    }

    @Override
    public void energyChanged(int energy) {
        if(energy < feedCreteria) {
            System.out.println("please feed some food.");
        }
    }
}
