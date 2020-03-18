package Task3;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor(){
        length = 0;
    }
    public ChocAmor (String flavor, String origin, float length){
        super(flavor, origin);
        this.length = length;
    }
    public  ChocAmor(float length){
        super();
        this.length =length;
    }

    @Override
    public float getVolume() {
        return length * length *length;
    }

    @Override
    public String toString() {
        String obj = "Acesta"+super.toString()+"\n"+"detine aria "+getVolume();
        return obj;
    }
    public void printChocAmorDim(){
        System.out.println("ChocAmor "+length);
    }
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length= length;
    }
    @Override
    public void printDim() {
        super.printDim();
    }
}
