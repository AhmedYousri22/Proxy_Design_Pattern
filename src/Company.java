public class Company {
    public Company()
    {

    }
    public String ServiceSite(String url) {
        return String.format("https://%s.com",url);
    }
}
