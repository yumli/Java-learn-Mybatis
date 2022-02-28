import org.junit.Test;

/**
 * @author Camille
 * @create 2021-04-05 17:06
 */
public class StringTest {

    @Test
    public void test1(){
        String s=null;
        StringBuffer sb=new StringBuffer();//16
        sb.append(s);
        System.out.println(sb.length());
        System.out.println(sb);
        StringBuffer sb2=new StringBuffer(sb);
        System.out.println(sb2);


    }
}
