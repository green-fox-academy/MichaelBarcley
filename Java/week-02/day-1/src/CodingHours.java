public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int dailyCoding = 6;
        int semesterLength = 17;
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        System.out.println("An attendee codes " + dailyCoding * semesterLength * 5 + " hours during the semester.");
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println("Percentage of coding hours: " + dailyCoding * 5 * 100 / 52 + " %");
    }
}