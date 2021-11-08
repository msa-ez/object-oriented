// Chapter .1
/*
package demo;

interface Image {
    public void displayImage();
}

// On System A
class RealImage implements Image {
    private final String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
}

class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        }
        image.displayImage();
    }
}

class App {
   public static void main(final String[] arguments) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
    }
}
*/

// Chapter .2
// 팩토리 패턴 응용
/*
package demo;

interface Image {
    public void displayImage();
}

// On System A
class RealImage implements Image {
    private final String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
}

class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        }
        image.displayImage();
    }
}

class App {
   public static void main(final String[] arguments) {
        Image image1 = createImage("HiRes_10MB_Photo1"); // new LoggingProxyImage(new ProxyImage("HiRes_10MB_Photo1"));
        Image image2 = createImage("HiRes_10MB_Photo2"); // new LoggingProxyImage(new ProxyImage("HiRes_10MB_Photo2"));

        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary 
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
    }

    public static Image createImage(String fileName){
        //return new RealImage(fileName);
        //return new ProxyImage(fileName);
        return new LoggingProxyImage(new ProxyImage(fileName));
    }
}
*/