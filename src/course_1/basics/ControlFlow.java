package course_1.basics;

public class ControlFlow {
    public static void main(String[] args) {
        /*
            Control Flow - the order in which instructions are executed in a program
            Control Statements:
                - Sequential (Sequence)
                - Selection (Decision)
                - Repetition (Loops)
                    - continue - skips the current iteration
                    - break - exists the loop

            if, else-if, ternary, switch

        * */

        int age = 18;

        if (age > 18) {
            System.out.println("You can drive");
        } else {
            System.out.println("You can't drive");
        }

        int counter = 0;

        // While...Do
        while (counter <= 10) {
            System.out.println(counter++);
        }

        // Do...While
        do {
            System.out.println(counter++);
        } while (counter < 10); // Runs at least once, before the condition is evaluated

        // For...Loop
        for (int i = 0; i < counter; i++) {
            System.out.println(i);
        }

        // continue & break
        for (int i = 0; i < counter; i++) {
            if (i == 3 || i == 7) {
                continue;
            }

            if (i == 9) {
                break;
            }

            System.out.println(i);
        }

        int count = 10;

        //CONTINUE
        for (int i = 0; i < count; i++) {
            if (i % 2 == 1) {
                System.out.println("skipping odd number " + i);
                continue;
            }
            //even numbers
            System.out.println(i);
        }//end loop

        //CONTINUE
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                System.out.println("skipping even number " + i);
                continue;
            }
            //odd numbers
            System.out.println(i);
        }//end loop

        //BREAK
        for (int i = 0; i < count; i++) {
            if (i == 7) {
                System.out.println("breaking out of the loop");
                break;
            }
            System.out.println(i);
        }//end loop
    }
}
