public class DrawChessTable {
    // Crate a program that draws a chess table like this
    //
    // % % % % 
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % % 
    //  % % % %
    //
    public static void main(String[] args) {
        String oddRows = "% % % %";
        String evenRows = " % % % %";

        for (int i = 1; i <= 8 ; i++) {
            if(i % 2 == 1) {
                System.out.println(oddRows);
            } else {
                System.out.println(evenRows);
            }
        }
    }
}
