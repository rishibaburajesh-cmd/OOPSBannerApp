public class oopsBannerApp {
    public static void main(String[] args) {
        String[] lists = new String[7];
        lists[0] = String.join("", " ***** ", "   "," ***** ", "   ", " ***** ", "   ", " ***** ");
        lists[1] = String.join("", "*     *", "   ","*     *", "   ", "*     *", "   ", "*      ");
        lists[2] = String.join("", "*     *", "   ","*     *", "   ", "*     *", "   ", "*      ");
        lists[3] = String.join("", "*     *", "   ","*     *", "   ", "****** ", "   ", " ***** ");
        lists[4] = String.join("", "*     *", "   ","*     *", "   ", "*      ", "   ", "      *");
        lists[5] = String.join("", "*     *", "   ","*     *", "   ", "*      ", "   ", "      *");
        lists[6] = String.join("", " ***** ", "   "," ***** ", "   ", "*      ", "   ", " ***** ");

        for (String line : lists) {
            System.out.println(line);
        }
    }
}