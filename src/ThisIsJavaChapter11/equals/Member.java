package thisIsJavaChapter11.equals;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Member) {
            Member member = (Member) o;
            if (id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        return id.hashCode();
    }
}
