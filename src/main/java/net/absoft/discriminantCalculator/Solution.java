package net.absoft.discriminantCalculator;

public class Solution{

    public Integer Root1, Root2;
    private int a, b, c;

    public Solution(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void RootsSolution() {
// Discriminant

        int discriminant = (b * b - 4 * a * c);
//        Roots result = new Roots();
        System.out.println("Discriminant = " + discriminant);
        if (discriminant == 0) {
            Root1 = Root2 = -b / (2 * a);

        } else if (discriminant < 0) {
            Root2 = Root1 = null;



        } else {
            Root1 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
            Root2 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));

        }

    }
        //    public void solution(int a, int b, int c) {
//
//       int discriminant = (b*b -4*a*c);
//        System.out.println("Discriminant = " + discriminant);
//        if (discriminant < 0) {
//            System.out.println("null due to d ==0");
//
//        } else if (discriminant == 0) {
//            System.out.println("Корни: " + searchRootsWhenDiscriminantEqualsToZero(a, b));
//
//
//        } else {
//            System.out.println(">0");
//        }
//
//
//
//    }


}