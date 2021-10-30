public class Tri {
    public String s = "* ";
    public void foo() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(s);
            }
            System.out.println();


        }
    }
}
