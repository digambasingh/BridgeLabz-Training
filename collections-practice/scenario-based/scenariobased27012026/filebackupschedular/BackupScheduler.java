package com.bridgelabz.filebackupschedular;

import java.util.PriorityQueue;

class BackupScheduler {
    private PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    public void addTask(BackupTask task) throws InvalidBackupPathException {
        if (task.getFolderPath() == null || task.getFolderPath().isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path");
        }
        queue.add(task);
    }

    public void executeBackups() {
        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            System.out.println("Executing " + task);
        }
    }
}

