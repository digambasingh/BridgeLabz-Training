package com.bridgelabz.dsa;

class Task {
    private int taskId;
    private String taskName;
    private int priority;
    private String dueDate;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public int getTaskId() {
        return taskId;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "TaskID: " + taskId +
               ", Name: " + taskName +
               ", Priority: " + priority +
               ", Due Date: " + dueDate;
    }
}

class TaskNode {
    Task data;
    TaskNode next;

    public TaskNode(Task data) {
        this.data = data;
        this.next = null;
    }
}

class CircularTaskScheduler {

    private TaskNode head;
    private TaskNode current; // for current task tracking

    // 1. Add at beginning
    public void addAtBeginning(Task task) {
        TaskNode node = new TaskNode(task);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        node.next = head;
        temp.next = node;
        head = node;
    }

    // 2. Add at end
    public void addAtEnd(Task task) {
        TaskNode node = new TaskNode(task);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = head;
    }

    // 3. Add at specific position
    public void addAtPosition(Task task, int position) {
        if (position == 1) {
            addAtBeginning(task);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode node = new TaskNode(task);
        node.next = temp.next;
        temp.next = node;
    }

    // 4. Remove by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.data.getTaskId() == taskId) {

                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }

                    if (head == head.next) { // single node
                        head = null;
                        current = null;
                        return;
                    }

                    last.next = head.next;
                    head = head.next;
                } else {
                    prev.next = temp.next;
                }
                return;
            }

            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    // 5. View current task and move to next
    public void viewCurrentAndMoveNext() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println("Current Task: " + current.data);
        current = current.next;
    }

    // 6. Display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    // 7. Search by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.data.getPriority() == priority) {
                System.out.println(temp.data);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }
}


public class TaskSchedulerApp {
    public static void main(String[] args) {

        CircularTaskScheduler scheduler = new CircularTaskScheduler();

        scheduler.addAtEnd(new Task(1, "Design Module", 1, "2025-01-10"));
        scheduler.addAtEnd(new Task(2, "Implement Code", 2, "2025-01-12"));
        scheduler.addAtBeginning(new Task(3, "Requirement Analysis", 1, "2025-01-08"));
        scheduler.addAtPosition(new Task(4, "Testing", 3, "2025-01-15"), 3);

        System.out.println("All Tasks:");
        scheduler.displayTasks();

        System.out.println("\nView Current Task:");
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        System.out.println("\nSearch by Priority (1):");
        scheduler.searchByPriority(1);

        System.out.println("\nRemove Task:");
        scheduler.removeByTaskId(2);
        scheduler.displayTasks();
    }
}

