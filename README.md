# Selenium-Web-Driver-Manager-Example

This is a sample project, implemented using Web Driver Manager which allows to automate the management of the binary drivers (Ex: geckodriver, chromedriver, phantomdriver & etc) required by selenium web driver. 

### Introdution

Previously to run automation scripts in different browsers using selenium web drivers we have to manually download the driver which is compatible with the browser version of your computer. 
And have to set the path for the driver as below: 

```
System.setProperty("webdriver.chrome.driver", "/path/to/binary/chromedriver");
System.setProperty("webdriver.gecko.driver", "/path/to/binary/geckodriver");
System.setProperty("webdriver.opera.driver", "/path/to/binary/operadriver");
System.setProperty("phantomjs.binary.path", "/path/to/binary/phantomjs");
System.setProperty("webdriver.edge.driver", "C:/path/to/binary/msedgedriver.exe");
System.setProperty("webdriver.ie.driver", "C:/path/to/binary/IEDriverServer.exe");
```

This is quite annoying since it forces you to link directly this binary file into your source code. In addition, you have to check manually when new versions of the binaries are released. Also when the browser get updated time to time additionally we have to download exact driver version and set the path in oder to run the scripts. 

This is where WebDriverManager comes into the picture, performing in an automated way to do this dirty processes for you.

WebDriverManager is open source, released under the terms of [Apache 2.0 License.](http://www.apache.org/licenses/LICENSE-2.0)

### WebDriverManager Java Dependencies

1. You can download the WebDriverManager JAR file from here manually. 
[Download WebDriverManager.](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)

2. Inorder to use the WebDriverManager for tests in a Maven project you can use the following dependency in your `pom.xml`. 

```
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>3.7.1</version>
    <scope>test</scope>
</dependency>
```
3. In Gradle Project use as below

```
dependencies {
    testCompile("io.github.bonigarcia:webdrivermanager:3.7.1")
}
```

### Uses of WebDriverManager

Simply using `WebDriverManager.<DriverType>.setup();` WebDriverManager do the following for you. 

* It checks the version of the browser which is installed in your machine. (Ex: Chrome, Firefox).
* It checks the version of the driver (Ex: chromeDriver, geckoDriver). If the version is unknown it will use the latest version of the driver.
* It downloads the WebDriver binary if it is not present on the WebDriverManager cache `(~/.m2/repository/webdriver by default)`. It exports the proper WebDriver Java enviorment variables required by Selenium.
* WebDriverManager resolves the driver binaries for the browsers Chrome, Firefox, Opera & etc. For that, it provides several drivers managers for these browsers. These drivers managers can be used as below.

```
WebDriverManager.chromedriver().setup();
WebDriverManager.firefoxdriver().setup();
WebDriverManager.operadriver().setup();
```

### Required JAR files for run these automation scripts using Selenuim & WebDriverManager

- client-combined.jar
- byte-buddy.jar
- commons-exec.jar
- guava-jre.jar
- okhttp.jar
- okio.jar
- webdrivermanager.jar
- httpclient.jar
- httpcore.jar
- slf4j-api.jar
- slf4j-simple.jar
- commons-lang3.jar
- commons-logging.jar
- commons-io.jar

Some of these JAR files can be get, ones you download the selenium web driver. 

### Exceptions can be occur and how to solve it

* **Exception in thread "main" java.lang.NoClassDefFoundError: org/apache/http/client/methods/HttpRequestBase**

If this kind of exception occurs you have to add the following dependencies for the project
  1. httpclient
  2. httpcore
  
* **Exception in thread "main" java.lang.NoClassDefFoundError: org/slf4j/LoggerFactory**

If this kind of exception occurs you have to add the following dependencies for the project
  1. slf4j-api
  2. slf4j-simple
  
* **Exception in thread "main" java.lang.NoClassDefFoundError: org/apache/commons/lang3/SystemUtils**

If this kind of exception occurs you have to add the following dependencies for the project
  1. commons-lang3
  
* **Exception in thread "main" java.lang.NoClassDefFoundError: org/apache/commons/logging/LogFactory**

If this kind of exception occurs you have to add the following dependencies for the project
  1. commons-logging
  
* **Exception in thread "main" java.lang.NoClassDefFoundError: org/apache/commons/io/IOUtils**

If this kind of exception occurs you have to add the following dependencies for the project
  1. commoins-io
  

## For more information you can go through the following reference. 
[Automatic management of Selenium WebDriver binaries](https://github.com/bonigarcia/webdrivermanager#table-of-contents)
  







