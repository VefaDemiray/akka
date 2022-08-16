import actor.FirstActor;
import actor.SecondActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;

public class App {

    public static void main(String[] args) {


        ActorSystem akkaSystem=ActorSystem.create("system");
        ActorRef firstActor = akkaSystem.actorOf(FirstActor.props(),"FirstActor");
        ActorRef secondActor = akkaSystem.actorOf(SecondActor.props(),"SecondActor");


        String y ="Hi From Actor 2";
        secondActor.tell(y,ActorRef.noSender());



        String x = "Hi From Actor1";
        firstActor.tell(x,ActorRef.noSender());







    }


}
