//Chapter .1, 2
// displayImage라고 하는 실제 이미지를 출력하라고 전달 받을 때 RealImage가 없을 때에만 새이미지loding 하게끔 유도합니다.
// 이미지가 이미 loding된 경우에는 캐싱 된 이미지에서 displayImage 전달 함으로써 과도한 디스크 사용을 막아주는 cache 역할을 합니다.
/*
package demo;

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
*/