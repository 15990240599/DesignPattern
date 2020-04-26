package structuralpattern.adapterpattern.logindemo.V2;

import structuralpattern.adapterpattern.logindemo.ResultMsg;

public class LoginForTokenAdapter extends AbstraceAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String token, Object adapter) {
        if (!support(adapter)){
            return null;
        }
        return super.login(token, null);
    }
}
