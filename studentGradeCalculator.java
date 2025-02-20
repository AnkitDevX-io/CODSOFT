import java.util.Scanner;

public class studentGradeCalculator {
    static int marks=0;
    static double avg=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--*Welcome to Student Grade Calculator*--\n");
        System.out.print("How many subjects do you have in this academic year? \nEnter Number:");
        int subjectNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("enter your "+subjectNumber+" subject names:");

        String[] arr= new String[subjectNumber];
        int[] mark= new int[subjectNumber];

        for (int i=0; i<subjectNumber; i++){
            System.out.print("Subject " + (i + 1) + ": ");
            arr[i]=sc.nextLine();
                System.out.println("Enter your " + arr[i] + " marks:");
                mark[i] = sc.nextInt();
                if (mark[i]>=101){
                    System.out.println("Please! Enter marks between 1 to 100");
                    System.out.println("Bye..");
                    System.exit(1);
                }
                sc.nextLine();
                marks += mark[i];

        }
        double average = (marks/subjectNumber);
        avg += average;
        System.out.println();

        if (average>90 && average<=100) {
            result();
            System.out.print("\t| GRADE     |  'A+' | \n");
            System.out.print("\t---------------------\n");
        }
        else if (average>80&& average<=90) {
            result();
            System.out.print("\t| GRADE     |  'A'  | \n");
            System.out.print("\t---------------------\n");
        }
        else if (average>70&& average<=80){
            result();
            System.out.print("\t| GRADE     |  'B+' | \n");
            System.out.print("\t---------------------\n");
        }
        else if (average>60&& average<=70){
            result();
            System.out.print("\t| GRADE     |  'B'  | \n");
            System.out.print("\t---------------------\n");
        }
        else if (average>45&& average<=60){
            result();
            System.out.print("\t| GRADE     |  'C'  | \n");
            System.out.print("\t---------------------\n");
        }
        else if (average>=35&& average<=45){
            result();
            System.out.print("\t| GRADE     |  'D'  | \n");
            System.out.print("\t---------------------\n");
        }
        else {
            result();
            System.out.print("\t| GRADE     | 'FAIL'| \n");
            System.out.print("\t---------------------\n");
        }

    }
    public static void result(){
        System.out.println("\n\t-----your result-----\n" +
                "\t| Percentage| "+avg+"% |   \n"+
                "\t| TotalMarks|   "+marks+" |    ");
    }
}
