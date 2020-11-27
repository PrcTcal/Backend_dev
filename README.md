# Backend_dev

This project aims to build my own web.<br><br>

tools:<br>
Spring boot, Maven<br><br>

2020-11-26 ~ now : Spring boot test & initial settings<br><br>

2020-11-28 quick fix :<br> 
  cannot load driver class:com.mysql.cj.jdbc.Driver error occurred.<br>
solution:<br>
  1) mysql connector, mybatis dependency check<br>
    - mysql-connector-java : version not needed<br>
    - mybatis-spring-boot-starter : version needed<br>
  2) check spring.datasource.driverClassName in application.properties<br>
    - type 'com.mysql.cj.jdbc.Driver' if you're using mysql connector version over 8.0<br>
    - check if there's any blank after 'com.mysql.cj.jdbc.Driver' -> <p style="color:red">my case</p><br>
