class Person {
  private int id;
  private static int autoId;
  protected String name;
  private String address;
  protected int age;
  protected static int[] vote=new int[5];

  Person() {
    autoId++;
    id = autoId;
  }

  void set(String name, String address, int age) {
    this.name = name;
    this.address = address;
    this.age = age;
  }

  void get() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("age: " + age);
    System.out.println("address: " + address);
  }
}

class Voter extends Person {
  private boolean voteState;

  void vote(int rollNo) {
    if (voteState == false) {
      if (age >= 18) {
        
            vote[rollNo-1]++;
            voteState=true;
            System.out.println("your vote is submitted successfully");
           
      } else System.out.println("you are not eligible to vote");
    } else System.out.println("You cant vote again");
  }
}

class Condidate extends Person {
  private int rollNo;
  private static int autoNo;

  Condidate() {
    autoNo++;
    rollNo = autoNo;
  }

  void get() {
    super.get();
    System.out.println("Roll NO: " + rollNo);
  }

  void getVote() {
        System.out.println("Your total votes are: " +vote[rollNo-1]);
  }
  void getPercentage(){
    int total=vote[0]+vote[1]+vote[2]+vote[3]+vote[4];
    float percent=vote[rollNo-1]*100/total;
    System.out.println("Dear "+name+" You got "+percent+"% of total votes");
  }
}

public class Test{
  public static void main(String[] args) {

    Voter p1 = new Voter();
    p1.set("Ahmad", "Kandahar", 18);
    Condidate Abdullah = new Condidate();
    Abdullah.set("Doctor Abdullah", "Panjsheer", 45);
    Voter Nazar = new Voter();
    Nazar.set("Nazar Mohammad", "Kandahar", 26);
    Condidate Ashraf_Ghani = new Condidate();
    Ashraf_Ghani.set("Ashraf Ghani", "Kabul", 50);
    Voter khan=new Voter();
    khan.set("Khan Mohammad","Logar",30);
    

    //Ashraf_Ghani.get();
    //Nazar.get();
   // Abdullah.get();
   Nazar.vote(2);
   //Nazar.vote(1);
  // khan.get();
   khan.vote(1);
   p1.vote(2);
   Abdullah.getVote();
   Ashraf_Ghani.getVote();
   Abdullah.getPercentage();
   Ashraf_Ghani.getPercentage();
  }
}

