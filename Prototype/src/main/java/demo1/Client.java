package demo1;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 为了提高发送信件的效率，要把发信改成多线程，在这种情况下需要考虑Mail对象的资源竞争状况
 * Mail implements Cloneable 覆写 clone().
 * mail.clone() 将每个Mail克隆一遍
 */
public class Client {

    private static int MAX_COUNT = 6;

    public static AtomicInteger count = new AtomicInteger(0);

    //模拟发送邮件
    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            threadPool.execute(() ->{
                //把模板定义出来
                Mail mail = new Mail(new AdvTemplate());
                mail.setTail("XX银行所有");
                while (count.incrementAndGet() <= MAX_COUNT) {
                    //以下是每封邮件不同的地方,mail.clone() 将每个Mail复制一份
                    Mail cloneMail = mail.clone();
                    cloneMail.setApplication(getRandString(5) + " 先生（女士）");
                    cloneMail.setReceiver(getRandString(5) +"@" + getRandString(8) + ".com");
                    //发送邮件
                    System.out.println(Thread.currentThread().getName());
                    sendMail(cloneMail);
                }
            });
        }

        threadPool.shutdown();
    }

    //发送邮件
    public static void sendMail(Mail mail) {
        System.out.println("标题:" + mail.getSubject() + "\t收件人：" + mail.getReceiver() +"\t...发送成功");
    }

    //获得指定长度的随机字符串
    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
