// Chapter .2,3
/*
public class AddressbookBusinessLogic extends BusinessLogic {
    public AddressbookBusinessLogic(Database database) {
        super(database);
    }
}
*/


// 팩토리 패턴
//Chapter .1
/*
public class AddressbookBusinessLogic extends BusinessLogic {
    public AddressbookBusinessLogic(Database database) {
        super(database);
    }

    @Override
    public String doBusinessLogic(String arg) {
        String value = "[주소]" + arg;

        this.database.save(value);
        this.database.load();

        return value;
    }
}
*/

//Chapter .2
/*
public class AddressbookBusinessLogic extends BusinessLogic {
    @Override
    public String doBusinessLogic(String arg) {
        String value = "[주소]" + arg;

        this.database.save(value);
        this.database.load();

        return value;
    }
}
*/
