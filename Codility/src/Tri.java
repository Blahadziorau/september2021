public class Tri {
    public String s = "* ";
    public int rows = 6;
    public void foo() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(s);
            }
            System.out.println();


        }
    }
}
