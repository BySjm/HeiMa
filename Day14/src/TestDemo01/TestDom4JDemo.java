package TestDemo01;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class TestDom4JDemo {
    public static void main(String[] args) throws Exception{
        SAXReader reader = new SAXReader();
        Document document = reader.read(TestDom4JDemo.class.getResourceAsStream("/book.xml"));
        Element rootElement = document.getRootElement();
        List<Element> bookElements = rootElement.elements();
        for (Element bookElement : bookElements) {
            System.out.println(bookElement.getName());
            String idValue = bookElement.attributeValue("id");
            System.out.println(idValue);
//            List<Element> elements = bookElement.elements();
//            for (Element element : elements) {
//                System.out.println(element.getName());
//                System.out.println(element.getText());
//            }
//            System.out.println("====================");
            System.out.println("子元素name的元素是:" + bookElement.elementText("name"));
            System.out.println("子元素author的元素是:" + bookElement.elementText("author"));
            System.out.println("子元素sale的元素是:" + bookElement.elementText("sale"));
        }
    }
}
