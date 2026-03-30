public class LibraryApp {

    public static void main(String[] args) {

        LibraryCatalog catalog = LibraryCatalog.getInstance();

        User student = UserFactory.createUser("student", "Alice");
        User faculty = UserFactory.createUser("faculty", "Dr. Bob");

        student.showRole();
        faculty.showRole();

        Observer obs1 = new UserObserver("Alice");
        Observer obs2 = new UserObserver("Dr. Bob");

        catalog.addObserver(obs1);
        catalog.addObserver(obs2);

        Book book = new Book.BookBuilder("Design Patterns")
                .author("GoF")
                .edition("2nd")
                .genre("Software Engineering")
                .build();

        catalog.addBook(book);
    }
}
