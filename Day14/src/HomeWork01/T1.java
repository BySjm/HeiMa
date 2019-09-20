package HomeWork01;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class T1 {
    public static void main(String[] args) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(T1.class.getResourceAsStream("/book2.xml"));
        System.out.println(document);
        //books
        Element rootElement = document.getRootElement();
        System.out.println("根元素" + rootElement.getName());
        System.out.println("---------------------------------");
        //获取到各个book
        List<Element> bookElements = rootElement.elements();
        for (Element bookElement : bookElements) {
            System.out.println("当前book的ID:" + bookElement.attributeValue("id"));
            System.out.println("当前book的出版社:" + bookElement.attributeValue("出版社"));
            List<Element> elements = bookElement.elements();
            System.out.println("当前book的具体信息:");
            System.out.println(bookElement.getName() + ":" + bookElement.elementText("name"));
            System.out.println(bookElement.getName() + ":" + bookElement.elementText("author"));
            System.out.println(bookElement.getName() + ":" + bookElement.elementText("price"));
            System.out.println(bookElement.getName() + ":" + bookElement.elementText("body"));
            System.out.println("----------------------------------");
        }
    }
}
