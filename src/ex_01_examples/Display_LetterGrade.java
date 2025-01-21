package ex_01_examples;

public class Display_LetterGrade {

    public static void main(String[] args) {

        //Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F) based on
        // the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
       // int score =80;
        int score = Integer.parseInt(args[0]);
        System.out.println("Score = " +score);
       String Grade = ((score>=90)?"Grade A":(score>=80)?"Grade B":(score>=70)?"Grade C":(score>=60)?"Grade D":"Fail");
        System.out.println("Grade of Aishu is " +Grade);
    }
}