public abstract class User {
    protected String userId;
    protected String name;
    protected String userType;

    public User(String userId, String name, String userType) {
        this.userId = userId;
        this.name = name;
        this.userType = userType;
    }

    public abstract void interact();
}
