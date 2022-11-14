package net.absoft.discriminantCalculator;

public class Solution extends Roots{


    private int a, b, c;

    public Solution(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Roots RootsSolution() {
// Discriminant

        int discriminant = (b * b - 4 * a * c);
        Roots result = new Roots();
        System.out.println("Discriminant = " + discriminant);
        if (discriminant == 0) {
            result.Root1 = result.Root2 = -b / (2 * a);
            return result;
        } else if (discriminant < 0) {
            super.Root2 = super.Root1 = null;

            return null;

        } else {
            super.Root1 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
            super.Root2 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
            return result;
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