package Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    private Queue<Task> taskQueue = new PriorityQueue<>();
    private Scanner sc = new Scanner(System.in);

    void mainLoop() {
        Option option;
        do {
            printOption();
            System.out.println("Wybierz opcję:");
            int intOption = sc.nextInt();
            option = Option.createFromInt(intOption);
            sc.nextLine();
            switch (option) {
                case ADD -> taskQueue.offer(readAndCreateTsk());
                case TAKE -> takeTask();
                case EXIT -> System.out.println("PaPa");
            }

        }while (option != Option.EXIT);
    }

    private void takeTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("Brak zadań do wykonania");
        } else {
            Task nextTask = taskQueue.poll();
            System.out.println(nextTask);
        }
    }

    private Task readAndCreateTsk() {
        System.out.println("Podaj nazwe zadania:");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania:");
        String description = sc.nextLine();
        System.out.println("Podaj piorytet zadania (LOW, MEDIUM, HIGH)");
        String s = sc.nextLine();
        Task.Priority priority = Task.Priority.valueOf(s);
        return new Task(name, description, priority);
    }

    private void printOption() {
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value);
        }
    }

    enum Option {
        ADD (0,"Dodaj zadanie"),
        TAKE (1,"Wykonaj zadanie"),
        EXIT (2,"Wyjście");

        int option;
        String description;

        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }

        static Option createFromInt(int option) {
            return values()[option];
        }

        @Override
        public String toString() {
            return option + " - " + description;
        }
    }
}
