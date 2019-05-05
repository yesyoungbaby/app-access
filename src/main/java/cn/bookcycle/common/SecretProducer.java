package cn.bookcycle.common;

import java.util.Date;
import java.util.UUID;

/**
 * 
 *
 * @author liufenglin 
 * @email liufenglin@163.com
 * @date 2018年7月21日
 * @version 
 */
public class SecretProducer {

	public static String proAppId() {
		String appId = null;
		String prim = "prim";
		String date = String.valueOf(System.currentTimeMillis());
		appId = prim + date;
		return appId;
		
	}
	
	public static String proSecretKey() {
		
		String secretKey = null;
		secretKey = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
		return secretKey;
	}
	
	public static void main(String[] args) {
		System.out.println(proAppId());
		System.out.println(proSecretKey());
	}
}
