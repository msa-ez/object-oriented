//import java.util.concurrent.ExecutionException;

// Chapter .1
/*
public class BusinessLogic {
    
}
*/

// Chapter .2
/*
public class BusinessLogic {
    Database database;

    public BusinessLogic(Database database) {
        this.database = database;
    }
    public String doBusinessLogic() {
        try{
            this.database.load();
            this.database.save();

            return "OK";

        }catch(Exception e){
            return "Failed";
        }
    }
}
*/

// Chapter .3
// - Presentation.java 에서 arg(아규먼트)를 넘겨 받고 Database.java에 arg(아규먼트)를 넘겨줍니다.
/*
public class BusinessLogic {
    Database database;

    public BusinessLogic(Database database) {
        this.database = database;
    }
    public String doBusinessLogic(String arg) {

        try{
            this.database.load();
            this.database.save(arg);

            return "OK";

        }catch(Exception e){
            return "Failed";
        }
    }
}
*/

// 팩토리 패턴
// Chapter .1
/*
public class BusinessLogic {
    Database database;

    public BusinessLogic(Database database) {
        this.database = database;
    }
    public String doBusinessLogic(String arg) {

        try{
            this.database.load();
            this.database.save(arg);

            return "OK";

        }catch(Exception e){
            return "Failed";
        }
    }
}
*/

// Chapter .2
// - Getters and Setters 추가
/*
public class BusinessLogic {
    Database database;
        // Getters and Setters라고 하는 것은 필드에 접근할 수 있는 methods입니다.
        // 나의 중요한 데이터를 다른 객체가 변경할 수 있기 때문에 Database database;(private data) 앞쪽에 아무것도 옵션을 주지 않아 private 객체로 만들어 줍니다.
        // private으로 설정할 객체는 항상 앞에 아무것도 주지 않도록 해줍니다.
        public Database getDatabase() {
            if(database == null) throw new RuntimeException("I am not ready!!!");
            return database;
        }
        public void setDatabase(Database database) {
            // methods를 거쳐서는 접근이 가능하게끔은 해줄 수 있습니다.
            if(database == null) throw new RuntimeException("Database must be not null!!!");
            this.database = database;
        }
    public BusinessLogic() {

    }
    public String doBusinessLogic(String arg) { 

        try{
            this.database.load();
            this.database.save(arg);

            return "OK";

        }catch(Exception e){
            return "Failed";
        }
    }
}
*/