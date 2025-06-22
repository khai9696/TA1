public class Admin extends User {
    public Admin(String userId, String name) {
        super(userId, name, "admin");
    }

    @Override
    public void interact() {
        System.out.println("Admin dapat menambahkan, menghapus, dan melihat daftar buku.");
    }
}
