class CheckCase {
        public static void main(String arg[]) {

                try {
                        System.out.println(10 / 0);
                } catch (ArithmeticException e) {

                        System.out.println(10 / 0);
                } finally {
                        System.out.println("Sohan");
                }
        }
}
