import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RS = in.nextInt();
        int R = RS/10;
        int S = RS%10;
        switch (S)
        {
            case 1:System.out.print("Faint signals, barely perceptible, ");
                break;
            case 2:System.out.print("Very weak signals, ");
                break;
            case 3:System.out.print("Weak signals, ");
                break;
            case 4:System.out.print("Fair signals, ");
                break;
            case 5:System.out.print("Fairly good signals, ");
                break;
            case 6:System.out.print("Good signals, ");
                break;
            case 7:System.out.print("Moderately strong signals, ");
                break;
            case 8:System.out.print("Strong signals, ");
                break;
            case 9:System.out.print("Extremely strong signals, ");
                break;
        }
        switch (R)
        {
            case 1:System.out.print("unreadable.");
                break;
            case 2:System.out.print("barely readable, occasional words distinguishable.");
                break;
            case 3:System.out.print("readable with considerable difficulty.");
                break;
            case 4:System.out.print("readable with practically no difficulty.");
                break;
            case 5:System.out.print("perfectly readable.");
                break;
        }
    }
}
