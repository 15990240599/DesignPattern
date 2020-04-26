package structuralpattern.adapterpattern.logindemo.V2;

import structuralpattern.adapterpattern.logindemo.IPassportForThird;
import structuralpattern.adapterpattern.logindemo.ResultMsg;

public class PassportForThridAdapter implements IPassportForThird {
    @Override
    public ResultMsg loginForQq(String openId) {
        return processLogin(openId, LoginForQqAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return processLogin(openId, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return processLogin(phone, LoginForTelAdapter.class);
    }

    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz){
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(id, adapter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
