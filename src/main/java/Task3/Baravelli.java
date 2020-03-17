package Task3;

public class Baravelli extends CandyBox {
    private float radius, height;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Baravelli(){
        this.height = 0;
        this.radius = 0;
    }
    public Baravelli(float radius, float height){
        this.radius = radius;
        this.height = height;
    }
    public  Baravelli(String flavor, String origin, float radius, float height){
        super(flavor, origin);
        this.height = height;
        this.radius =radius;
    }
    @Override
    public float getVolume() {
        return (float)Math.PI * radius * radius * height;
    }
    @Override
    public String toString(){
        String output = "Acest: "+super.toString()+"\n"+"Are aria: "+getVolume();
        return output;
    }

}
