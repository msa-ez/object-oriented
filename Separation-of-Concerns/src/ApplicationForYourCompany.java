// 팩토리 패턴
//Chapter .1
// - Application을 상속하는 Class
public class ApplicationForYourCompany extends Application{

    @Override
    public Presentation createPresentation() {
        return new Presentation(
            new AddressbookBusinessLogic(
                new AddressbookOracleDatabase()
            )
        );
    }
}
 