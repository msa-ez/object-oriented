// Chapter .1
/*
public class Database {
    
}
*/

// Chapter .2
/*
public class Database {
    public void save() {

    }
    public void load() {
        
    }
}
*/

// Chapter .3
// - BusinessLogic.java에서 arg(아규먼트)를 넘겨받음
// - RuntimeException 란 무엇인가? 출처: https://nhj12311.tistory.com/204
/*
public class Database {
    public void save(String arg) {
        if(arg == null) {
            throw new RuntimeException("저장값은 null 이면 안됩니다.");
        }
    }
    public void load() {
        
    }
}
*/


// 팩토리 패턴
// Chapter .1,2
/*
public class Database {
    public void save(String arg) {
        if(arg == null) {
            throw new RuntimeException("저장값은 null 이면 안됩니다.");
        }
    }
    public void load() {
        
    }
}
*/