// Chapter .1
/*
public class Presentation {

    public Presentation(BusinessLogic BusinessLogic) {

    }

    public void doPresentation() {

    }

}
*/

// Chapter .2
/*
public class Presentation {
    BusinessLogic businessLogic;
    public Presentation(BusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }

    public void doPresentation() {
        System.out.println(" 결과는 " + businessLogic.doBusinessLogic() + " 입니다. ");
    }
}
*/
// Chapter .3
// - Application.java의 presentation.doPresentation(args[0]); 아규먼트를 넘겨받고 BusinessLogic.java 에 넘겨줍니다.
/*
public class Presentation {
    BusinessLogic businessLogic;
    public Presentation(BusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }
    public void doPresentation(String arg) {
        System.out.println(" 결과는 " + businessLogic.doBusinessLogic(arg) + " 입니다. ");
    }
}
*/

// 팩토리 패턴
// Chapter .1
/*
public class Presentation {
    BusinessLogic businessLogic;
    public Presentation(BusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }
    public void doPresentation(String arg) {
        System.out.println(" 결과는 " + businessLogic.doBusinessLogic(arg) + " 입니다. ");
    }
}
*/

// Chapter .2
/*
public class Presentation {
    BusinessLogic businessLogic;

        public BusinessLogic getBusinessLogic() {
            return businessLogic;
        }
        public void setBusinessLogic(BusinessLogic businessLogic) {
            this.businessLogic = businessLogic;
        }
    public void doPresentation(String arg) {
        System.out.println(" 결과는 " + businessLogic.doBusinessLogic(arg) + " 입니다. ");
    }
}
*/
