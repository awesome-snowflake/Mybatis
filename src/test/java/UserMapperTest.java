import com.wxf.dao.UserDao;
import com.wxf.utils.MybatisUtil;
import org.junit.Test;

public class UserMapperTest {
    @Test
    public void testAllDelete() {
        UserDao mapper = MybatisUtil.getMapper(UserDao.class);
        Integer integer = mapper.deleteByIds(new Integer[]{10, 11, 12});
        MybatisUtil.commit();
        System.out.println(integer);
    }
}
