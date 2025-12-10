 class Person {
private String name;
private String email;
private String phone;

      public Person(String name,String email,String phone){
          this.name=name;
          this.email=email;
          this.phone=phone;

      }

      public void setName(String name){
          this.name=name;
      }

      public void setEmail(String email){
          this.email=email;
      }

      public void setPhone(String phone){
          this.phone=phone;
      }

      public String getName(){
          return name;
      }

      public String getEmail(){
          return email;
      }

      public String getPhone(){
          return phone;
      }
}

class User extends Person{
    private String walletId;
    private double balance;

    public User(String name, String email, String phone, String walletId, double balance){
        super(name,email,phone);
        this.walletId=walletId;
        this.balance=balance;
    }

    public void setWalletId(String walletId){
        this.walletId=walletId;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public String getWalletId(){
        return walletId;
    }

    public double getBalance(){
        return balance;
    }

    public void addMoney(double amount){
        balance+=amount;
        System.out.println("Credited amount : "+amount);

        System.out.println("Total balance: "+balance);
    }

    public void payAmount(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Debited amount : "+amount);
            System.out.println("Total balance: "+balance);

        }
        else {
            System.out.println("Balance is insufficient");
        }
    }

}



class main{
    public static void main(String[] args) {
   User user=new User("Pavan","pavan@gmail.com","1234567","pm",1000);

      System.out.println("Name: "+user.getName());
      System.out.println("email : "+user.getEmail());
      System.out.println("Phone : "+user.getPhone());

      System.out.println("Wallet id: "+user.getWalletId());
      System.out.println("Balance : "+user.getBalance());

      //change phone

        user.setPhone("9380900690");
        System.out.println("Upated Phone : "+user.getPhone());

        //add money
        user.addMoney(500);

        //pay amount
        user.payAmount(300);

       //Updated balance
        System.out.println("Updated balance : "+user.getBalance());
    }
}
