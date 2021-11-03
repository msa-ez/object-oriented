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
