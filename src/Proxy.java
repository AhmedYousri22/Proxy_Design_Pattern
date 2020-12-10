import java.util.Arrays;
import java.util.List;

public class Proxy implements InteretServiceProvider
{
    List<String> Blocked= Arrays.asList("Facebook " , "twitter" , "instagram");
    @Override
    public String serviceSite(String url) {
        if(Blocked.contains(url))
        {
            return "Blocked !";
        }

       return new Company().ServiceSite(url);
    }
}
