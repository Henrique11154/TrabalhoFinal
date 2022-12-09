package Excecao;

public class LoginFalha extends Exception{

    public LoginFalha() {
        super("Aconteceu um erro no login");
    }
}
