package actor;
import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.japi.pf.ReceiveBuilder;

public class FirstActor extends AbstractActor{

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create()
                .match(String.class,msg->System.out.println("Hi from actor 1"))

                .build();
    }

    public static Props props(){
       return Props.create(FirstActor.class);
    }


}
