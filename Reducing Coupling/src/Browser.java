public class Browser {

    public void navigate(String address){
        String ip = findIpAddress(address);
        String html = findHttpRequest(ip);
        System.out.println(html);
    }

    private String findIpAddress(String address){
        return null;
    }

    private String findHttpRequest(String ip){
        return "<html> </html>";
    }
}
