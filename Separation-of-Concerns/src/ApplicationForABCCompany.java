// 팩토리 패턴
//Chapter .1
// - Application을 상속하는 Class
/*
public class ApplicationForABCCompany extends Application{

    @Override
    public Presentation createPresentation() {
        return new Presentation(
            new AddressbookBusinessLogic(
                new AddressbookMySQLDatabase()
            )
        );
    }
}
*/


//Chapter .2
/*
public class ApplicationForABCCompany extends Application{

    @Override
    public Presentation createPresentation() {
        return new Presentation();
    }
    @Override
    public Database createDatabase() {
        return new AddressbookMySQLDatabase();
    }
    @Override
    public BusinessLogic createBusinessLogic() {
        return new AddressbookBusinessLogic();
    }
}
*/