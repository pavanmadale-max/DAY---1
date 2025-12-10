class normalUser {
protected double balance;


public normalUser(double balance){
    this.balance=balance;

}

public double  calculateFee(){
   return balance*0.02;
}

}

class PremiumUser extends normalUser{

public PremiumUser(double balance) {
    super(balance);

}

public double calculateFee() {
    return balance * 0.01;
}
    }


class Demo{
    public static void main(String[] args) {
        PremiumUser puser=new PremiumUser(1000.0);
        System.out.println(puser.calculateFee());

    }
}