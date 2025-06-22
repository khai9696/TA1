public class Member extends User {
    public Member(String userId, String name) {
        super(userId, name, "member");
    }

    @Override
    public void interact() {
        System.out.println("Member hanya dapat meminjam dan mengembalikan buku.");
    }
}
