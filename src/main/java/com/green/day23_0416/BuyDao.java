package com.green.day23_0416;

import com.green.day22_0415.MemberDao;
import com.green.day22_0415.MemberEntity;
import com.green.day22_0415.MyConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BuyDao {
    private MyConnection myConn;
    public BuyDao() {
        myConn = new MyConnection();
    }
    public int insBuy (BuyEntity entity) {
        String sql = "INSERT INTO buy\n(mem_id, prod_name, group_name, price, amount)\nVALUES\n(?, ?, ?, ?, ?)";
        System.out.println(sql);

        try (Connection conn = myConn.getConn();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1,entity.getMemId()); // 첫번째 ?에 겟멤아이디를 넣겠다
            ps.setString(2,entity.getProdName());  // 두번째 //
            ps.setString(3,entity.getGroupName());
            ps.setInt(4,entity.getPrice());
            ps.setInt(5,entity.getAmount());

            return ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    //=====================================================================================
    //=====================================================================================
    public int updBuy (BuyEntity entity) {
        String sql = String.format("UPDATE buy\nSET mem_id = ?, prod_name = ?, group_name = ?, price = ?, amount = ?\nWHERE num = %d", entity.getNum());
        System.out.println(sql);
        try (Connection conn = myConn.getConn();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1,entity.getMemId());
            ps.setString(2,entity.getProdName());
            ps.setString(3,entity.getGroupName());
            ps.setInt(4,entity.getPrice());
            ps.setInt(5,entity.getAmount());

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int delBuy (int num) {
        String sql = "DELETE FROM buy\nWHERE num = ?";
        System.out.println(sql);
        BuyEntity entity = new BuyEntity();
        try(Connection conn = myConn.getConn();
            PreparedStatement ps = conn.prepareStatement(sql)){
            entity.setNum(num);
            ps.setInt(1,entity.getNum());

            return ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<BuySelVo> selBuyGroupMemId() {
        String sql = "SELECT mem_id, COUNT(amount) AS buy_count\nFROM buy\nGROUP BY mem_id";
        List<BuySelVo> list = new ArrayList<>();

        try (Connection conn = myConn.getConn();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String memId = rs.getString("mem_id");
                int buyCount = rs.getInt("buy_count");
                BuySelVo buySelVo = new BuySelVo(memId, buyCount);
                list.add(buySelVo);
            }

        } catch (Exception e){
            throw new RuntimeException(e);
        }

        return list;
    }

}
class Test {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();
        List<BuySelVo> list = buyDao.selBuyGroupMemId();

        System.out.println("\nmem_id\tbuy_count");
        for(BuySelVo buy : list) {
            System.out.println(buy);
        }
    }
}

class BuyDaoTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();
        BuyEntity buy = new BuyEntity();
        buy.setMemId("RED");
        buy.setProdName("구두");
        buy.setGroupName("패션");
        buy.setPrice(300);
        buy.setAmount(3);

        int row = buyDao.insBuy(buy);
        System.out.println(row);

    }
}

class BuyUpdTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();
        BuyEntity buy = new BuyEntity();

        buy.setNum(15);
        buy.setMemId("RED");
        buy.setProdName("제품");
        buy.setGroupName("그룹");
        buy.setPrice(400);
        buy.setAmount(2);
        int row = buyDao.updBuy(buy);
        System.out.println(row);
    }
}

class BuyDelTest {
    public static void main(String[] args) {
        BuyDao buyDao = new BuyDao();
        int row = buyDao.delBuy(15);
        System.out.println(row);
    }

}
