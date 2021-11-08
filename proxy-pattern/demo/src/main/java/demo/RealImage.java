//Chapter .1, 2
// implements는 구현해서 넣었다는 뜻입니다.
// 인터페이스란 구현체가 하나도 없이 methods 선언만 있는 것이 인터페이스입니다.
// RealImage는 filename을 가지고 하나가 생성이 될 때 마다 그것을 loadImageFromDisk 에서 로딩하는 로직이 항상 동반됩니다.

/*
package demo;

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
*/