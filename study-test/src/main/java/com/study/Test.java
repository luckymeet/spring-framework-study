package com.study;

import com.study.circulardependency.I;
import com.study.circulardependency.OrderService;
import com.study.circulardependency.ProductService;
import com.study.config.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) { // ①
		//初始化spring容器
//		1.javaConfig方式
//		AnnotationConfigApplicationContext ac  =
//				new AnnotationConfigApplicationContext();
//		ac.register(Appconfig.class);
		AnnotationConfigApplicationContext ac  =
				new AnnotationConfigApplicationContext(Appconfig.class);
//		-------------aop---------------------
//		ac.getBean(TargetClass.class).testAop();
//		如果继承接口，然后用的this切点类型为接口，那么下面实现类获取不到，会报错
		I orderService = (I) ac.getBean("orderService");
		orderService.testAop();
		ac.getBean(ProductService.class).test();
//		ac.getBean(OrderService.class).tetstAopWithArgs("cc");

//		ac.getBean(I.class).testAop();
//		ac.getBean(I.class).tetstAopWithArgs("cc");

//		默认jdk动态代理
//		I i = ac.getBean(I.class);
//		System.out.println(i);

//		-------------aop---------------------



//		关闭循环依赖，注意要在ac初始化之前
//		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) ac.getBeanFactory();
//		defaultListableBeanFactory.setAllowCircularReferences(false);
//		ac.refresh();
//		循环依赖
//		System.out.println(ac.getBean("orderService"));
//		ac.getBeanFactory().registerSingleton("xx",new Object());

//		cglib
//		System.out.println(ac.getBean(Appconfig.class));
//		System.out.println(ac.getBeanDefinition("getE").getClass());
//		System.out.println(ac.getBeanDefinition("e").getClass());

// 		AnnotationConfigApplicationContext ac  =
//				new AnnotationConfigApplicationContext();
//		ac.register(Appconfig.class);
//		ac.addBeanFactoryPostProcessor(new LubanBeanFactoryPostProcessor());
//		ac.refresh();
//		ac.scan("com.luban");
////		ac.start();
//		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
//		beanDefinition.setBeanClass(BeanService.class);
//		beanDefinition.setScope("singleton");
//		ac.registerBeanDefinition("xx",beanDefinition);
		// 真实BD
		// 模板 设置抽象
//		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
//		rootBeanDefinition.getPropertyValues().add("name","zilu");
////		rootBeanDefinition.setBeanClass(BeanService.class);
//		rootBeanDefinition.setAbstract(true);
//
//		ChildBeanDefinition childBeanDefinition = new ChildBeanDefinition("bs");
//		childBeanDefinition.setBeanClass(IndexService.class);
//
//		ac.registerBeanDefinition("bs",rootBeanDefinition);
//		ac.registerBeanDefinition("is",childBeanDefinition);
//		ac.refresh();
//		System.out.println(ac.getBean(MyLookup1.class));
//		System.out.println(ac.getBean(MyLookup1.class));
//		System.out.println(ac.getBean(MyLookup1.class).xx());
//		System.out.println(ac.getBean(MyLookup1.class).xx());

//		BeanDefinitionRegistry  AnnotationConfigRegistry
//		MyScanner scanner = new MyScanner(ac);
//		scanner.addIncludeFilter(new AnnotationTypeFilter(LubanMapper.class));
//		int scan = scanner.scan("com.luban");
//		System.out.println(scan);


//		System.out.println(ac.getBean(BeanService.class));
//		System.out.println(ac.getBean(IndexService.class).getName());
//		System.out.println(ac.getBean("xx"));
//		ac.getBean(LubanService.class).xx();
		//com.luban.services.BeanService@1c655221
//		System.out.println(ac.getBean("myFactoryBean"));
//		com.luban.factorybean.MyFactoryBean@58d25a40
//		System.out.println(ac.getBean("&myFactoryBean"));
		//com.luban.services.QueryDaoImpl@1b701da1
//		System.out.println(ac.getBean(QueryDao.class));


//		2.xml方式
//		ClassPathXmlApplicationContext cc =
//				new ClassPathXmlApplicationContext("classpath:spring.xml");
//				cc.getBean(LubanService.class).xx();
//		LubanService bean = classPathXmlApplicationContext.getBean(LubanService.class);
//		System.out.println(bean);
//		System.out.println(bean.getZlService());



//		DataSource dataSource = null;
////		DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
//		TransactionFactory transactionFactory =
//				new JdbcTransactionFactory();
//		Environment environment =
//				new Environment("development", transactionFactory, dataSource);
//		Configuration configuration = new Configuration(environment);
//		// DAO 一般是个接口
//		configuration.addMapper(UserDao.class);
////		configuration.addMapper(BlogMapper.class);
//		SqlSessionFactory sqlSessionFactory =
//				new SqlSessionFactoryBuilder().build(configuration);
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// 接口实现类 是个代理
//		UserDao mapper = sqlSession.getMapper(UserDao.class);

		// 能够得到一个实现了UserDao的代理对象
//		UserDao userDao = (UserDao) LubanFactory.getMapper(UserDao.class);
		// 完成数据库的查询功能
//		userDao.query();

//		UserService service = (UserService) LubanProxy.getInstance(UserService.class);

//		UserService target = new UserServiceImpl();
//		UserService proxy = new $ProxyLuban(target);
//		proxy.update("hello");
//		UserDao userDao = new UserDaoImpl();
//		UserDao proxy = (UserDao) LubanProxy.getInstance(userDao);
//		proxy.query("5");

//		UserDao target = new UserDaoImpl();
//		UserDao proxy = new $ProxyLuban(target);
//		proxy.query();

//		QueryDao target = new QueryDaoImpl();
//		InvocationHandler invocationHandler = new MyInvocationHandler(target);
//		QueryDao proxy = (QueryDao) LubanProxy.getInstance(target
//				,invocationHandler
//		);
//		proxy.query();


//		UserDao o = (UserDao) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{UserDao.class}, new MyInvocationHandler());
//		o.query("10");

	}
}
