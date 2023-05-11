import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

    public class UTS1 {
        public static void main(String[] args) throws IOException {
            ConnectURI koneksisaya = new ConnectURI();
            URL myAddress = koneksisaya.buildURL
                    ("https://farmasi.mimoapps.xyz/mimoqss2auyqD1EAIkgZCOhiffSsFI6QqAEIGtM");
            String response = koneksisaya.getResponseFromHttpUrl(myAddress);
            System.out.println(response);
            //decoding JSON
            assert response != null;
            JSONArray responseJSON = new JSONArray(response);
            ArrayList<DataFarmasi> models =
                    new ArrayList<>();
            for (int i = 0; i < responseJSON.length(); i++) {
                DataFarmasi DataFar = new DataFarmasi();
                JSONObject myJSONObject =
                        responseJSON.getJSONObject(i);
                DataFar.setI_name(myJSONObject.
                        getString("i_name"));
                DataFar.setI_qty(myJSONObject.
                        getString("i_qyt"));
                DataFar.setI_cogs(myJSONObject.
                        getString("i_cogs"));
                DataFar.setI_kdsell(myJSONObject.getString("i_kdsell"));
                DataFar.setI_sell(myJSONObject.getString("i_sell"));
                models.add(DataFar);

            }
            System.out.println("Response are:");
            for (int index = 0; index < models.size(); index++) {
                String name = String.valueOf(models.get(index).getI_name().charAt(0));
                int stok = Integer.parseInt(models.get(index).getI_qty());
                int harga = Integer.parseInt(models.get(index).getI_sell());
                if (stok > 0) {
                    if (name.contains("B") && harga < 7000) {
                    }
                    System.out.println("NAMA BARANG : " +
                            models.get(index).getI_name());
                    System.out.println("HARGA JUAL: " +
                            models.get(index).getI_sell());
                    System.out.println("KODE BARANG: " +
                            models.get(index).getI_sell());
                    System.out.println("GROUP BARANG: " +
                            models.get(index).getI_sell());
                    System.out.println("Stok tersedia : " +
                            models.get(index).getI_qty());
                }

            }
        }
    }
}

