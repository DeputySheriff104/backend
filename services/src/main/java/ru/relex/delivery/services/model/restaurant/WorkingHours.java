package ru.relex.delivery.services.model.restaurant;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.springframework.lang.Nullable;
import ru.relex.delivery.services.validation.ValidationErrorsRestaurant;

import javax.validation.constraints.NotNull;

@Value.Immutable
@JsonDeserialize(builder = ImmutableWorkingHours.Builder.class)
public interface WorkingHours {

  @Nullable
  @NotNull(message = ValidationErrorsRestaurant.RESTAURANT_START_WORK_DAY_IN_ADDRESS_MUST_BE_SET)
  String getStartWorkDay();

  @Nullable
  @NotNull(message = ValidationErrorsRestaurant.RESTAURANT_END_WORK_DAY_IN_ADDRESS_MUST_BE_SET)
  String getEndWorkDay();

}
