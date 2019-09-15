package Test;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestCommonsIODemo {
    public static void main(String[] args) throws Exception{
        //辅助2GB以下的小文件
        IOUtils.copy(new FileInputStream("D:\\迅雷下载\\upload\\1.png"), new FileOutputStream("1.png"));
        //辅助2GB以下的大文件
        IOUtils.copyLarge(new FileInputStream("D:\\迅雷下载\\upload\\1.png"), new FileOutputStream("1.png"));
        //拷贝文件到文件夹
        FileUtils.copyFileToDirectory(new File("D:\\迅雷下载\\upload\\1.png"),
                new File("D:\\IDEA-workspace\\HomeWork"));
        //拷贝文件夹到文件夹
        FileUtils.copyDirectoryToDirectory(new File("D:\\迅雷下载\\upload"),
                new File("D:\\IDEA-workspace\\HomeWork"));
    }
}
