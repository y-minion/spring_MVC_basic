package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 */

public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>(); //static 사용 -> DB를 메모리 상에서 보관. 한개만 존재해야하므로 static으로 생성
    private static long sequence = 0L; //static 사용

    private static final MemberRepository instance = new MemberRepository(); // 한개만 존재하도록 한다. -> 이걸 싱글톤으로 관리해서 위에 굳이 static이 아니여도 되지만, 일단 안전하게? 설정한다.

    public static MemberRepository getInstance() {
        return instance;
    }

    private MemberRepository() {

    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public void clearStore() {
        store.clear();

    }






}
