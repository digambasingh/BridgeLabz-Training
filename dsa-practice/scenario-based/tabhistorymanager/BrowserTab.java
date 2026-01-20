package com.bridgelabz.tabHistoryManager;

import java.util.Stack;

class BrowserTab {

    private PageNode current;
    private Stack<PageNode> closedTabs = new Stack<>();

    // Visit a new page
    public void visit(String url) {
        PageNode newPage = new PageNode(url);

        if (current != null) {
            current.next = newPage;
            newPage.prev = current;
        }
        current = newPage;

        System.out.println("Visited: " + url);
    }

    // Back navigation
    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("No page to go back!");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }

    // Forward navigation
    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("No page to go forward!");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.url);
    }

    // Close current tab
    public void closeTab() {
        if (current == null) {
            System.out.println("No tab open!");
            return;
        }

        closedTabs.push(current);
        System.out.println("Tab closed: " + current.url);

        // Move to previous page if exists
        if (current.prev != null) {
            current = current.prev;
            current.next = null;
        } else {
            current = null;
        }
    }

    // Restore last closed tab
    public void restoreTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore!");
            return;
        }

        current = closedTabs.pop();
        System.out.println("Restored tab: " + current.url);
    }
}

