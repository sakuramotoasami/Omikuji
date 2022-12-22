package jp.co.jtech.JtcApp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import lombok.Data;

@Data
public class OmikujiEntity {
	private String name;
		
	
	public String getResult() {
		Random random = new Random();
		int num = random.nextInt(6);
		String result = null;
		switch(num) {
		case 0:
			result= "大吉";
			break;
		case 1:
			result= "中吉";
			break;
		case 2:
			result= "吉";
			break;
		case 3:
			result= "小吉";
			break;
		case 4:
			result= "末吉";
			break;
		case 5:
			result= "凶";
			break;
		}
		return result;
	}
	
	public String getDate() {
		Date nowDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		return sdf.format(nowDate);
	}
	
	

}
