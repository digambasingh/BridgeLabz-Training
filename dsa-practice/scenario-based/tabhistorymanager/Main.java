package com.bridgelabz.tabHistoryManager;

public class Main {
    public static void main(String[] args) {

        BrowserTab tab = new BrowserTab();

        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.forward();

        tab.closeTab();
        tab.restoreTab();
    }
}

