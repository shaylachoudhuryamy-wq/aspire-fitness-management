import java.util.List;

public interface MemberDAO {
    boolean insertMember(Member member);
    Member getMemberById(int id);
    Member getMemberByEmail(String email);
    List<Member> getAllMembers();
    boolean updateMember(Member member);
    boolean deleteMember(int id);
    List<Member> searchMembers(String keyword);
    boolean updateWeeklyClassCount(int memberId, int newCount);
}