public enum Department {
    IT("it"),
    FINANCE("fin"),
    HR("hr"),
    GENERAL("general");
    private String name;

    Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
