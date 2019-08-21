# Servlet-Hello
首先新建一个空的Maven项目Servlet-Demo，具体的子项目全部以module形式存在。

## 配置
* 新建Module右键项目—New—Module—Java—Web Application

* 添加servlet-api，右键Module—Open Module Settings—Libraries—Java，选择本地Servlet jar包即可

* IntelliJ IDEA 配置tomcat:Run—Edit Configurations 选中tomcat 点击左上角+

## 源码
```java
public class HelloWorldServlet extends HttpServlet {

    public String message;

    public void init()  {
        message = "Hello Servlet";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h1>" + message + "</h1>");
    }
}
```

```xml

<servlet>
        <servlet-name>HelloWorldServlet</servlet-name>
        <servlet-class>com.demo.servlet.HelloWorldServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>HelloWorldServlet</servlet-name>
        <url-pattern>/HelloWorldServlet</url-pattern>
    </servlet-mapping>
```

## 验证方法
```text
http://localhost:8080/hello/
```
