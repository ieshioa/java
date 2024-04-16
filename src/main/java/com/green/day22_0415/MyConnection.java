package com.green.day22_0415;

import java.sql.*;

public class MyConnection {
    // 자바랑 SQL 연결하기
    private final String DRIVER = "org.mariadb.jdbc.Driver";
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "market_db";
    private final String USERNAME = "root";
    private final String PASSWORD = "green502";
    // 이것들만 주면 나머지는 스프링에서 알아서 함 ?

    public Connection getConn() throws SQLException, ClassNotFoundException{
        String url = String.format("jdbc:mariadb://%s:%s/%s", HOST, PORT, DB_NAME);
        Class.forName(DRIVER);
        Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
        System.out.println("DB 접속 완료!");
        return conn;
    }

    public void close (Connection conn) {
        if (conn == null) {
            return;
        }
        // conn.close();
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }
    }
    public void close (Statement stat, Connection conn) {
//        if (conn == null && stat == null) {
//            return;
//        }
//        try {
//            stat.close();
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        // 이렇게 하면 혼납니다
        // stat 닫을때 에러가 터지면 바로 캐치로 가버리니까 실행이 안됨
        // 그래서 따로따로 해야함

        // 아래처첨 해야합니다
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn);
    }
    public void close (ResultSet rs, Statement stat, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(stat, conn);
    }
}

class MyconnTest {
    public static void main(String[] args) {
        MyConnection myConn = new MyConnection();
        // Connection con = myC.getConn();
        Connection conn = null;
        try {
            conn = myConn.getConn();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConn.close(conn);
        }
    }
}
