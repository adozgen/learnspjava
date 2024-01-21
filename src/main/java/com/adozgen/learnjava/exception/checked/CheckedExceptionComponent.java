package com.adozgen.learnjava.exception.checked;

import com.adozgen.learnjava.exception.checked.custom.DatabaseOperationException;
import com.adozgen.learnjava.exception.checked.custom.JsonParsingException;
import com.adozgen.learnjava.exception.checked.custom.NetworkException;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class CheckedExceptionComponent {

    @PostConstruct
    public void init() {
        DataProcessor dataProcessor = new DataProcessor();
        AdvancedDataProcessor advancedDataProcessor = new AdvancedDataProcessor();
        dataProcessor.fetchDataAndStore("x", "y", "a", "b");
        try {
            advancedDataProcessor.fetchDataAndStore("x", "y", "a", "b");
        } catch (NetworkException e) {
            System.err.println("Ağ hatası meydana geldi: " + e.getMessage()); // Özel hata mesajı
            // Burada kullanıcıya daha anlaşılır bir mesaj gösterebilirsiniz
        } catch (JsonParsingException e) {
            System.err.println("Veri ayrıştırma hatası: " + e.getMessage()); // Özel hata mesajı
            // Burada alternatif bir işlem yapabilirsiniz
        } catch (DatabaseOperationException e) {
            System.err.println("Veritabanı işlemi sırasında bir hata oluştu: " + e.getMessage()); // Özel hata mesajı
            // Burada hata kaydı oluşturabilirsiniz
        }

    }
}
