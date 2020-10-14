import com.wxf.dao.PassengerDao;
import com.wxf.entity.Passenger;
import com.wxf.utils.MybatisUtil;
import org.junit.Test;

public class MybatisMapperTest {
    @Test
    public void testMapper() {
        PassengerDao mapper = MybatisUtil.getMapper(PassengerDao.class);
        Passenger passenger = mapper.selectPassengerById(1001);
        System.out.println(passenger);
    }
}
