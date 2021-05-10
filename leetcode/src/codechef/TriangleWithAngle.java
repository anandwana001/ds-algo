package codechef;

import java.util.Scanner;

public class TriangleWithAngle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int angles[] = new int[3];
        for(int i=0;i<3;i++)
        {
            angles[i] = s.nextInt();
        }
        int sum = angles[0] + angles[1] + angles[2];
        if (sum == 180 && angles[0] > 0 && angles[1] > 0 && angles[2] > 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
