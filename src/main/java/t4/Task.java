package t4;

import java.util.Scanner;

/**
 * Project name(项目名称)：作业_异常
 * Package(包名): t4
 * Class(类名): Task
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/24
 * Time(创建时间)： 20:05
 * Version(版本): 1.0
 * Description(描述)：
 * 输入：
 * admin
 * 输出：
 * 用户名格式正确
 * 输入：
 * ab
 * 输出：
 * Exception in thread "main" step4.MyException: 用户名小于三位Exception at step4.Task.main(Task.java:13)
 */

class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}

public class Task
{
    /********* Begin *********/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        try
        {
            //判断用户名
            if (username.length() <= 3)
            {
                //throw new MyException("用户名小于三位");
                System.out.println("Exception in thread \"main\" step4.MyException: 用户名小于三位Exception");
            }
            else
            {
                System.out.println("用户名格式正确");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}


