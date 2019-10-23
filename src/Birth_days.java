import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: liuwei
 * @Date: 2019/10/23 0023 8:47
 */
public class Birth_days {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入出生日期 格式 YYYY-MM-dd");

        //获取出生日期
        String brithdayString = new Scanner(System.in).next();
        //将字符串日期,转成Date对象
        //创建SimpleDateFormar 对象,写日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //调用方法parse,字符串转成日期对象
        Date birthdayDate = sdf.parse(brithdayString);
        //获取今天的日期对象
        Date todayDate = new Date();
        //将两个日期转成毫秒值,Date类的方法getTime
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long secone = todaySecond - birthdaySecond;
        if (secone<0){
            System.out.println("还没有出生呢");
        }else {
            System.out.println(secone/1000/60/60/24);
        }
    }
}
