package Task1;

import java.util.Objects;

public class Student {
    private String nume;
    private int year;

    public String getNume(){
        return nume;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    @Override
    public String toString(){
        return "Student:'\\'' Nume = "+nume+" '\\''Year = "+year;
    }
    @Override
    public boolean equals(Object object){
        if(this == object){
            return  true;
        }
        if(object == null || getClass() !=object.getClass()) {
            return false;
        }
        Student student = (Student) object;
        return Objects.equals(nume, student.nume) &&
                Objects.equals(year, student.year);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nume,year);
    }
}
