package com.adozgen.learnjava.exception.checked;

import com.adozgen.learnjava.exception.checked.custom.NetworkException;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataProcessor {

    public void fetchDataAndStore(String apiUrl, String dbUrl, String username, String password) {
        HttpURLConnection connection = null;
        Connection dbConnection = null;

        try {
            // Web servisine bağlanma
            URL url = new URL(apiUrl);
            connection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = connection.getInputStream();

            // JSON veri ayrıştırma
            String jsonStr = new String(inputStream.readAllBytes());
            JSONObject jsonObject = new JSONObject(jsonStr);

            // Veritabanı işlemleri
            dbConnection = DriverManager.getConnection(dbUrl, username, password);
            // Veritabanına veri ekleme işlemleri...

        } catch (IOException e) {
            System.err.println("Ağ hatası: " + e.getMessage());
            // Ağ ile ilgili hata yönetimi
        } catch (JSONException e) {
            System.err.println("JSON ayrıştırma hatası: " + e.getMessage());
            // JSON ayrıştırma hatası yönetimi
        } catch (SQLException e) {
            System.err.println("Veritabanı hatası: " + e.getMessage());
            // Veritabanı hatası yönetimi
        } finally {
            // Kaynakların temizlenmesi
            if (connection != null) {
                connection.disconnect();
            }
            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException e) {
                    System.err.println("Veritabanı bağlantısı kapatılırken hata: " + e.getMessage());
                }
            }
        }
    }
}
