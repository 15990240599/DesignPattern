package behavioralpattern.chainofresponsibilitypattern;

import org.springframework.util.StringUtils;

public class MemberService {
//-------------原始版本------------------
//    public void login(String loginName, String loginPass){
//        if (StringUtils.isEmpty(loginName) ||
//                StringUtils.isEmpty(loginPass)){
//            System.out.println("用户名和密码校验成功,可以往下执行");
//            return;
//        }
//        System.out.println("用户名和密码不为空，可以往下执行");
//
//        Member member = checkExists(loginName, loginPass);
//
//        if (member == null){
//            System.out.println("用户不存在");
//            return;
//        }
//
//        System.out.println("登录成功");
//
//        if (!"管理员".equals(member.getRoleName())){
//            System.out.println("宁不是管理员，没有操作权限");
//            return;
//        }
//
//        System.out.println("允许操作");
//    }
//
//    private Member checkExists(String loginName, String loginPass) {
//        Member member = new Member(loginName, loginPass);
//        member.setRoleName("管理员");
//        return member;
//    }
//-------------v1------------------
//    public void login(String loginName, String loginPass){
//
//        Handler validataHadler = new ValidataHandler();
//        Handler loginHandler = new LoginHandler();
//        Handler authHandler = new AuthHandler();
//
//        validataHadler.next(loginHandler);
//        loginHandler.next(authHandler);
//
//        validataHadler.doHandle(new Member(loginName, loginPass));
//    }
//-------------v2------------------
    public void login(String loginName, String loginPass){
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidataHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.build().doHandle(new Member(loginName,loginPass));
    }
}
