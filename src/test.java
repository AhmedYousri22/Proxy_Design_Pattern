import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> states= Arrays.asList("ayous22","linkedin","Facebook " , "twitter" , "instagram");
InteretServiceProvider isp=new Proxy();
for(    String site:states)
{
    System.out.println(isp.serviceSite(site));
}
    }
}
