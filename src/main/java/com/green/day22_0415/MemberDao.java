package com.green.day22_0415;

import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    // member 테이블용 Data Access Object
    private MyConnection myConn;
    public MemberDao() {
        myConn = new MyConnection();
    }
    // =====================================================================================
    // insert
    // =====================================================================================
    public int insMember(MemberEntity entity) {
        String sql = String.format("INSERT INTO member\n" +
                "(mem_id, mem_name, mem_number, addr, phone1, phone2, height, debut_date)" +
                "\nVALUES\n" +
                "('%s', '%s', %d, '%s', '%s', '%s', %d, '%s')"
                , entity.getMemId(), entity.getMemName(), entity.getMemNumber(), entity.getAddr()
                , entity.getPhone1(), entity.getPhone2(), entity.getHeight(), entity.getDebutDate());

        System.out.println(sql);

        Connection conn = null;
        Statement stat = null;
        // conn = myConn.getConn();  // 커넥션을 얻어옴
                                    // myConn.getConn 이 throws 하고있어서 빨간줄 생김
        int result = 0;
        try {
            conn = myConn.getConn();  // 길을 열어줌
            stat = conn.createStatement();  // 쿼리문을 실행함
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat,conn);  // 닫을때는 반대로 함
        }

        return result;
    }
    // =====================================================================================
    // update
    // =====================================================================================
    int updMember(MemberEntity entity) {
        String mid = "";

        if (entity.getMemName() != null && entity.getMemName().length() > 0) {
            mid += String.format(", mem_name = '%s'\n", entity.getMemName());
        }
        if (entity.getMemNumber() > 0){
            mid += String.format(", mem_number = %d\n", entity.getMemNumber());
        }
        if (entity.getAddr() != null && entity.getAddr().length() > 0) {
            mid += String.format(", addr = '%s'\n", entity.getAddr());
        }
        if (entity.getPhone1() != null && entity.getPhone1().length() > 0) {
            mid += String.format(", phone1 = '%s'\n", entity.getPhone1());
        }
        if (entity.getPhone2() != null && entity.getPhone2().length() > 0) {
            mid += String.format(", phone2 = '%s'\n", entity.getPhone2());
        }
        if (entity.getHeight() > 0){
            mid += String.format(", height = %d\n", entity.getHeight());
        }

        mid = mid.substring(2);

        String sql = String.format("UPDATE member\nSET %sWHERE mem_id = '%s'", mid, entity.getMemId());

        System.out.println(sql);

        Connection conn = null;
        Statement stat = null;
        // conn = myConn.getConn();  // 커넥션을 얻어옴
        // myConn.getConn 이 throws 하고있어서 빨간줄 생김
        int result = 0;
        try {
            conn = myConn.getConn();  // 길을 열어줌
            stat = conn.createStatement();  // 쿼리문을 실행함
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat,conn);  // 닫을때는 반대로 함
        }

        return result;
    }
    // =====================================================================================
    // delete
    // =====================================================================================
    public int delMember(MemberEntity entity) {
        String sql = String.format("DELETE FROM member\nWHERE mem_id = '%s'", entity.getMemId());

        System.out.println(sql);

        Connection conn = null;
        Statement stat = null;
        // conn = myConn.getConn();  // 커넥션을 얻어옴
        // myConn.getConn 이 throws 하고있어서 빨간줄 생김
        int result = 0;
        try {
            conn = myConn.getConn();  // 길을 열어줌
            stat = conn.createStatement();  // 쿼리문을 실행함
            result = stat.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(stat,conn);  // 닫을때는 반대로 함
        }

        return result;
    }
    // =====================================================================================
    // select
    // =====================================================================================
    public MemberEntity selMember(String memId) {

        String sql = String.format("SELECT mem_id, mem_name, mem_number, addr, phone1"
                + ", phone2, height, debut_date" +
                "\nFROM member\nWHERE mem_id = '%s'", memId);
        System.out.println(sql);

        try (Connection conn = myConn.getConn();
             Statement stat = conn.createStatement();
             ResultSet rs = stat.executeQuery(sql)) {
            if (rs.next()) {
                MemberEntity entity = new MemberEntity();
                entity.setMemId(rs.getString("mem_id"));
                entity.setMemName(rs.getString("mem_name"));
                entity.setMemNumber(rs.getInt("mem_number"));
                entity.setAddr(rs.getString("addr"));
                entity.setPhone1(rs.getString("phone1"));
                entity.setPhone2(rs.getString("phone2"));
                entity.setHeight(rs.getInt("height"));
                entity.setDebutDate(rs.getString("debut_date"));

                return entity;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public List<MemberEntity> selMemberList(){
        List<MemberEntity> list = new ArrayList<>();
        String sql = "SELECT mem_id, mem_name, debut_date\nFROM member\nORDER BY debut_date DESC";
//        Connection conn = null; // 연결담당, 땅굴을 판다
//        Statement stat = null;  // 커넥션이 얘를 만들어낸다. 쿼리문을 실행함.
//        ResultSet rs = null;    // 여기에 정보들이 전부 저장이 됨 > 가공필요
//        try {
//            conn = myConn.getConn();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            myConn.close(rs, stat, conn);
//        }
        try( Connection conn = myConn.getConn();
             Statement stat = conn.createStatement();
             ResultSet rs= stat.executeQuery(sql)) {

//            rs.next();  // 첫 레코드를 가리킴, 첫줄에 레코드가 있으면 true
//            rs.next();  // 그다음 레코드를 가리킴
            while (rs.next()) {
                String memId = rs.getString("mem_id");
                String memName = rs.getString("mem_name");
                String debutData = rs.getString("debut_date");
                MemberEntity member = new MemberEntity();
                list.add(member);
                member.setMemId(memId);
                member.setMemName(memName);
                member.setDebutDate(debutData);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}

class SubString{
    public static void main(String[] args) {
        String str = "123456";
        System.out.println(str.substring(3));  // 비파괴메소드  원본은 바뀌지 않음
        System.out.println(str.substring(3,5));

        String str2 = ", 안녕, 하하, 좋아요";
       // System.out.println(str2.startsWith(","));
        String str3 = str2.substring(2);
        System.out.println(str3);

    }
}
