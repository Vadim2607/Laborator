package Task3;

import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;

    @Override
    public int hashCode() {
        return Objects.hash(getFlavor(), getOrigin());
    }

    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    CandyBox(){
        flavor = "Example1";
        origin = "Example1";
    }
    CandyBox(String flavor, String origin){
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume(){
        return 0;
    }
    @Override
    public String toString(){
        return "CandyBox: "+"\n"+
                "flavor = "+flavor+"\n"+
                "origin = "+origin;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CandyBox candyBox = (CandyBox) o;
        if (flavor != null ? !flavor.equals(candyBox.flavor) : candyBox.flavor != null) return false;
        return origin != null ? origin.equals(candyBox.origin) : candyBox.origin == null;
    }
}
