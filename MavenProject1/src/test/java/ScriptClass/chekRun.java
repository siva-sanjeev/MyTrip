package ScriptClass;

import java.text.DateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DataFormat;

public class chekRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date dc = new Date();
		
		
		System.out.println("It is working");
		System.out.println(dc.getDate());
		System.out.println(dc.getMonth());
		System.out.println(dc.getDay());
	}

}
