// 뱅킹 서비스 완성하기
// Chapter .1, 2
// - interface라는 것은 abstract 와 같은 기능으로 볼 수 있습니다.
/*
package com.example;

public interface IBanking {
    Integer deposit(Integer money);
}
*/
// Chapter .3
/*
package com.example;

public interface IBanking {
    Integer deposit(Integer money) throws Exception;
    Integer withdraw(Integer money) throws Exception;
}
*/



// 싱글톤 패탄
// Chapter .1
package com.example;

public interface IBanking {
    Integer deposit(Integer money) throws Exception;
    Integer withdraw(Integer money) throws Exception;
}
