package Task3;

public class Lindt extends CandyBox {
     private float length, width, height;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Lindt(){
    }
    public Lindt(float length,float width,float height){
        this.length = length;
        this.width = width;
        this.width = height;
    }
    public Lindt(String flavor, String origin, float length, float height, float width) {
        super(flavor, origin);
        this.length = length;
        this.height = height;
        this.width = width;
    }
    @Override
    public float getVolume() {
        return height * length * width;
    }

    @Override
    public String toString() {
        String output = "The " + super.toString() + " has area " + getVolume();
        return output;
    }

    public void printLindtDim() {
        System.out.println("Lindt: " + height + " " + width + " " + length);
    }

    @Override
    public void printDim() {
        printLindtDim();
    }
}
