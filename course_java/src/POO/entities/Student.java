package POO.entities;

public class Student {
    private String name;
    private double note1;
    private double note2;
    private double note3;
    private double soma;

    public double sum(){
        return note1+note2+note3;
    }

    public String passou(){
        if (sum() >= 60.00){
            return "PASSED";
        }else{
            return "FAILED";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3(double note3) {
        this.note3 = note3;
    }
}
