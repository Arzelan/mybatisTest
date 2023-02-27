package cc.xdev.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Zhao Xiaonan
 * @date 2023年02月27日 10:50
 */
public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        String resource = "mybatis-config.xml";
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
