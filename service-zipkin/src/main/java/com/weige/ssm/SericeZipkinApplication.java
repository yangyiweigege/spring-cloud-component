package com.weige.ssm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;
/**
 * 服务链路追踪
 * @author yangyiwei
 * @date 2018年6月1日
 * @time 下午2:51:45
 */
@SpringBootApplication
@EnableZipkinServer
public class SericeZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SericeZipkinApplication.class, args);
	}
}
