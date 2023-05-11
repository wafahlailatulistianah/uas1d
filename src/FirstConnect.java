import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class FirstConnect {
    public static void main(String[] args) throws IOException {
        ConnectURI koneksisaya = new ConnectURI();
            URL myAddress = koneksisaya.buildURL
        ("https://harber.mimoapps.xyz/api/getaccess.php");
            String ressponse = koneksisaya.getresponseFromHttpUrl(myAddress);
            System.out.println(ressponse);
            //decoding JSON
        assert ressponse != null;
        JSONArray responseJSON = new JSONArray(ressponse);
        ArrayList<responmodel2> responmodel2 =
                new ArrayList<>();
        for (int i=0;i< responseJSON.length();i++){Resp
        }



        }
    }

