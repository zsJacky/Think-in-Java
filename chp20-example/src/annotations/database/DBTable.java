package annotations.database;

import java.lang.annotation.*;

/*
 * �������ݿ��
 */
@Target(ElementType.TYPE)	// applies to classes only
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
	public String name() default "";
}
