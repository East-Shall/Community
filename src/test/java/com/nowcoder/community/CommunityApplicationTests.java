package com.nowcoder.community;

import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.server.AlphaService;
import com.nowcoder.community.server.MailService;
import org.junit.jupiter.api.Test;
import org.openjdk.jol.info.ClassLayout;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes=CommunityApplication.class)//使用配置类
class CommunityApplicationTests implements ApplicationContextAware {

	/*@Test
	void contextLoads() {
	}*/
	private ApplicationContext applicationContext;//定义一个容器，在之后的方法中进行赋值操作
	@Autowired
	private MailService mailService;
	private String to="yangchen20174663@126.com";

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {//参数中返回的接口就是获得容器的地方
		this.applicationContext=applicationContext;
	}

//	@Test
//	public void testApplicationContext(){
//		//System.out.println(applicationContext);  测试成功
//
//		AlphaDao alphaDao=applicationContext.getBean(AlphaDao.class);//从容器当中去获取Bean(对象)
//		System.out.println(alphaDao.select());
//
//		alphaDao=applicationContext.getBean("first",AlphaDao.class);//通过名称来直接访问某一个实例
//		System.out.println(alphaDao.select());
//
//	}

//	@Test
//	public void testManagement(){//测试容器的调用流程
//		AlphaService alphaService=applicationContext.getBean(AlphaService.class);
//		System.out.println(alphaService);
//
//		AlphaService second=applicationContext.getBean(AlphaService.class);
//		System.out.println(second);//如果调整Scope的范围就可以做到多实例的情况
//	}

//	@Test
//	public void testBean(){//以上实际上均是一种主动获取实例的测试结果，并不是IOC中的依赖注入
//		SimpleDateFormat simpleDateFormat=applicationContext.getBean(SimpleDateFormat.class);
//		System.out.println(simpleDateFormat.format(new Date()));
//	}

	@Autowired
	private AlphaDao alphaDao;//依赖注入

//	@Test
//	public void testDi(){
//		System.out.println(alphaDao);
//	}

	//测试简单的邮件发送程序
	/*@Test
	public void testMail(){
		mailService.sendSimpleMail(to,"测试邮件","测试是否成功");
	}*/

	@Test
	public void testSpringVersion(){
		System.out.println(SpringVersion.getVersion());
	}
}

