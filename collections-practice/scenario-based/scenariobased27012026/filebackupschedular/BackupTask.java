package com.bridgelabz.filebackupschedular;

class BackupTask implements Comparable<BackupTask> {
    private String folderPath;
    private int priority; // higher = more important

    public BackupTask(String folderPath, int priority) {
        this.folderPath = folderPath;
        this.priority = priority;
    }

    public String getFolderPath() {
        return folderPath;
    }

    @Override
    public int compareTo(BackupTask other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Backup: " + folderPath + " (Priority " + priority + ")";
    }
}

