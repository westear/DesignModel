package FactoryAndStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 模拟交易最高层调用类
 */
public class Client {

    public static void main(String[] args) {
        Card card = initIC();
        System.out.println("========初始卡信息=======");
        showCard(card);
        boolean flag = true;
        while(true) {
            Trade trade = createTrade();
            DeductionFacade.deduct(card, trade);
            System.out.println("========交易凭证========");
            System.out.println("本次成功交易金额为：" + trade.getAmount() / 100.0 + "元");
            showCard(card);
            System.out.println("是否需要退出(Y/N)");
            if(getInput().equalsIgnoreCase("y")) {
                flag = false;
            }
        }
    }

    private static Card initIC() {
        Card card = new Card();
        card.setCardNo("111100011001");
        card.setFreeMoney(100000);
        card.setSteadyMoney(100000);
        return card;
    }

    private static Trade createTrade() {
        Trade trade = new Trade();
        System.out.println("请输入编号：");
        trade.setTradeNo(getInput());
        System.out.println("请输入交易金额：");
        trade.setAmount(Integer.parseInt(getInput()));
        return trade;
    }

    private static void showCard(Card card) {
        System.out.println("IC卡编号：" + card.getCardNo());
        System.out.println("固定类型编号：" + card.getSteadyMoney());
        System.out.println("自由类型编号：" + card.getFreeMoney());
    }

    public static String getInput() {
        String str = "";
        try {
            str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            //TODO 异常处理
        }
        return str;
    }
}
