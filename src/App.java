import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Previous GPA: ");
        double preGPA = in.nextDouble();
        in.nextLine();

        System.out.print("Enter Your Current Grades: ");
        String input = in.nextLine();
        String[] currentGradesS = input.split(" ");

        in.close();

        Double[] currentGrades = new Double[currentGradesS.length];
        for(int i=0; i<currentGrades.length; i++) {
            currentGrades[i] = Double.parseDouble(currentGradesS[i]);
        }

        for(int i=0; i<currentGrades.length; i++) {
            if(currentGrades[i]>93) {
                currentGrades[i] = 4.0;
            } else if(currentGrades[i]>90) {
                currentGrades[i] = 3.67;
            } else if(currentGrades[i]>87) {
                currentGrades[i] = 3.33;
            } else if(currentGrades[i]>83) {
                currentGrades[i] = 3.00;
            } else if(currentGrades[i]>80) {
                currentGrades[i] = 2.67;
            } else if(currentGrades[i]>77) {
                currentGrades[i] = 2.33;
            } else if(currentGrades[i]>73) {
                currentGrades[i] = 2.00;
            } else if(currentGrades[i]>70) {
                currentGrades[i] = 1.67;
            } else if(currentGrades[i]>60) {
                currentGrades[i] = 1.00;
            } else {
                currentGrades[i] = 0.0;
            }
        }

        double total = 0;
        int numClasses = 0;
        for(double grade : currentGrades) {
            total += grade;
            numClasses++;
        }

        double avg = total/numClasses;
        double GPA = (avg+preGPA)/2;

        System.out.println("Current GPA: " + GPA);
    }
}
