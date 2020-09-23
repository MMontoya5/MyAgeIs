class Main {
  public static void main(String[] args) {
    int myAge= 15;
    int myBirthday= 108;
    int todaysDate= 921; 

    if(myBirthday == todaysDate)
    {
      System.out.print("I am "); 
      System.out.print(1 + myAge); 
    }
    else
    {
      System.out.print("I am " + myAge); 
    }
    System.out.println(" years old" );
  }
}