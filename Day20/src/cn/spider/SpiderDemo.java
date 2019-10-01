package cn.spider;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class SpiderDemo {
    public static void main(String[] args) throws Exception {

        //System.out.println(URLEncoder.encode("国内游", "UTF-8"));

        String url = "http://www.jinmalvyou.com/search/index/view_type/1/keyword/%E5%9B%BD%E5%86%85%E6%B8%B8";
        //爬取数据
        findRouteData(url);
    }

    //爬取数据
    private static void findRouteData(String url) throws Exception {
        //获取整个页面的Document对象
        Document document = Jsoup.connect(url).get();
        //获取标签元素的内容
        Elements els = document.select(".rl-b2>li");
        //遍历每个标签
        for (Element el : els) {
            //大标题
            String bigTitle = el.select(".pro-title").get(0).text();
            System.out.println(bigTitle);
            //小标题
            String littleTitle = el.select(".pro-colomn").get(0).text();
            System.out.println(littleTitle);
            //价格
            String price = el.select(".price").get(0).text();
            System.out.println(price);
            //图片
            String img = el.select(".pro-img img").get(0).attr("src");
            System.out.println(img);
            //保存图片到本地
            saveImg(img);
            System.out.println("--------------------------------------------------");
        }

        //继续递归，获取下一页的内容
        Elements nextPage = document.select(".next");
        if (nextPage.size() > 0) {
            String anotherUrl = "http://www.jinmalvyou.com" + nextPage.get(0).attr("href");
            findRouteData(anotherUrl);
        }

    }

    private static void saveImg(String img) throws Exception {
        //创建一个客户端
        CloseableHttpClient client = HttpClients.createDefault();
        //创建一个get请求
        HttpGet get = new HttpGet("http:" + img);
        //使用客户端发送get请求
        CloseableHttpResponse response = client.execute(get);
        //从响应中获取内容
        HttpEntity content = response.getEntity();
        //从内容中获取一个输入流
        InputStream is = content.getContent();
        //创建一个输出流
        String imgName = img.substring(img.lastIndexOf("/") + 1);
        FileOutputStream os = new FileOutputStream("E:/img/" + imgName);
        //流的拷贝
        IOUtils.copy(is, os);
        //关流
        os.close();
        is.close();
    }
}
