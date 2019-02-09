public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        todoText = "My todo\n" + todoText + " - Download games\n" + "\t - Diablo";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
        System.out.println("btw: Diablo: Immortal has been just announced!");
        System.out.println("Is this an out of season April's fool joke?");
        System.out.println("Don't you guys have phones?!");
    }
}