// sample of nested annotations

package annotations.database;

import java.lang.annotation.*;

public @interface Uniqueness {
	Constraints constrains() default @Constraints(unique=true);
}
