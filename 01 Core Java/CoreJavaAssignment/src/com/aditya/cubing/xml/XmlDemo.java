import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import java.io.InputStream;

public class XmlDemo {

    public static void main(String[] args) {

        try {
            // Loading XML file from classpath using ClassLoader
            InputStream inputStream =
                    XmlDemo.class.getClassLoader().getResourceAsStream("cube.xml");

            // Creating DocumentBuilderFactory instance
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Creating DocumentBuilder from factory
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Parsing XML file to Document object
            Document document = builder.parse(inputStream);

            // Normalizing XML document structure
            document.getDocumentElement().normalize();
            // Accessing root element and getting node name
            System.out.println("Root element: " +
                    document.getDocumentElement().getNodeName());

        } catch (Exception exception) {
            // Exception handling for XML parsing
            System.out.println("XML parsing error");
        }
    }
}
