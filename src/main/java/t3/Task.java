package t3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Project name(项目名称)：作业_异常
 * Package(包名): t3
 * Class(类名): Task
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/24
 * Time(创建时间)： 19:56
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Task
{
    /********* Begin *********/
    //请在合适的部位添加代码
    public static void main(String[] args)
    {
        test();
    }

    public static void test()
    {
        File file = new File("abc");
        try
        {
            if (!file.exists())
            {        //判断文件是否存在
                //文件不存在，则 抛出 文件不存在异常
                throw new FileNotFoundException("该文件不存在");
            }
            else
            {
                FileInputStream fs = new FileInputStream(file);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Exception in thread \"main\" java.io.FileNotFoundException: 该文件不存在");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    /********* End *********/
}
