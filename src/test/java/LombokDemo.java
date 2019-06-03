import com.vo.TestLombok;
import org.junit.Test;

import java.util.HashMap;

public class LombokDemo {

    @Test
    public void test(){
        TestLombok testLombok = new TestLombok();
        testLombok.setA("11");
        System.out.println(testLombok.getA());
        HashMap<Object, Object> objectObjectHashMap = new HashMap<Object, Object>();
    }
}
