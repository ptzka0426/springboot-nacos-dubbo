package com.lt.satoken;

import cn.dev33.satoken.stp.StpInterface;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author LT
 * @create 2021-04-01 10:18
 */
@Component    // 打开此注解，保证此类被springboot扫描，即可完成sa-token的自定义权限验证扩展
public class StpInterfaceImpl implements StpInterface {

    /**
     * 返回一个账号所拥有的权限码集合
     * 数据库角色和权限，RBAC未实现（暂定list模拟），调用server查询
     */
    @Override
    public List<String> getPermissionList(Object loginId, String loginKey) {
        List<String> lists = new ArrayList<String>();
        lists.add("10001");
        lists.add("10002");
        HashMap<String, List<String>> listHashMap = new HashMap<>();
        List<String> list = new ArrayList<String>();
        list.add("101");
        list.add("user-add");
        list.add("user-delete");
        list.add("user-update");
        list.add("user-get");
        list.add("article-get");
        listHashMap.put("10001", list);
        list = new ArrayList<>();
        list.add("user-add");
        listHashMap.put("10002", list);
        // list模拟数据库权限
        if (loginKey.equals("login")) {
            return listHashMap.get(loginId);
        }
        return null;
    }

    /**
     * 返回一个账号所拥有的角色标识集合
     */
    @Override
    public List<String> getRoleList(Object loginId, String loginKey) {
        List<String> lists = new ArrayList<String>();
        lists.add("10001");
        lists.add("10002");
        HashMap<String, List<String>> listHashMap = new HashMap<>();
        List<String> list = new ArrayList<String>();
        list.add("admin");
        list.add("user");
        list.add("super-admin");
        listHashMap.put("10001", list);
        list = new ArrayList<>();
        list.add("user");
        listHashMap.put("10002", list);
        // list模拟数据库角色
        System.out.println(loginKey);
        if (loginKey.equals("login")) {
            return listHashMap.get(loginId);
        }
        return null;
    }

}
