
class Games {
  public void gametype() {
    System.out.println("The different types of games");
  }
}

class Cricket extends Games {
  public void gametype() {
    System.out.println("Cricket - Game played using bat and ball");
  }
}

class Football extends Games {
  public void gametype() {
    System.out.println("Football - Game played using foot and ball");
  }
}

class PolymorphismEx {
  public static void main(String[] args) {
    Games myGames = new Games();
    Games myCricket = new Cricket();
    Games myFootball = new Football();
        
    myGames.gametype();
    myCricket.gametype();
    myFootball.gametype();
  }
}
