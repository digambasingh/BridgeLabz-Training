package com.bridgelabz.dsa;

class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;

    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {

    private ProcessNode head = null;
    private ProcessNode tail = null;
    private int processCount = 0;

    /* ---------------- ADD PROCESS ---------------- */

    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        processCount++;
    }

    /* ---------------- REMOVE PROCESS ---------------- */

    private void removeProcess(ProcessNode prev, ProcessNode curr) {

        if (curr == head && curr == tail) {
            head = tail = null;
        } else if (curr == head) {
            head = head.next;
            tail.next = head;
        } else if (curr == tail) {
            tail = prev;
            tail.next = head;
        } else {
            prev.next = curr.next;
        }
        processCount--;
    }

    /* ---------------- DISPLAY ---------------- */

    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }

        ProcessNode temp = head;
        do {
            System.out.print(
                "[P" + temp.processId +
                " | RT=" + temp.remainingTime + "] -> "
            );
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }

    /* ---------------- ROUND ROBIN SIMULATION ---------------- */

    public void simulate(int timeQuantum) {

        if (head == null) return;

        int currentTime = 0;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;

        ProcessNode curr = head;
        ProcessNode prev = tail;

        System.out.println("Round Robin Execution Start");

        while (processCount > 0) {

            System.out.println("Current Queue:");
            displayProcesses();

            if (curr.remainingTime > 0) {

                int executionTime =
                    Math.min(timeQuantum, curr.remainingTime);

                System.out.println(
                    "Executing P" + curr.processId +
                    " for " + executionTime + " units"
                );

                curr.remainingTime -= executionTime;
                currentTime += executionTime;
            }

            // Process completed
            if (curr.remainingTime == 0) {

                int turnAroundTime = currentTime;
                int waitingTime = turnAroundTime - curr.burstTime;

                totalWaitingTime += waitingTime;
                totalTurnAroundTime += turnAroundTime;

                System.out.println(
                    "P" + curr.processId +
                    " completed , WT=" + waitingTime +
                    " , TAT=" + turnAroundTime
                );

                ProcessNode nextProcess = curr.next;
                removeProcess(prev, curr);
                curr = nextProcess;
            } else {
                prev = curr;
                curr = curr.next;
            }

            System.out.println();
        }

        System.out.println("Scheduling Completed");
        System.out.println("Average Waiting Time: "
                + (double) totalWaitingTime / (totalWaitingTime == 0 ? 1 : (totalWaitingTime / totalWaitingTime)));
        System.out.println("Average Turnaround Time: "
                + (double) totalTurnAroundTime / (totalTurnAroundTime == 0 ? 1 : (totalTurnAroundTime / totalTurnAroundTime)));
    }
}

public class RoundRobinApp {

    public static void main(String[] args) {

        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        int timeQuantum = 4;

        scheduler.simulate(timeQuantum);
    }
}
