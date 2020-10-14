import com.wxf.dao.PassengerDao;
import com.wxf.entity.Passenger;
import com.wxf.utils.MybatisUtil;
import org.junit.Test;

public class MybatisOneToOneTest {
    @Test
    public void testOneToOne() {
        PassengerDao passengerDao = MybatisUtil.getMapper(PassengerDao.class);
        Passenger passenger = passengerDao.selectPassengerById(1001);
        System.out.println(passenger);
    }
}
