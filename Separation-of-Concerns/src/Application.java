// Chapter .1, 2
/*
public class Application {
    public static void main(String[] args){
        Presentation presentation = new Presentation(
            new BusinessLogic(
                new Database()
            )
        );
        presentation.doPresentation();
    }
}
*/

// Chapter .3
// - 아규먼트 추가
/*
public class Application {
    public static void main(String[] args){
        Presentation presentation = new Presentation(
            new BusinessLogic(
                new Database()
            )
        );
        presentation.doPresentation(args.length > 0 ? args[0] : null);
    }
}
*/

// 팩토리 패턴
//Chapter .1
/*
public abstract class Application {
    public static void main(String args[]) throws Exception {
        
        Application application = (Application)Class.forName("ApplicationFor" + args[0]).newInstance();

        Presentation presentation = application.createPresentation();

        presentation.doPresentation("test");
    }
    abstract public Presentation createPresentation();
}
*/

//Chapter .2
/*
public abstract class Application {
    public static void main(String args[]) throws Exception {
        
        Application application = (Application)Class.forName("ApplicationFor" + args[0]).newInstance();

        Presentation presentation = application.createPresentation();
        BusinessLogic businessLogic = application.createBusinessLogic();
        Database database = application.createDatabase();

        presentation.setBusinessLogic(businessLogic);
        businessLogic.setDatabase(database);

        presentation.doPresentation("test");
    }
    abstract public Presentation createPresentation();
    abstract public Database createDatabase();
    abstract public BusinessLogic createBusinessLogic();
}
*/
 