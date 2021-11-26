// 7주차 Anonymous Class 와 Observer Pattern
// Chapter .3, 4
/*
package com.example;

public class FeedListener extends Listener {

    @Override
    public void energyChanged(int energy) {
        if(energy < 5) {
            System.out.println("please feed some food.");
        }
    }
}
*/



// Chapter .5
// 재사용될 일이 있을 경우 아래와 같이 변경해 줍니다.
/*
package com.example;

public class FeedListener extends Listener {

    int feedCriteria = 0;


    public FeedListener(int criteria) {
        this.feedCriteria = criteria;
    }

    @Override
    public void energyChanged(int energy) {
        if(energy < feedCriteria) {
            System.out.println("please feed some food.");
        }
    }
}
*/

// Abstract Class
// Chapter .1, 2
/*
package com.example;

public class FeedListener extends Listener {

    int feedCriteria = 0;


    public FeedListener(int criteria) {
        this.feedCriteria = criteria;
    }

    @Override
    public void energyChanged(int energy) {
        if(energy < feedCriteria) {
            System.out.println("please feed some food.");
        }
    }
}
*/






// 접근자와 접근권한
// Chapter .1, 2, 3, 4
/*
package com.example;

public class FeedListener extends Listener {

    int feedCriteria = 0;


    public FeedListener(int criteria) {
        this.feedCriteria = criteria;
    }

    @Override
    public void energyChanged(int energy) {
        if(energy < feedCriteria) {
            System.out.println("please feed some food.");
        }
    }
}
*/




// Interface Class
// Chapter .1, 2, 3
/*
package com.example;

public class FeedListener extends Listener {

    int feedCriteria = 0;


    public FeedListener(int criteria) {
        this.feedCriteria = criteria;
    }

    @Override
    public void energyChanged(int energy) {
        if(energy < feedCriteria) {
            System.out.println("please feed some food.");
        }
    }
}
*/















