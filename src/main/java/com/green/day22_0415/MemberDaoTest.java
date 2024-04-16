package com.green.day22_0415;

import java.util.List;

// create (insert)
public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memDao = new MemberDao();

        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemName("뉴진스");
        member.setMemNumber(4);
        member.setAddr("대구");
        member.setPhone1("053");
        member.setPhone2("77777777");
        member.setHeight(166);
        member.setDebutDate("2022-10-01");

        System.out.println(memDao.insMember(member));
        int affectedRow = memDao.insMember(member);
        System.out.printf("affectedRow: %d", affectedRow);
    }
}

// update
class MemberUpdateDaoTest {
    public static void main(String[] args) {
        MemberDao memDao = new MemberDao();

        MemberEntity member = new MemberEntity();
        member.setMemId("NJS");
        member.setMemNumber(6);
        member.setAddr("제주");

        int affectedRow = memDao.updMember(member);
        System.out.printf("affectedRow: %d", affectedRow);
    }
}

// delete
class MemberDeleteDaoTest {
    public static void main(String[] args) {
        MemberDao memDao = new MemberDao();

        MemberEntity member = new MemberEntity();

        member.setMemId("NJS");
        int affectedRow = memDao.delMember(member);
        System.out.printf("affectedRow: %d", affectedRow);
    }
}

// read (select)
class MemberSelectDaoTest {
    public static void main(String[] args) {
       MemberDao dao = new MemberDao();
        List<MemberEntity> list = dao.selMemberList();

        for(MemberEntity member : list) {
            System.out.println(member);
        }
    }
}

class MemberTest {
    public static void main(String[] args) {
        MemberDao memDao = new MemberDao();

        MemberEntity member = memDao.selMember("APN");
        System.out.println(member);

    }
}
