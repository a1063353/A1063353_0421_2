
import java.util.Scanner;
public class A1063353_0421_2 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("請輸入日期（YYYY/MM/DD或MM/DD/YYT的格式）：");
	        String input = scanner.nextLine().trim();
	        String[] parts = input.split("/");
	        int year, month, day;
	        if (parts.length == 3) {
	            try {
	                year = Integer.parseInt(parts[0]);
	                month = Integer.parseInt(parts[1]);
	                day = Integer.parseInt(parts[2]);
	            } catch (NumberFormatException e) {
	                System.out.println("請輸入有效的日期格式。");
	                return;
	            }
	        } else if (parts.length == 2) {
	            try {
	                if (parts[2].length() != 2) {
	                    System.out.println("請輸入有效的日期格式。");
	                    return;
	                }
	                year = Integer.parseInt("20" + parts[2]);
	                month = Integer.parseInt(parts[0]);
	                day = Integer.parseInt(parts[1]);
	            } catch (NumberFormatException e) {
	                System.out.println("請輸入有效的日期格式。");
	                return;
	            }
	        } else {
	            System.out.println("請輸入有效的日期格式。");
	            return;
	        }
	        System.out.println("您輸入的日期為：" + year + "年" + month + "月" + day + "日");
	    }
	

}
