package com.bridgelabz.filebackupschedular;

public class Main {
    public static void main(String[] args) {
        BackupScheduler scheduler = new BackupScheduler();

        try {
            scheduler.addTask(new BackupTask("/system", 10));
            scheduler.addTask(new BackupTask("/documents", 5));
            scheduler.addTask(new BackupTask("", 8)); // exception
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        scheduler.executeBackups();
    }
}

