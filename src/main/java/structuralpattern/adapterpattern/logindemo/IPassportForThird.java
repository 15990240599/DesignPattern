package structuralpattern.adapterpattern.logindemo;

public interface IPassportForThird {

    ResultMsg loginForQq(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);

}
