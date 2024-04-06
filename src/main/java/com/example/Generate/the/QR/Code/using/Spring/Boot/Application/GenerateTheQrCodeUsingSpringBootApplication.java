package com.example.Generate.the.QR.Code.using.Spring.Boot.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenerateTheQrCodeUsingSpringBootApplication {

	/*
	 * Step 1. ) Add the ZXing Library
	 * 
	 * We are using ZXing Library to generate the QR Code, so it required to add two
	 * more dependencies in the pom.xml file as shown below.
	 * 
	 * Core image dependency
	 * 
	 * <dependency>
	 * <groupId>com.google.zxing</groupId>
	 * <artifactId>core</artifactId>
	 * <version>3.4.0</version>
	 * </dependency>
	 * 
	 * Step 2.) Add the Java Client dependency.
	 * 
	 * <dependency>
	 * <groupId>com.google.zxing</groupId>
	 * <artifactId>javase</artifactId>
	 * <version>3.4.0</version>
	 * </dependency>
	 * in pom.xml
	 */

	public static void main(String[] args) {
		SpringApplication.run(GenerateTheQrCodeUsingSpringBootApplication.class, args);
	}

	/*
	 * Step 6.) Run the Appication.
	 * 
	 * Go to the browser or POSTMAN and hit the
	 * http://localhost:8080/genrateAndDownloadQRCode/code/350/350
	 * 
	 * Now go inside the path src/main/resources and Right Click –> refresh the
	 * folder, you will able to see the QR Code Image saved with named QRCode.png
	 */

}
