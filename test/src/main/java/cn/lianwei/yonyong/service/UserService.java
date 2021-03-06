package cn.lianwei.yonyong.service;

import cn.lianwei.yonyong.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {

    //查询usr表账号和密码 ---》验证登陆
    public User queryUser(User user);

    //查询表中是否已经存在该用户
    public User registerQueryUser(String tel);

    //注册用户
    public int registerUser(String tel,String password);
}
