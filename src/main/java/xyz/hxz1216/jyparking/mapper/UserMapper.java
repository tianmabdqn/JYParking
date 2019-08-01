package xyz.hxz1216.jyparking.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import xyz.hxz1216.jyparking.model.User;

public interface UserMapper {

	/**
	 * 登录验证
	 * @param loginPassword
	 * @param loginName
	 * @return
	 */
	@Select("select * from user where loginName=#{loginName} and loginPassword =#{loginPassword}")
	public User loginVerificationByPwdAndLoginName(@Param("loginPassword") String loginPassword,@Param("loginName") String loginName);


	@Insert("insert into jyparking.user  ( userName, loginName,  loginPassword, phone, sex,  birth,  roleId,  email )" +
			"values ( #{userName}, #{loginName}, #{loginPassword}, #{ phone}, #{sex}, #{birth}, #{roleId},#{email})")
	public int registerNewUsers(User user);




}
