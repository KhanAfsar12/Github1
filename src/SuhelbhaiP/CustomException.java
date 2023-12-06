package SuhelbhaiP;

class UserException extends RuntimeException{

    public UserException(String message){
        super(message);
    }

}

public class CustomException {

    public static void main(String[] args) {

        int age = 80;

        if (age > 18 || age < 18) {
            try {
                throw new UserException("Age is not valid");
            }catch (UserException e){
                System.out.println(e.getLocalizedMessage());
            }
        } else {
            System.out.println("Age is Valid. User can enter.");
        }
    }

}
