package demo5;

public abstract class AbsActor {

    public void act(Role role) {
        System.out.println("演员可以扮演任何角色");
    }

    public void act(KungFuRole role) {
        System.out.println("演员都可以演功夫角色");
    }
}
