public class Librarian implements User {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    @Override
    public void showRole() {
        System.out.println(name + " is a Librarian");
    }
}
