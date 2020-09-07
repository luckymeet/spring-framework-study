package com.study.postprocessors;

import com.study.services.UserServiceImpl;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author yuminjun yuminjun@lexiangbao.com
 * @version 1.00
 * @date 2020/9/7 11:41
 * @record <pre>
 * version  author      date      desc
 * -------------------------------------------------
 * 1.00     yuminjun    2020/9/7   新建
 * -------------------------------------------------
 * </pre>
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(EnableUserService.class.getName());
		boolean value = (boolean) annotationAttributes.get("value");
		if (value) {
			System.out.println("MyImportSelector is invoke");
			return new String[]{UserServiceImpl.class.getName()};
		}
		return null;
	}
}
