package com.archql.labs;

import com.archql.labs.help.Utils;
import com.archql.labs.tasks.*;

public class Main {

    public static void main(String[] args) {
        // create all task instances
        ITask[] tasks = new ITask[] {
                new Task1(),
                new Task2(),
                new Task3(),
                new Task4(),
                new Task5(),
                new Task6(),
                new Task7(),
                new Task8(),
                new Task9(),
                new Task10(),
                new Task11(),
                new Task12()
        };

        while (true)
        {
            // write your code here
            int i = 0;
            for (ITask task : tasks) {
                System.out.println("Task number " + (++i) + "\n\t" + task.description());
            }
            System.out.printf("Please, input task number to see (1..%d), invalid to exit): ", tasks.length);

            int input = -1;
            try {
                input = Utils.scanner.nextInt() - 1;
            } catch (Exception e) {
                break;
            }
            if (input < 0 || input >= tasks.length)
                break;

            ITask current = tasks[input];
            System.out.println(current.detailedDescription());
            if (current.execute())
                System.out.println("Task exited with success: ");
            else
                System.out.println("Task exited with error: ");
            System.out.println(current.lastInfo());
            Utils.scanner.nextLine();
        }

        System.out.println(" App is exiting, write any to leave...");
        Utils.scanner.nextLine();
    }
}
