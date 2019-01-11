package com.weige.ssm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 注意事项  读取的yml文件结构为/{application}-{profile}.yml /bus/refresh 刷新所有消息总线
 * 本项目为config-client-dev.yml
 * @author yangyiwei
 * @date 2018年5月29日
 * @time 下午2:32:43
 */
@SpringBootApplication
@EnableEurekaClient//服务注册
public class CloudConfigClientApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigClientApplication.class, args);
	}
}
