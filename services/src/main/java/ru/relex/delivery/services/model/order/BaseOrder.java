package ru.relex.delivery.services.model.order;

import org.springframework.lang.Nullable;
import ru.relex.delivery.services.validation.ValidationErrorsOrder;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public interface BaseOrder {
    @Nullable
    @NotEmpty(message = ValidationErrorsOrder.LIST_OF_DISHES_MUST_BE_SET)
    List<String> getListOfDishes();

    @Valid
    @Nullable
    @NotNull(message = ValidationErrorsOrder.PERSONAL_INFO_MUST_BE_SET)
    UserInfo getUserInfo();


}