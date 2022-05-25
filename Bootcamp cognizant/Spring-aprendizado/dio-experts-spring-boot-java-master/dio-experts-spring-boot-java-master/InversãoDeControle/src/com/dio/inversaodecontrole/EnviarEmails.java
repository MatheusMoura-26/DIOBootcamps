package com.dio.inversaodecontrole;

public class EnviarEmails {


public EnviarEmails(String tipo, String endereco , String senha){

}

    public static EnviarEmails obterDadosEmails(){
        return new EnviarEmails("Sttt","Senha ", "Endereço");
    }

    public void retornar(String mensagem){
        System.out.println("E-mail enviado!");

    }


}
