package annotations.database;

import java.lang.annotation.*;

/*
 * 生成数据库表
 */
@Target(ElementType.TYPE)	// applies to classes only
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
	public String name() default "";
}
