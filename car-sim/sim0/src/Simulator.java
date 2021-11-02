// Chapter .1
/*
public class Simulator {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        
        String modelName = args[0];
        int zeroToHundred = 0;

        System.out.println("Car Model is" + modelName);

        if("BMW".equals(args[0])) {
            zeroToHundred = 5;
        } else if("Benz".equals(args[0])) {
            zeroToHundred = 8;
        }
        for(int i = 0; i<10; i++) {
            double speed = (100 / zeroToHundred) * i;

            System.out.println("" + i + "sec.speed is" + speed);
        }
    }
}
*/

// Chapter .2
/*
public class Simulator {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if("BMW".equals(args[0])) {
            simulate("BMW", 5);
        } else if("Benz".equals(args[0])) {
            simulate("Benz", 8);
        }
    }
    public static void simulate(String modelName, double zeroToHundred) {
        for(int i = 0; i<10; i++) {
            double speed = (100 / zeroToHundred) * i;

            System.out.println("" + i + "sec.speed is" + speed);
        }
    }
}
*/
// Chapter .3,4
/*
public class Simulator {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Car theCar = (Car) Class.forName(args[0]).newInstance();

        System.out.println("Car Model is" + args[0]);

        for(int i = 0; i<10; i++) {
            theCar.accelerateOneSecond();

            System.out.println("" + i + "sec.speed is" + theCar.getCurrentSpeed() + "and the fuel economy is" + theCar.getCurrentFuelEconomy());
        }
    }
}
*/
