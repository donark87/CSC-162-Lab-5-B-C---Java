public class Bingo {

    public static String str = "Bingo";

    public void song(int num) {

        if(num > str.length()) return;

        System.out.println("There was a farmer has a dog");
        System.out.println("And Bingo was his name-0");

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < num; j++) {
                System.out.print(
                        (j == 0 ? "(" : "") + "clap" +
                                (j == num - 1 ? (num == str.length()
                                        ? ")" : ")-") : ","));
            }
            for (int x = num; x < str.length(); x++) {

                System.out.print(str.charAt(x) +
                        (x == str.length() - 1 ? "!" : "-"));

            }
            System.out.println();
        }
        System.out.println("And Bingo was his name - O");
        song(num +1);
    }
}
