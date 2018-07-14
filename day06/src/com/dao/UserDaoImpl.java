package com.dao;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import com.entity.User;
import com.util.DBconn;
 
public class UserDaoImpl implements UserDao{
	// 注册
	public boolean register(User user) {
		boolean flag = false;
		DBconn.init();
		int i =DBconn.addUpdDel("insert into user(username,password,sex,info) " +
				"values('"+user.getName()+"','"+user.getPwd()+"','"+user.getSex()+"','"+user.getInfo()+"')");
		if(i>0){
			flag = true;
		}
		DBconn.closeConn();
		return flag;
	}
	// 登录
    public boolean login(String name, String pwd) {
		boolean flag = false;
		try {
			    DBconn.init();
				ResultSet rs = DBconn.selectSql("select * from user where username='"+name+"' and password='"+pwd+"'");
				while(rs.next()){
					if(rs.getString("username").equals(name) && rs.getString("password").equals(pwd)){
						flag = true;
					}
				}
				DBconn.closeConn();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	public List<User> getUserAll() {
		List<User> list = new ArrayList<User>();
    	try {
		    DBconn.init();
			ResultSet rs = DBconn.selectSql("select * from user");
			while(rs.next()){
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("username"));
				user.setPwd(rs.getString("password"));
				user.setSex(rs.getString("sex"));
				user.setInfo(rs.getString("info"));
				list.add(user);
			}
			DBconn.closeConn();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	// 更新
	public boolean update(int id, String name, String pwd, String sex, String info) {
		boolean flag = false;
		DBconn.init();
		String sql ="update user set username ='"+name
				+"' , password ='"+pwd
				+"' , sex ='"+sex
				+"' , info ='"+info+"' where id = "+id;
		int i =DBconn.addUpdDel(sql);
		if(i>0){
			flag = true;
		}
		DBconn.closeConn();
		return flag;
	}
	// 删除
	public boolean delete(int id) {
		boolean flag = false;
		DBconn.init();
		String sql = "delete  from user where id="+id;
		int i =DBconn.addUpdDel(sql);
		if(i>0){
			flag = true;
		}
		DBconn.closeConn();
		return flag;
	}
}