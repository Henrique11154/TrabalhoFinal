package Controladoras;

import Excecao.LoginFalha;
import Excecao.LoginSucesso;
import Notificacao.Notificacao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import Excecao.LoginFalha;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button BotaoEntrar;

    @FXML
    private PasswordField senha;

    @FXML
    private TextField usuario;

    @FXML
    void RealizarEntrada(ActionEvent event){
        try {
            if (usuario.getText().equals("ADM") && senha.getText().equals("ADM")){
                    throw new LoginSucesso();
            }else {
                throw new LoginFalha();
            }
        }catch (LoginFalha lF){
            Notificacao.mostraNotificacao("Login invalido",
                    lF.getMessage(),
                    "Usuario ou senha incorretos",
                    Alert.AlertType.ERROR);
        }catch (LoginSucesso e){
            Notificacao.mostraNotificacao("Login realizado", "",
                    e.getMessage(), Alert.AlertType.INFORMATION);
        }
    }

}