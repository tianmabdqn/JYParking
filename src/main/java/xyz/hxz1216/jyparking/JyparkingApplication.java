package xyz.hxz1216.jyparking;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "xyz.hxz1216.jyparking.mapper")
public class JyparkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JyparkingApplication.class, args);
	}

}
