package Exercise3;

/**
 * Created by Nikita on 21.03.2021 at 23:41
 */
public class Exercise3task5 {
    public static class A {
        public static int answer = 0;

        public static String getClassName() {
            return "Name of class: A";
        }

        public String callMethod() {
            return "Method of class: A";
        }
    }

    public static class B extends A {
        public static int answer = 42;

        public static String getClassName() {
            return "Name of class: B";
        }

        @Override
        public String callMethod() {
            return "Method of class: B";
        }
    }

    public static class Main {
        public static void main(String args[]) {
            B b1 = new B();
            System.out.println(b1.answer);
            System.out.println(b1.getClassName());
            System.out.println(b1.callMethod());
            A b2 = new B();
            System.out.println(b2.answer);
            System.out.println(b2.getClassName());
            System.out.println(b2.callMethod());
        }

    }
}
