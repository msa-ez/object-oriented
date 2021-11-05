// Chapter .2
/*
public class AddressbookPresentation extends Presentation{
    public AddressbookPresentation(BusinessLogic businessLogic) {
        super(businessLogic);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void doPresentation() {
        System.out.println(" 결과는 " + this.businessLogic.doBusinessLogic() + " 입니다. " );
    }
}
*/
// Chapter .3
/*
public class AddressbookPresentation extends Presentation{
    public AddressbookPresentation(BusinessLogic businessLogic) {
        super(businessLogic);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void doPresentation(String arg) {
        System.out.println(" 결과는 " + this.businessLogic.doBusinessLogic(arg) + " 입니다. " );
    }
}
*/

// 팩토리 패턴
// Chapter .1
/*
import javax.swing.*;

public class AddressbookPresentation extends Presentation {
    public AddressbookPresentation(final BusinessLogic businessLogic) {
        super(businessLogic);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void doPresentation(String arg) {
        super.doPresentation(arg);

        System.out.println(" ******** 주소록 프로그램 ********* " );
        System.out.println(" 주소 입력 결과는  " + this.businessLogic.doBusinessLogic(arg) + " 입니다. " );
    }
}
*/

// Chapter .2
/*
import javax.swing.*;

public class AddressbookPresentation extends Presentation {
    @Override
    public void doPresentation(String arg) {
        super.doPresentation(arg);

        System.out.println(" ******** 주소록 프로그램 ********* " );
        System.out.println(" 주소 입력 결과는 " + this.businessLogic.doBusinessLogic(arg) + " 입니다. " );
    }
}
*/