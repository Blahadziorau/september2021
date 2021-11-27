public class TriUpsideDown {
    public String s = "* ";
    public int rows = 4;
    public void foo() {
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(s);
            }
            for (int j = 1; j < rows; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }


}
