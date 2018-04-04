package com.light.springboot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Administrator
 *使用maven build打包，选择使用选项中使用org.apache.maven.plugins:maven-jar-plugin:2.4:jar org.springframework.boot:spring-boot-maven-plugin:1.0.1.RELEASE:repackage
 *参考：https://www.cnblogs.com/liangblog/p/6101797.html
 *打包完成后会在target目录下出现一个demo1-0.0.1-SNAPSHOT.jar包
 *使用java -jar demo1-0.0.1-SNAPSHOT.jar即可启动该文件
 */
@RestController
public class SampleController {
	 @Autowired
     private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }
	@RequestMapping("/sql")
	List<Map<String, Object>> getSqlData(){
		List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from log_info");
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
	}
}