package algorithms.implementation.angryProfessor;

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int numberOfStudents = sc.nextInt();
            int studentsNeeded = sc.nextInt();

            int studentsPresent = 0;
            for (int j = 0; j < numberOfStudents; j++) {
                if (sc.nextInt() <= 0) {
                    studentsPresent++;
                }
            }
            if (studentsPresent >= studentsNeeded) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
