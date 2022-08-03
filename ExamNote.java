package scannerExaple;

import java.util.Scanner;

public class ExamNote {
    public static void main(String[] args) {
        Scanner askNote = new Scanner(System.in);

        System.out.println("your exam");
        int note = askNote.nextInt();
        System.out.println("your not is " + note);

        if(note>90 && note<100){
            System.out.println("your grade is A");
        }
        else if(note>70 && note<90){
            System.out.println("your grade is B");
        }
        else if(note>60 && note<70){
            System.out.println("your grade is C");
        }
        else if(note<60){
            System.out.println("your grade is F");
        }
        else{
            System.out.println("wrong note pss use digits ");
        }

    }

}
