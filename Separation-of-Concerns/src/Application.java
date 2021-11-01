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




 