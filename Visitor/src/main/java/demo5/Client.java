package demo5;

public class Client {

    public static void main(String[] args) {
        /*
         * 重载在编译器期决定了调用哪个方法，根据Role的表面类型决定调用 demo5.AbsActor.act(demo5.Role); 这是静态绑定
         * 而Actor的执行方法 act(new KungFunRole()); 则是由实际类型决定的，这是动态绑定
         */
        AbsActor actor = new OldActor();
        Role role = new KungFuRole();
        actor.act(role);
        actor.act(new KungFuRole());

        //引入访问者模式后，修改调用: 不管演员类和角色类怎么变化，都能够找到期望的方式运行，这就是双分派
        System.out.println("===== 引入访问者模式后，修改调用 ======");
        AbsActor absActor = new OldActor();
        Role role1 = new KungFuRole();
        role1.accept(absActor);
    }
}
