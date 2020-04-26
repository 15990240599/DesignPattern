package structuralpattern.adapterpattern.logindemo.V2;

import structuralpattern.adapterpattern.logindemo.ResultMsg;

public class LoginForQqAdapter extends AbstraceAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQqAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)){
            return null;
        }
        return super.login(id, null);
    }
}
