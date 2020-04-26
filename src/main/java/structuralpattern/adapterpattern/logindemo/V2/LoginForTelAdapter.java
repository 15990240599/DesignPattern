package structuralpattern.adapterpattern.logindemo.V2;

import structuralpattern.adapterpattern.logindemo.ResultMsg;

public class LoginForTelAdapter extends AbstraceAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String phone, Object adapter) {
        if (!support(adapter)){
            return null;
        }
        return super.login(phone, null);
    }
}
