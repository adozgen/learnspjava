package com.adozgen.learnjava.exception.checked;

import com.adozgen.learnjava.exception.checked.custom.DatabaseOperationException;
import com.adozgen.learnjava.exception.checked.custom.JsonParsingException;
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

public class AdvancedDataProcessor {

    public void fetchDataAndStore(String apiUrl, String dbUrl, String username, String password) throws NetworkException, JsonParsingException, DatabaseOperationException {
        HttpURLConnection connection = null;
        Connection dbConnection = null;

        try {
            // Web servisine bağlanma
            try {
                URL url = new URL(apiUrl);
                connection = (HttpURLConnection) url.openConnection();
            } catch (IOException e) {
                throw new NetworkException("Ağ hatası oluştu", e);
            }

            // JSON veri ayrıştırma
            try {
                InputStream inputStream = connection.getInputStream();
                String jsonStr = new String(inputStream.readAllBytes());
                JSONObject jsonObject = new JSONObject(jsonStr);
            } catch (IOException | JSONException e) {
                throw new JsonParsingException("JSON ayrıştırma hatası oluştu", e);
            }

            // Veritabanı işlemleri
            try {
                dbConnection = DriverManager.getConnection(dbUrl, username, password);
                // Veritabanına veri ekleme işlemleri...
            } catch (SQLException e) {
                throw new DatabaseOperationException("Veritabanı işlem hatası", e);
            }

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
