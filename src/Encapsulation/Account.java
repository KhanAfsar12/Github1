package Encapsulation;
public class Account{
    private String name;
    private long Acc_no;
    private byte email;
    private float Amount;
    public void setAcc_no(long Acc_no){
        this.Acc_no = Acc_no;
    }
    public long getAcc_no(){
        return Acc_no;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(byte email){
        this.email = email;
    }
    public byte getEmail(){
        return email;
    }
    public void setAmount(float Amount) {
        this.Amount = Amount;
    }
    public float getAmount(){
        return Amount;
    }


}