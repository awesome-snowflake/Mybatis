import com.wxf.dao.DepartmentMapper;
import com.wxf.dao.EmployeeMapper;
import com.wxf.entity.Department;
import com.wxf.entity.Employee;
import com.wxf.utils.MybatisUtil;
import org.junit.Test;

public class MybatisOneToMany {
    @Test
    public void testOneToMany() {
        DepartmentMapper mapper = MybatisUtil.getMapper(DepartmentMapper.class);
        Department department = mapper.selectDepartmentById(1);
        System.out.println(department);
    }
    @Test
    public void testOneToMany2() {
        EmployeeMapper mapper = MybatisUtil.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectEmployeeById(1);
        System.out.println(employee);
    }
}
