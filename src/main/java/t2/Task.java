package t2;

import java.util.Scanner;

/**
 * Project name(项目名称)：作业_异常
 * Package(包名): t2
 * Class(类名): Task
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/24
 * Time(创建时间)： 19:54
 * Version(版本): 1.0
 * Description(描述)：
 * 输入：
 * 4
 * 2
 *
 * 输出：
 * 2
 *
 * 输入：
 * 4
 * 0
 *
 * 输出：
 * 除数不能为0
 */

public class Task
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        /********* Begin *********/


        try
        {
            System.out.println(num1/num2);
        }
        catch (Exception e)
        {
            System.out.println("除数不能为0");
        }


        /********* End *********/
    }
}
