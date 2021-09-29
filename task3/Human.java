package tasks.task3;

public class Human {
  private Head head;
  private Hand hand;
  private Leg leg;
  
  public Human(String a,String b,String c){
    head = new Head(a);
    hand = new Hand(b);
    leg = new Leg(c);
  }
  public String toString() {
    return "Этот человек " + head.getHead() + "\nОн имеет "+ hand.getHand() + " руки и "+leg.getLeg() +" ноги";
  }
  
}
