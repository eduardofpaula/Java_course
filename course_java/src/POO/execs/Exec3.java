package POO.execs;

import POO.entities.Student;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.setName(sc.nextLine());
        student.setNote1(sc.nextDouble());
        student.setNote2(sc.nextDouble());
        student.setNote3(sc.nextDouble());

        System.out.println("FINAL GRADE = " + student.sum());
        System.out.println(student.passou());
        if(student.sum() < 60.00){
            System.out.println("MISSING " + (60.00 - student.sum()) + " POINTS");
        }

    }
}
