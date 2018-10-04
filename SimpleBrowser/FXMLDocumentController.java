
package browser;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private WebView WebView;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        WebEngine engine = WebView.getEngine();
        engine.load("http://www.google.com");
    }    
    
}
