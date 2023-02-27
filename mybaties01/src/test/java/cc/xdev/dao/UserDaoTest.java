package cc.xdev.dao;

import cc.xdev.pojo.User;
import cc.xdev.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Zhao Xiaonan
 * @date 2023年02月27日 10:56
 */

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user.toString());
        }
        // 别忘了关闭
        sqlSession.close();

    }
}
