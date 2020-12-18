import java.util.*;

class test111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> votes = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<String>();
        Boolean exitLoop = false;
        String answer = "";
        // printing the title
        System.out.println("****WELCOME TO THE UWL ELECTION*****");
        System.out.println(String.format("%17s"," ").replace("","*"));
        // empty line
        System.out.println();

        while (!exitLoop) {
            System.out.println("  Type Candidate and press [ENTER].");
            // print a long line separator of hypens
            System.out.println(String.format("%18s", " ").replace("", "-"));
            // capitalizes the first letter of the word
            answer = input.nextLine();
            // capitalize first letter
            answer = answer.substring(0, 1).toUpperCase() + answer.substring(1);
            // makes answer case insensitive and checks if exit is typed by user
            if (answer.equalsIgnoreCase("exit")) {
                exitLoop = true;
                break;
            }
            /** this here was the mistake. you add an item then you check if its there?????
             *
             */
            if (names.contains(answer)) {
                int index = names.indexOf(answer);
                int value = votes.get(index);
                value++;
                votes.set(index, value);

            } else if ((!names.contains(answer))) {
                names.add(answer);
                votes.add(1);
            }
        }
        for (int i = 0; i < votes.size(); i++)
            System.out.printf("%-20s|| [%s]\n",names.get(i),votes.get(i));

    }

}
