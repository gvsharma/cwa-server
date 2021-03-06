

package app.coronawarn.server.common.persistence.domain.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = ValidCountriesValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidCountries {

  /**
   * Error message.
   *
   * @return the error message
   */
  String message() default "Countries must conform to ISO 3116.";

  /**
   * Groups.
   *
   * @return
   */
  Class<?>[] groups() default {};

  /**
   * Payload.
   *
   * @return
   */
  Class<? extends Payload>[] payload() default {};
}
