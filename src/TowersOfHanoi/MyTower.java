package TowersOfHanoi;

import java.util.Scanner;
import java.util.Stack;

public class MyTower {

    public static int N;

    //Creating stack array
    public static Stack<Integer>[] tower = new Stack[4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tower[1] = new Stack<Integer>();
        tower[2] = new Stack<Integer>();
        tower[3] = new Stack<Integer>();

        System.out.println("Enter number of disk");
        int number = scanner.nextInt();
        scanner.close();
        N=number;
        diskToStack(number);
    }

    public static void diskToStack(int n){
        for(int d = n; d > 0; d--)
            tower[1].push(d);
        displayDisk();
        moveDisk(n,1,2,3);
    }

    public static void moveDisk(int n, int a, int b, int c){
        if(n > 0) {
            moveDisk(n-1, a,c,b);
            int d = tower[a].pop();
            tower[c].push(d);
            displayDisk();
            moveDisk(n-1,b,a,c);
        }
    }

    public static void displayDisk(){
        for (int i = N - 1; i >= 0; i--) {
            String d1 = " ", d2 = " ", d3 = " ";
            try {
                d1 = String.valueOf(tower[1].get(i));
            } catch (Exception e) {
            }
            try {
                d2 = String.valueOf(tower[2].get(i));
            } catch (Exception e) {
            }
            try {
                d3 = String.valueOf(tower[3].get(i));
            } catch (Exception e) {
            }
            System.out.println("  " + d1 + "  |  " + d2 + "  |  " + d3);
        }
        System.out.println("  A  |  B  |  C");
        System.out.println("\n");
    }
}
