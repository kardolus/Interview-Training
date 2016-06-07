package us.kardol.designpattern.proxy;

public class Proxy implements Subject {
    private Subject subject;

    @Override
    public String requestA() {
        if(subject == null){
            subject = new RealSubject();
        }
        return subject.requestA();
    }

    @Override
    public String requestB() {
        if(subject == null){
            System.out.println("Running custom/cached operation. No need to load real subject.");
            return "ProxyB";
        }else{
            return subject.requestB();
        }
    }

    @Override
    public String requestC() {
        subject.requestC();
        System.out.println("Proxies can be used to destroy real subject objects as well");
        subject = null;
        return "Destroyed RealSubject";
    }
}
