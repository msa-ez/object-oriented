// Chapter .2

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
