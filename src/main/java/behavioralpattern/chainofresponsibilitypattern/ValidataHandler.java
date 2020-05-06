package behavioralpattern.chainofresponsibilitypattern;

import org.springframework.util.StringUtils;

/**
 * 非空校验
 */
public class ValidataHandler extends Handler {
    @Override
    public void doHandle(Member member) {
        if (StringUtils.isEmpty(member.getLoginName()) ||
                StringUtils.isEmpty(member.getLoginPass())){
            System.out.println("用户名和密码校验成功,可以往下执行");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");
        chain.doHandle(member);

    }
}
