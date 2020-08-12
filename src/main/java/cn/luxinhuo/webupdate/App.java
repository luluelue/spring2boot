package cn.luxinhuo.webupdate;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

public class App {
    public static void main(String[] args) throws ServletException, LifecycleException {
        System.out.println("init tomcat");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8006);

        tomcat.addWebapp("/", "C:\\Users\\duoyi\\Desktop\\ipa");
        tomcat.start();
        tomcat.getServer().await();
    }
}
