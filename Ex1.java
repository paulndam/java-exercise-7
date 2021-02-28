public class Ex1 {
    public static void main(String[] args) {

        String word1 = "messi";
        System.out.println(front22(word1));

    }


    // Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.


// front22("kitten") → "kikittenki"
// front22("Ha") → "HaHaHa"
// front22("abc") → "ababcab"


public static String front22(String str) {

    int takeInChar = 2;

    if(takeInChar > str.length()){
        takeInChar = str.length();
    }
    String front = str.substring(0, takeInChar);
    return front + str + front;
    
}


    



}